package com.example.demo.email;

public interface EmailService {
    void sendSimpleMessage(String to,
                           String subject,
                           String text);
}
