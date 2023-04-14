package com.hdfc.appointment.globalExceptions;

import com.hdfc.appointment.exceptions.AppointmentWithDateNotFound;
import com.hdfc.appointment.exceptions.AppointmentWithDoctorIdNotFound;
import com.hdfc.appointment.exceptions.AppointmentWithIdNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlers {
    @ExceptionHandler(AppointmentWithIdNotFound.class)
    public ResponseEntity<String> appointmentWithIdNotFoundHandler(){
      return new ResponseEntity<String>("Appointment With ID not Found, Please Enter valid Appointment Id.", HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(AppointmentWithDoctorIdNotFound.class)
    public ResponseEntity<String> appointmentWithDoctorIdNotFoundHandler(){
        return new ResponseEntity<String>("Appointment With Doctor ID not Found, Please Enter valid Doctor Id.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AppointmentWithDateNotFound.class)
    public ResponseEntity<String> appointmentWithDateNotFoundHandler(){
        return new ResponseEntity<String>("Appointment With Entered Date not Found, Please Enter valid Date.", HttpStatus.NOT_FOUND);
    }

}
