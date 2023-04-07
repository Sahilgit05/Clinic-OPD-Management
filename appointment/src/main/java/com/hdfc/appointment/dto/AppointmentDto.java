package com.hdfc.appointment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentDto {

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String date;
    private String time;

    private String status;
}
