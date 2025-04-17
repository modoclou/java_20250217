package com.cyj.boot008.util3.naver_mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class NaverMail {
	private String subject, content;
	public void sendMail(String subject, String content) {
		//1. who send mail (보내는 쪽)
		String host="smtp.naver.com";
		String user="cyj4336@naver.com";	//naver id 붙여서 체크. cozizii@naver.com
		String password="lemozionade12*";					//naver password
		
		
		//2. 받는 사람
		String to="cozizii-_-@naver.com";	//받는 사람
		
		//3. 인증과 함께 보내는 세션을 설정
		Properties props = new Properties();
		props.put("mail.smtp.host", host);	//naver host setting
		props.put("mail.smtp.auth", "true");//인증
		props.put("mail.smtp.port", "587");	//port number
		props.put("mail.debug", "true");	//debug progress true
		
		props.put("mail.smtp.starttls.enable", "true");		//이메일 전송 시 보안 연결
		props.put("mail.smtp.ssl.trust", "smtp.naver.com");	//ssl 인증서 신뢰도, 신뢰할 곳 지정
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");	//TLSv1.2 version 신뢰
		
		Session session = Session.getInstance(props, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);	//id, password
			}
		});
		
		//4. 메일 보내기
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(user));		//보내는 사람
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));	//받는사람
			message.setSubject(subject);	//메일제목
			message.setContent("" 
					+"<div  style='background-color:aliceblue; border-radius:20px; padding:10px' >"
					+"<h3> 정기수신 메일입니다. </h3>"
					+"<p>"+content+"</p>"
					+ "</div>"
					, "text/html; charset=euc-kr");
			Transport.send(message);
			System.out.println("......Successfully!");
		} catch (AddressException e) { e.printStackTrace();
		} catch (MessagingException e) { e.printStackTrace(); }
		
	}
}
