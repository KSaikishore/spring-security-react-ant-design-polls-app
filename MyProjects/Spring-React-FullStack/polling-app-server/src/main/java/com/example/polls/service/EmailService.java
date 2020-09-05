package com.example.polls.service;

import com.example.polls.exception.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String receiver) {

        SimpleMailMessage msg = new SimpleMailMessage();
//      msg.setTo("saikasibhotla@gmail.com");
        msg.setTo(receiver);

        msg.setSubject("From Polling application");
        msg.setText("Sign up sucessfull ");

        javaMailSender.send(msg);

    }
}
