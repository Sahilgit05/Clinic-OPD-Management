package com.hdfc.doctorMicroService.controller;

import com.hdfc.doctorMicroService.dto.DoctorDto;
import com.hdfc.doctorMicroService.entity.Doctor;
import com.hdfc.doctorMicroService.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctor/microservice")
public class DoctorRestController {
    @Autowired
    IDoctorService service;

    @PostMapping("/add")
    public Doctor addDoctorDetails(@RequestBody DoctorDto doctorDto){

        return service.addDoctorInfo(doctorDto);

    }

    @PutMapping("/update")
    public Doctor updateDoctorDetails(@RequestBody DoctorDto doctorDto){

        return service.updateDoctorInfo(doctorDto);

    }

    @DeleteMapping("delete-by-id/{doctorId}")
    public ResponseEntity<String> deleteDoctorInfo(@PathVariable int doctorId){

        service.deleteDoctorInfo(doctorId);

        return new ResponseEntity<String>("Doctor Record with ID="+" "+doctorId+" "+"Deleted", HttpStatus.ACCEPTED);

    }
}
