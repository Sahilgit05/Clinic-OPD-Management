package com.hdfc.patientMicroService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {

    private int patientId;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String medicalHistory;
    private String insuranceDetails;
}
