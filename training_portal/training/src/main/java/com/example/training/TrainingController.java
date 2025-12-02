package com.example.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {

    @Autowired
    private TrainingService service;

    @PostMapping("/assignMandatory")
    public Training assignMandatory(@RequestParam Integer employeeId) {
        return service.assignMandatoryTraining(employeeId);
    }

    @GetMapping("/{employeeId}")
    public List<Training> getTraining(@PathVariable Integer employeeId) {
        return service.getTrainingByEmployee(employeeId);
    }
}
