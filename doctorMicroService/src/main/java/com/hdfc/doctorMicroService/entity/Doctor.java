package com.hdfc.doctorMicroService.entity;

import com.hdfc.doctorMicroService.vo.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany
    @JoinColumn(name="doctor_id")
    private List<Schedule> schedule;
    @Transient
    private List<Appointment> appointmentList;
}
