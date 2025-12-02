package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TrainingClient trainingClient;

    public Employee addEmployee(Employee employee) {

        Employee saved = employeeRepository.save(employee);

        TrainingResponse training = trainingClient.assignTraining(saved.getId());
        saved.setOnboardingStatus("Training Assigned"); 
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

}
