package com.sinosoft.engine.alarm.utils.mail;

import com.sun.net.ssl.internal.ssl.Provider;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.security.Security;
import java.util.Properties;


public class TT2 {
    public static void main(String[] args) {
        try {
            Security.addProvider(new Provider());
            String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
            Properties props = System.getProperties();
            props.setProperty("mail.smtp.host", "smtp.qq.com");
            props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.setProperty("mail.smtp.socketFactory.fallback", "false");
            props.setProperty("mail.smtp.port", "465");
            props.setProperty("mail.smtp.socketFactory.port", "465");
            props.setProperty("mail.smtp.auth", "true");


            Session session = Session.getDefaultInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("username", "password");
                }
            });

            MimeMessage message = new MimeMessage(session);


            message.setFrom(new InternetAddress("from_mail@qq.com"));
            message.setRecipients(Message.RecipientType.TO, "to_mail@qq.com");
            message.setSubject("通过javamail发出！！！");

            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setContent("图<img src='cid:myimg'/>文加附件邮件测试", "text/html;charset=UTF-8");

            MimeBodyPart imagePart = new MimeBodyPart();
            imagePart.setDataHandler(new DataHandler(new FileDataSource("imagePath")));
            imagePart.setContentID("myimg");

            MimeMultipart mmp1 = new MimeMultipart();
            mmp1.addBodyPart(textPart);
            mmp1.addBodyPart(imagePart);
            mmp1.setSubType("related");
            MimeBodyPart textImagePart = new MimeBodyPart();
            textImagePart.setContent(mmp1);

            MimeBodyPart attachmentPart = new MimeBodyPart();
            DataHandler dh = new DataHandler(new FileDataSource("filePath"));
            String fileName = dh.getName();
            attachmentPart.setDataHandler(dh);
            attachmentPart.setFileName(fileName);

            MimeMultipart mmp2 = new MimeMultipart();
            mmp2.addBodyPart(textImagePart);
            mmp2.addBodyPart(attachmentPart);
            mmp2.setSubType("mixed");

            message.setContent(mmp2);
            message.saveChanges();

            Transport.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


