package com.hdfc.doctorMicroService.service;

import com.hdfc.doctorMicroService.dto.DoctorDto;
import com.hdfc.doctorMicroService.entity.Doctor;

public interface IDoctorService {

    public Doctor addDoctorInfo(DoctorDto doctorDto);

    public Doctor updateDoctorInfo(DoctorDto doctorDto);

    public void deleteDoctorInfo(int doctorId);
}
