package com.timyidu.scheduledTasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author qiuhang
 * @date 14:59 2019/3/14
 * describe:
 */
@Component
public class ScheduledTasks {
    @Scheduled(fixedRate = 1000 )
    public void test(){
        System.out.println("定时任务");
    }
}
