package com.sap.icn.traffic.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by I321761 on 2017/7/3.
 */
@Component
public class TaxiKafkaStream {
    @Scheduled(initialDelay = 5000L)
    public void startKafkaStream() {

    }
}
