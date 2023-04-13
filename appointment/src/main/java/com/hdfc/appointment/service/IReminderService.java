package com.hdfc.appointment.service;

import com.hdfc.appointment.entity.Reminder;

public interface IReminderService {

    public String notificationSender(String toEmail, String body , String subject);

    public Reminder updateReminder(Reminder reminder);

    public String sendMailToAllAppointment(String date);
}
