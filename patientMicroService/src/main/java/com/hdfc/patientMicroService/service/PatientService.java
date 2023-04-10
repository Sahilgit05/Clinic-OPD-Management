package com.hdfc.patientMicroService.service;

import com.hdfc.patientMicroService.dto.PatientDto;
import com.hdfc.patientMicroService.entity.Patient;
import com.hdfc.patientMicroService.repository.IPatientRepository;
import com.hdfc.patientMicroService.vo.Appointment;
import com.hdfc.patientMicroService.vo.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PatientService implements IPatientService{
    @Autowired
    IPatientRepository repo;


    @Autowired
    RestTemplate restTemplate;


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

    @Override
    public List<Doctor> getDoctorWithSpecialization(String specialization) {
        List<Doctor> doctorList=restTemplate.getForObject("http://localhost:6062/api/doctor/microservice/get-doctor-with-specialization/"+specialization, List.class);

        return doctorList;
    }

    @Override
    public Appointment bookingAppointment(Appointment appointment) {
        Appointment appointment1=restTemplate.postForObject("http://localhost:6063/api/appointment/microservice/booking/appointment",appointment,Appointment.class);

        return appointment1;
    }
}
