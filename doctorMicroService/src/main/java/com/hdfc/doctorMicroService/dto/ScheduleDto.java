package com.hdfc.doctorMicroService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDto {

    private int scheduleId;
    private int doctorId;

    private String dayOfWeek;
    private String timeSlot;
    private String availability;
}
