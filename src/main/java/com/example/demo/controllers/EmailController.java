package com.example.demo.controllers;

import com.example.demo.dto.EmailObj;
import com.example.demo.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send")
    public String createMail(@RequestBody EmailObj emailObj){
        emailService.sendSimpleMessage(
                emailObj.getTo(),
                emailObj.getSubject(),
                emailObj.getText());
        return "good";
    }
}
