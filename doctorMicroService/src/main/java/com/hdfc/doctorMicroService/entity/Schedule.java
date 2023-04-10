package com.hdfc.doctorMicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Doctor_Schedule")
public class Schedule {
    @Id
    private int scheduleId;

    @Column(name = "doctor_id")
    private int doctorId;

    private String dayOfWeek;
    private String timeSlot;
    private String availability;

}
