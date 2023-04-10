package com.hdfc.patientMicroService.service;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;
import com.hdfc.patientMicroService.vo.Appointment;
import com.hdfc.patientMicroService.vo.Doctor;

import java.util.List;

public interface IPatientService {

    public Patient registerPatient(PatientDto patientDto);

    public Patient updatePatientInfo(PatientDto patientDto);

    public void deletePatientInfo(int patientId);

    public List<Doctor> getDoctorWithSpecialization(String Spespecialization);

    public Appointment bookingAppointment(Appointment appointment);
}
