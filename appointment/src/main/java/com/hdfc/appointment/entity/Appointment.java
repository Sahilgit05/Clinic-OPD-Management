package com.hdfc.appointment.entity;

import com.hdfc.appointment.vo.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;

    private String status;
    @Transient
    private Patient patient;


}
