package com.hdfc.doctorMicroService.service;

import com.hdfc.doctorMicroService.dto.DoctorDto;
import com.hdfc.doctorMicroService.entity.Doctor;
import com.hdfc.doctorMicroService.repository.IDoctorRepository;
import com.hdfc.doctorMicroService.vo.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class DoctorService implements IDoctorService{

    @Autowired
    IDoctorRepository repo;

    @Autowired
    RestTemplate restTemplate;
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

    @Override
    public Doctor getDoctorWithAppointments(int doctorId) {
        Doctor doctor= repo.findById(doctorId).orElse(null);

        List<Appointment> appointmentList=restTemplate.getForObject("http://localhost:6063/api/appointment/microservice/getting/appointments-by-doctorId/"+doctorId, List.class);

        doctor.setAppointmentList(appointmentList);

        return doctor;


    }

    @Override
    public List<Doctor> findByDoctorSpecialization(String specialization) {
        return repo.findBySpecialization(specialization);
    }
}
