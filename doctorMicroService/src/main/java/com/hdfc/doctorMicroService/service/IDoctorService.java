package com.hdfc.doctorMicroService.service;

import com.hdfc.doctorMicroService.dto.DoctorDto;
import com.hdfc.doctorMicroService.entity.Doctor;

import java.util.List;

public interface IDoctorService {

    public Doctor addDoctorInfo(DoctorDto doctorDto);

    public Doctor updateDoctorInfo(DoctorDto doctorDto);

    public void deleteDoctorInfo(int doctorId);

   // public Doctor getDoctorWithAppointments(int doctorId);

    public List<Doctor> findByDoctorSpecialization(String specialization);
}
