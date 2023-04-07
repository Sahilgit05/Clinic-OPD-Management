package com.hdfc.doctorMicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Doctor_Info")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int doctorId;
    private String firstName;

    private String lastName;
    private String contactNumber;
    private String specialization;
}
