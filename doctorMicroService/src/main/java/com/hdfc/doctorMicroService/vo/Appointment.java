package com.hdfc.doctorMicroService.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;

    private String status;
}
