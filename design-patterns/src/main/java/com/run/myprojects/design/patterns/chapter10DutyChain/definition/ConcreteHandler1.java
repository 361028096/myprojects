package com.run.myprojects.design.patterns.chapter10DutyChain.definition;

/**
 * 具体处理者
 *
 * @author hewei
 */
public class ConcreteHandler1 extends Handler {

    /**
     * 定义自己的处理逻辑
     * @param request
     * @return
     */
    @Override
    protected Response echo(Request request) {
        // 完成处理逻辑
        return null;
    }
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

}
