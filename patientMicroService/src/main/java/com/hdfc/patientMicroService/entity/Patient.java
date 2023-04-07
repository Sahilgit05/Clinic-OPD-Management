package com.hdfc.patientMicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Patient_Info")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int patientId;
    private String firstName;

    private String lastName;
    private String contactNumber;
    private String medicalHistory;
    private String insuranceDetails;

}
