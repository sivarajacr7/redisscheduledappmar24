package com.payitchi1.carredisapplnapr324.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private CarSerivce carService;

    public ScheduledTask(CarSerivce carService) {
        this.carService = carService;
    }

    @Scheduled(cron = "0 1 * * * *")
    public void execute(){
        carService.deleteAll();
    }
}
