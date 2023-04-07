package com.hdfc.patientMicroService.service;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;
import com.hdfc.patientMicroService.repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatientService{
    @Autowired
    IPatientRepository repo;
    @Override
    public Patient registerPatient(PatientDto patientDto) {

        Patient patient=new Patient();
        patient.setPatientId(patientDto.getPatientId());
        patient.setFirstName(patientDto.getFirstName());
        patient.setLastName(patientDto.getLastName());
        patient.setContactNumber(patientDto.getContactNumber());
        patient.setMedicalHistory(patientDto.getMedicalHistory());
        patient.setInsuranceDetails(patientDto.getInsuranceDetails());
        return repo.save(patient);
    }

    @Override
    public Patient updatePatientInfo(PatientDto patientDto) {

        Patient patient=new Patient();
        patient.setPatientId(patientDto.getPatientId());
        patient.setFirstName(patientDto.getFirstName());
        patient.setLastName(patientDto.getLastName());
        patient.setContactNumber(patientDto.getContactNumber());
        patient.setMedicalHistory(patientDto.getMedicalHistory());
        patient.setInsuranceDetails(patientDto.getInsuranceDetails());
        return repo.save(patient);
    }

    @Override
    public void deletePatientInfo(int patientId) {

        repo.deleteById(patientId);

    }
}
