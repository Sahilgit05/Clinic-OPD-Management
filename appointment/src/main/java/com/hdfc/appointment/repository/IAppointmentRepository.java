package com.hdfc.appointment.repository;

import com.hdfc.appointment.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {

    public List<Appointment> findByDoctorId(int doctorId);
}
