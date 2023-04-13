package com.hdfc.appointment.entity;



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

    private String email;

    private String status;

    //@OneToOne(mappedBy = "appointment",cascade = CascadeType.ALL)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="reminder_id")
    private Reminder reminder;


}
