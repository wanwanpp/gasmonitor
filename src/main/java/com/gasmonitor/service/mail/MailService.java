package com.gasmonitor.service.mail;

import javax.mail.MessagingException;

public interface MailService {


	void send(String to, String subject, String text) throws MessagingException;
}
