package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "training-service", url = "http://localhost:8086")
public interface TrainingClient {

    @PostMapping("/api/trainings/assignMandatory")
    TrainingResponse assignTraining(@RequestParam Integer employeeId);

}