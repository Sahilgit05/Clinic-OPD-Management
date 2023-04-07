package com.hdfc.patientMicroService.repository;

import com.hdfc.patientMicroService.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
}
