//package com.ibm.springboot.demo.mail;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//@Autowired	
//private final JavaMailSender mailSender;
//public EmailService(JavaMailSender mailSender) {
//	this.mailSender = mailSender;
//	
//}
//@Async
//public void sendEmail(String to,String subject, String body) {
//	SimpleMailMessage message = new SimpleMailMessage();
//	message.setTo("shrishtibhushan2001@gmail.com");
//	message.setFrom("piyushbh31@gmail.com");
//	message.setSubject(subject);
//	message.setText(body);
//	
//	mailSender.send(message);
//}
//}