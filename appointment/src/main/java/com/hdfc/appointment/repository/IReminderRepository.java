package com.hdfc.appointment.repository;

import com.hdfc.appointment.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReminderRepository extends JpaRepository<Reminder, Integer> {
}
