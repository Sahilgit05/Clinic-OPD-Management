package com.hdfc.doctorMicroService.dto;

import com.hdfc.doctorMicroService.entity.Schedule;
import com.hdfc.doctorMicroService.vo.Appointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {

    private int doctorId;
    private String firstName;

    private String lastName;
    private String contactNumber;
    private String specialization;

    private List<Schedule> schedule;

   // private List<Appointment> appointmentList;
}
