package com.hdfc.appointment.controller;

import com.hdfc.appointment.dto.AppointmentDto;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/appointment/microservice")
public class AppointmentRestController {
    @Autowired
    IAppointmentService service;
    @PostMapping("/booking/appointment")
    public Appointment bookAppointment(@RequestBody AppointmentDto appointmentDto){

        return service.bookAppointment(appointmentDto);

    }

    @PutMapping("update/appointment")
    public Appointment updateAppointment(@RequestBody AppointmentDto appointmentDto){

        return service.updateAppointment(appointmentDto);
    }

    @DeleteMapping("delete-by-id/{appointmentId}")
    public ResponseEntity<String> deleteAppointment(@PathVariable int  appointmentId){

        service.deleteAppointment(appointmentId);

        return new ResponseEntity<String>("Appointment Record with ID="+" "+appointmentId+" "+"Deleted", HttpStatus.ACCEPTED);
    }
}
