package com.hdfc.appointment.service;

import com.hdfc.appointment.dto.AppointmentDto;
import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.entity.Reminder;

import java.util.List;

public interface IAppointmentService {

    public Appointment bookAppointment(AppointmentDto appointmentDto);
    public Appointment updateAppointment(AppointmentDto appointmentDto);

    public void deleteAppointment(int appointmentId);

    public List<Appointment> findByDoctorId(int doctorId);

    public List<Appointment> findByDate(String date);

    public boolean existById(int appointmentId);






}
