package com.hdfc.appointment.service;

import com.hdfc.appointment.entity.Appointment;
import com.hdfc.appointment.entity.Reminder;
import com.hdfc.appointment.repository.IReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderService implements IReminderService{
    @Autowired
    IReminderRepository repo;
    @Autowired
    IAppointmentService serviceappointment;
    @Autowired
    private JavaMailSender mailSender;
    @Override
    public String notificationSender(String toEmail, String body, String subject) {

        SimpleMailMessage message=new SimpleMailMessage();

        message.setFrom("sahilgawande0002@gmail.com");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);

        return "The Mail send Successfully....";


    }

    @Override
    public Reminder updateReminder(Reminder reminder) {
        return repo.save(reminder);
    }

    @Override
    public String sendMailToAllAppointment(String date) {

        List<Appointment> appointmentList=serviceappointment.findByDate(date);

        int size=appointmentList.size();

        String response="";

        for(int i=0;i<size;i++){

            String actualStatus= appointmentList.get(i).getStatus();
            String confirmStatus="Confirmed";
            String pendingStatus="Pending";
            String canceledStatus="Canceled";
            String rescheduledStatus="Rescheduled";

            if(actualStatus.equals(confirmStatus)){

                response=notificationSender(appointmentList.get(i).getEmail(),"You have An Appointment on:  "+appointmentList.get(i).getDate()+"  Timing:"+
                        appointmentList.get(i).getTime()+"  Report the Clinic 10 min before your Appointment Timing.","Regarding the Appointment Reminder.");


            }else if(actualStatus.equals(pendingStatus)){

                response=notificationSender(appointmentList.get(i).getEmail(),"Your Appointment on:  "+appointmentList.get(i).getDate()+"  Timing:"+
                        appointmentList.get(i).getTime()+"  Is Still in Pending State , you can cancel the appointment And Book For New One","Regarding the Appointment Status/Reminder.");


            }if(actualStatus.equals(canceledStatus)){

                response=notificationSender(appointmentList.get(i).getEmail(),"Your Appointment on:  "+appointmentList.get(i).getDate()+"  Timing:"+
                        appointmentList.get(i).getTime()+"  Is Canceled Due to some reason for Any Support Contact The Clinic at:9000001234","Regarding the Appointment Reminder.");


            }if(actualStatus.equals(rescheduledStatus)){

                response=notificationSender(appointmentList.get(i).getEmail(),"Your Appointment got Rescheduled on : "+appointmentList.get(i).getDate()+"  Timing:"+
                        appointmentList.get(i).getTime(),"Regarding the Appointment Reminder.");


            }

            }




        return response;




    }
}
