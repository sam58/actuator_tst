package com.raos.sam58.actuator_test.schedulers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FixedTimeScheduler {

    @Scheduled(fixedDelay = 5000)// фиксированно раз в час(3600 секунд). Нужды делать в настройках не вижу.
    public void sendAddTRMMailNotificationByTemplateAndJournals(){
        log.info("five sec schedule start");

    }

}
