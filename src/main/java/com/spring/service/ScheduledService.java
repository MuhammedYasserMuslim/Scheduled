package com.spring.service;

import com.spring.model.Person;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ScheduledService {
    /**
     * Run every two second
     */
    @Scheduled(fixedRate = 2000)
    public void print() {
        log.info("scheduled fixedRate");
    }

}
