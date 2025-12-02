package com.example.demo;

import lombok.Data;

@Data
public class TrainingResponse {
    private Integer id;
    private Integer employeeId;
    private String trainingName;
    private boolean mandatory;
    private boolean completed;
}
