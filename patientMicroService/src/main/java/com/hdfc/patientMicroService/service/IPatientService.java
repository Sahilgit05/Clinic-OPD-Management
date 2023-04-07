package com.hdfc.patientMicroService.service;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;

public interface IPatientService {

    public Patient registerPatient(PatientDto patientDto);

    public Patient updatePatientInfo(PatientDto patientDto);

    public void deletePatientInfo(int patientId);
}
