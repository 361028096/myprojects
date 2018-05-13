package com.run.mvc.aop;

import com.alibaba.fastjson.JSON;

import com.run.mvc.constant.Const;
import com.run.mvc.vo.ResponseVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ControllerAop {

    private static final Logger LOG = LoggerFactory.getLogger(ControllerAop.class);

    public ResponseVo<?> handlerControllerMethod(ProceedingJoinPoint point){
        long startTime = System.currentTimeMillis();

        ResponseVo<?> result;

        try {
            Signature signature = point.getSignature();
            Object[] args = point.getArgs();
            LOG.info(signature +"的入参是："+ JSON.toJSONString(args));
            result = (ResponseVo<?>) point.proceed();
        } catch (Throwable e) {
            result = handlerException(point, e);
        }

        LOG.info("aop use time:" + (System.currentTimeMillis() - startTime));
        return result;
    }

    private ResponseVo<?> handlerException(ProceedingJoinPoint pjp, Throwable e) {
        ResponseVo<?> result = new ResponseVo<>();

        // 已知异常
        if (e instanceof RuntimeException) {
            result.setMsg(e.getLocalizedMessage());
            result.setCode(Const.RESPONSE_ERR);
        } else if (e instanceof Exception) {
            result.setMsg("系统异常");
            result.setCode(Const.RESPONSE_ERR);
        }
        return result;
    }

    public void beforeMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        LOG.info("这个是调用前切面方法:\n--------------beforeMethod-------------");
    }

    public void afterMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        LOG.info("这个是调用后切面方法:\n--------------afterMethod-------------");

    }

    public void returnMethod(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        LOG.info("这个是返回切面方法:\n--------------returnMethod-------------");

    }

    public void throwableMethod(JoinPoint joinPoint, Throwable tx){
        Signature signature = joinPoint.getSignature();
        LOG.error("发生了异常"+tx.getMessage());
        LOG.info("这个是异常切面方法:\n--------------throwableMethod-------------");
    }
}
