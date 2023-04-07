package com.hdfc.patientMicroService.controller;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;
import com.hdfc.patientMicroService.service.IPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("delete-by-id/{patientId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int patientId){

        service.deletePatientInfo(patientId);

        return new ResponseEntity<String>("Patient Record with ID="+" "+patientId+" "+"Deleted", HttpStatus.ACCEPTED);

    }
}
