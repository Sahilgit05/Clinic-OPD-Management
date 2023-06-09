package com.hdfc.doctorMicroService.repository;

import com.hdfc.doctorMicroService.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

    public List<Doctor> findBySpecialization(String specialization);
}
