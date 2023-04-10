package com.hdfc.doctorMicroService.repository;

import com.hdfc.doctorMicroService.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IScheduleRepository extends JpaRepository<Schedule,Integer> {


}
