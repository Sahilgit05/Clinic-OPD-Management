package com.hdfc.patientMicroService.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    private int doctorId;
    private String firstName;

    private String lastName;
    private String contactNumber;
    private String specialization;

}
