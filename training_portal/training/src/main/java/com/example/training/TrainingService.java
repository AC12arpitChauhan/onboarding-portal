package com.example.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingService {
    
    @Autowired
    private TrainingRepository repo;

    public Training assignMandatoryTraining(Integer employeeId) {
        Training training = new Training(
                null,
                employeeId,
                "Mandatory Onboarding Training",
                true,
                false
        );
        return repo.save(training);
    }

    public List<Training> getTrainingByEmployee(Integer employeeId) {
        return repo.findByEmployeeId(employeeId);
    }
}
