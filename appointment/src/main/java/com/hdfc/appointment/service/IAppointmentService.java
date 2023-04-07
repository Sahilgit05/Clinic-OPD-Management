package com.hdfc.appointment.service;

import com.hdfc.appointment.dto.AppointmentDto;
import com.hdfc.appointment.entity.Appointment;

public interface IAppointmentService {

    public Appointment bookAppointment(AppointmentDto appointmentDto);
    public Appointment updateAppointment(AppointmentDto appointmentDto);

    public void deleteAppointment(int appointmentId);
}
