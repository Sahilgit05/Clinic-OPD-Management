package com.hdfc.appointment.service;

import com.hdfc.appointment.dto.AppointmentDto;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.repository.IAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements IAppointmentService{
    @Autowired
    IAppointmentRepository repo;
    @Override
    public Appointment bookAppointment(AppointmentDto appointmentDto) {
        Appointment appointment=new Appointment();
        appointment.setAppointmentId(appointmentDto.getAppointmentId());
        appointment.setPatientId(appointmentDto.getPatientId());
        appointment.setDoctorId(appointmentDto.getDoctorId());
        appointment.setDate(appointmentDto.getDate());
        appointment.setTime(appointmentDto.getTime());
        appointment.setStatus(appointmentDto.getStatus());
        return repo.save(appointment);
    }

    @Override
    public Appointment updateAppointment(AppointmentDto appointmentDto) {
        Appointment appointment=new Appointment();
        appointment.setAppointmentId(appointmentDto.getAppointmentId());
        appointment.setPatientId(appointmentDto.getPatientId());
        appointment.setDoctorId(appointmentDto.getDoctorId());
        appointment.setDate(appointmentDto.getDate());
        appointment.setTime(appointmentDto.getTime());
        appointment.setStatus(appointmentDto.getStatus());
        return repo.save(appointment);
    }

    @Override
    public void deleteAppointment(int appointmentId) {

        repo.deleteById(appointmentId);

    }

    @Override
    public List<Appointment> findByDoctorId(int doctorId) {
        return repo.findByDoctorId(doctorId);
    }

}
