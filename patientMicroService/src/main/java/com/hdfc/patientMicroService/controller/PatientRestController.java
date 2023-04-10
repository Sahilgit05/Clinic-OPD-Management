package com.hdfc.patientMicroService.controller;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;
import com.hdfc.patientMicroService.service.IPatientService;
import com.hdfc.patientMicroService.vo.Appointment;
import com.hdfc.patientMicroService.vo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient/microservice")
public class PatientRestController {
    @Autowired
    IPatientService service;

    @PostMapping("/register")
    public Patient registerPatientDetails(@RequestBody PatientDto patientDto){

        return service.registerPatient(patientDto);

    }

    @PutMapping("/update")
    public Patient updatePatientDetails(@RequestBody PatientDto patientDto){

        return service.updatePatientInfo(patientDto);

    }

    @DeleteMapping("/delete-by-id/{patientId}")
    public ResponseEntity<String> deletePatientInfo(@PathVariable int patientId){

        service.deletePatientInfo(patientId);

        return new ResponseEntity<String>("Patient Record with ID="+" "+patientId+" "+"Deleted", HttpStatus.ACCEPTED);

    }

    //Getting Doctor Information before Booking An Appointment with the Specific specialization.
    @GetMapping("/get-DoctorBY-specialization/{specialization}")
    public List<Doctor> getDoctorWithSpecialization(@PathVariable String specialization){
       return  service.getDoctorWithSpecialization(specialization);
    }

    //Booking An Appointment By the Patient.
    @PostMapping("/Booking/Appointment")
    public Appointment bookingAppointment(@RequestBody Appointment appointment){

        return service.bookingAppointment(appointment);
    }
}
