package com.run.schedule.listener;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
public class CronTriggerExample {
    public static void main(String[] args) throws Exception {
        JobKey jobKey = new JobKey("heweiJobName", "group1");
//        JobKey jobKey2 = new JobKey("heweiJobName2", "group1");
        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity(jobKey).build();
//        JobDetail job2 = JobBuilder.newJob(SecondJob.class)
//                .withIdentity(jobKey2).build();

        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("heweiTriggerName", "group1")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
                .build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();

        //Listener attached to jobKey
        scheduler.getListenerManager().addJobListener(
                new HelloJobListener(), KeyMatcher.keyEquals(jobKey)
        );

        scheduler.start();
        scheduler.scheduleJob(job, trigger);
//        scheduler.scheduleJob(job2,trigger);
    }
}
