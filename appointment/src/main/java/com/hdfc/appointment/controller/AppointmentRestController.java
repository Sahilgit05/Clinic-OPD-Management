package com.hdfc.appointment.controller;

import com.hdfc.appointment.dto.AppointmentDto;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.exceptions.AppointmentWithDateNotFound;
import com.hdfc.appointment.exceptions.AppointmentWithDoctorIdNotFound;
import com.hdfc.appointment.exceptions.AppointmentWithIdNotFound;
import com.hdfc.appointment.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointment/microservice")
public class AppointmentRestController {
    @Autowired
    IAppointmentService service;
    @PostMapping("/booking/appointment")
    public Appointment bookAppointment(@RequestBody AppointmentDto appointmentDto){

        return service.bookAppointment(appointmentDto);

    }

    @PutMapping("/update/appointment")
    public Appointment updateAppointment(@RequestBody AppointmentDto appointmentDto){

        return service.updateAppointment(appointmentDto);
    }

    @DeleteMapping("/delete-by-id/{appointmentId}")
    public ResponseEntity<String> deleteAppointment(@PathVariable int  appointmentId) throws AppointmentWithIdNotFound {
        if(service.existById(appointmentId)){
        service.deleteAppointment(appointmentId);

        return new ResponseEntity<String>("Appointment Record with ID="+" "+appointmentId+" "+"Deleted", HttpStatus.ACCEPTED);
    }else{
            throw new AppointmentWithIdNotFound();
        }
    }

    @GetMapping("/getting/appointments-by-doctorId/{doctorId}")
    public List<Appointment> getAppointmentsForDoctor(@PathVariable int doctorId) throws AppointmentWithDoctorIdNotFound {

        List<Appointment> list=service.findByDoctorId(doctorId);

        if(list.size()==0){
            throw new AppointmentWithDoctorIdNotFound();
        }

        return list;

    }

    @GetMapping("/getting/appointments-by-date/{date}")
    public List<Appointment> getAppointmentsForDate(@PathVariable String date) throws AppointmentWithDateNotFound {

        List<Appointment> list=service.findByDate(date);

        if(list.size()==0){
            throw new AppointmentWithDateNotFound();
        }

        return list;
        
    }
}
