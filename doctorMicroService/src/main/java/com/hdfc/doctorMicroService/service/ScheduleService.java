package com.hdfc.doctorMicroService.service;

import com.hdfc.doctorMicroService.dto.ScheduleDto;
import com.hdfc.doctorMicroService.entity.Schedule;
import com.hdfc.doctorMicroService.repository.IScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService implements IScheduleService{

    @Autowired
    IScheduleRepository repo;


    @Override
    public Schedule addSchedule(ScheduleDto scheduleDto) {
        Schedule schedule=new Schedule();
        schedule.setScheduleId(scheduleDto.getScheduleId());
        schedule.setAvailability(scheduleDto.getAvailability());
        schedule.setDayOfWeek(scheduleDto.getDayOfWeek());
        schedule.setTimeSlot(scheduleDto.getTimeSlot());
        schedule.setDoctorId(scheduleDto.getDoctorId());
        return repo.save(schedule);
    }
}
