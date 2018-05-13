package com.run.schedule.firstDemo;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author hewei
 * @description TODO
 * @date 2018/5/10
 */
public class CronTriggerExample {
    public static void main(String[] args) throws Exception {
        JobDetail job = JobBuilder.newJob(FirstJob.class).withIdentity("jobName","jobKey").build();

        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("triggerName","triggerKey")
                .withSchedule(
                        CronScheduleBuilder.cronSchedule("0/5 * * * * ?")
                ).build();

        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(job,trigger);
    }
}
