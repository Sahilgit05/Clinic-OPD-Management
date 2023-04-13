package com.hdfc.appointment.controller;

import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.entity.Reminder;
import com.hdfc.appointment.service.IReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reminder/microservice")
public class ReminderRestController {
    @Autowired
    IReminderService service;
//    @GetMapping("/send/mail")
//    public String sendNotificationMail(){
//
//        return service.notificationSender("sahilgawande2000@gmail.com",
//                "This is sucess Email.","For the Project Related.");
//
//
//    }
    //This Method is Used for the updating the Reminder type of the Appointment in the Reminder teble.
    @PutMapping("/update/reminder")
    public Reminder UpdateReminderEntryAndSendMail(@RequestBody Reminder reminder){

        return  service.updateReminder(reminder);

    }

    //This is the method For send the patients the mail based on their Appointment date and Appointment Status.

    @GetMapping("/send/mails-to-appointment-on-date/{date}")
    public String sendMailToAppointment(@PathVariable String date){

        return service.sendMailToAllAppointment(date);
    }
}
