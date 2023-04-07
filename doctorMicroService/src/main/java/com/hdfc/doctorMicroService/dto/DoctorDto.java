package com.hdfc.doctorMicroService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {

    private int doctorId;
    private String firstName;

    private String lastName;
    private String contactNumber;
    private String specialization;
}
