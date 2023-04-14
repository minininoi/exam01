package org.koreait.Scheduler;

import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log
public class LoggingScheduler {
    @Scheduled(cron = "*/5 * * * * *")//(cron = "0 0 1 * * *")//새벽 1시 실행
    public void logging(){
        log.info("5초마다 실행");
    }
}
