package com.run.schedule.firstDemo;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
public class FirstJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello quartz");
    }
}
