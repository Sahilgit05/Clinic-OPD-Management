package com.hdfc.appointment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reminderId;
    private  String reminderType;
//    @OneToOne()
//    @JoinColumn(name="appointment_id")
//    @JsonIgnore
    //private Appointment appointment;
}
