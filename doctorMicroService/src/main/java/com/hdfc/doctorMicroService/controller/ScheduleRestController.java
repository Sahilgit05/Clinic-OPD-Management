package com.hdfc.doctorMicroService.controller;

import com.hdfc.doctorMicroService.dto.ScheduleDto;
import com.hdfc.doctorMicroService.entity.Schedule;
import com.hdfc.doctorMicroService.service.IScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schedule/microservice")
public class ScheduleRestController {
    @Autowired
    IScheduleService service;
    @PostMapping("/add-schedule")
    public Schedule addScheduleForDoctorId(@RequestBody ScheduleDto scheduleDto){
        return service.addSchedule(scheduleDto);
    }
}
