package com.example.emailtest;

import com.example.emailtest.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailTestApplication {
    @Autowired
    private EmailSenderService senderService;


    public static void main(String[] args) {
        SpringApplication.run(EmailTestApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail(){
        senderService.sendEmail("anhnt.tb12@gmail.com",
                "chi Anh",
                "thu gui mail");
    }

}
