package com.hdfc.doctorMicroService.service;

import com.hdfc.doctorMicroService.dto.DoctorDto;
import com.hdfc.doctorMicroService.entity.Doctor;
import com.hdfc.doctorMicroService.repository.IDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService implements IDoctorService{

    @Autowired
    IDoctorRepository repo;
    @Override
    public Doctor addDoctorInfo(DoctorDto doctorDto) {

        Doctor doctor=new Doctor();
        doctor.setDoctorId(doctorDto.getDoctorId());
        doctor.setFirstName(doctorDto.getFirstName());
        doctor.setLastName(doctorDto.getLastName());
        doctor.setContactNumber(doctorDto.getContactNumber());
        doctor.setSpecialization(doctorDto.getSpecialization());
        return repo.save(doctor);
    }

    @Override
    public Doctor updateDoctorInfo(DoctorDto doctorDto) {
        Doctor doctor=new Doctor();
        doctor.setDoctorId(doctorDto.getDoctorId());
        doctor.setFirstName(doctorDto.getFirstName());
        doctor.setLastName(doctorDto.getLastName());
        doctor.setContactNumber(doctorDto.getContactNumber());
        doctor.setSpecialization(doctorDto.getSpecialization());
        return repo.save(doctor);
    }

    @Override
    public void deleteDoctorInfo(int doctorId) {

        repo.deleteById(doctorId);

    }
}
