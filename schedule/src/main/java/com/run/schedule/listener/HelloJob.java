package com.run.schedule.listener;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello Quartz!");

//        throw new JobExecutionException("Testing Exception");
    }
}
