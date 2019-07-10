package com.sinosoft.engine.alarm.utils.mail;

import com.sinosoft.engine.analyze.utils.CommonTools;
import org.apache.log4j.Logger;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;


public class SendMailBySSL {
    private static Logger logger = Logger.getLogger(SendMailBySSL.class);
    private final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
    private String smtpServer;
    private String port;
    private String username;
    private String password;
    private List<String> recipients = new ArrayList();
    private String subject;
    private String content;
    private List<String> attachmentNames = new ArrayList();


    public SendMailBySSL() {
    }


    public SendMailBySSL(String smtpServer, String port, String username, String password, List<String> recipients, String subject, String content, List<String> attachmentNames) {
        this.smtpServer = smtpServer;
        this.port = port;
        this.username = username;
        this.password = password;
        this.recipients = recipients;
        this.subject = subject;
        this.content = content;
        this.attachmentNames = attachmentNames;
    }


    public void setSmtpServer(String smtpServer) {
        this.smtpServer = smtpServer;
    }


    public void setPort(String port) {
        this.port = port;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setAttachmentNames(List<String> attachmentNames) {
        this.attachmentNames = attachmentNames;
    }


    public String changeEncode(String str) {
        try {
            str = MimeUtility.encodeText(new String(str.getBytes(), "UTF-8"), "UTF-8", "B");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }


    public boolean sendMail() {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", this.smtpServer);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");

        properties.put("mail.smtp.port", this.port);
        properties.put("mail.smtp.socketFactory.port", this.port);

        Session session = Session.getInstance(properties);
        session.setDebug(true);
        MimeMessage message = new MimeMessage(session);


        try {
            InternetAddress internetAddress = new InternetAddress(this.username);
            message.setFrom(internetAddress);


            for (String recipient : this.recipients) {
                System.out.println("收件人：" + recipient);
                InternetAddress internetAddress1 = new InternetAddress(recipient);
                message.setRecipient(MimeMessage.RecipientType.TO, internetAddress1);
            }


            message.setSubject(changeEncode(this.subject));


            message.setSentDate(new Date());

            MimeMultipart mimeMultipart = new MimeMultipart();

            MimeBodyPart mimeBodyPart = new MimeBodyPart();

            mimeBodyPart.setContent(this.content, "text/html;charset=UTF-8");


            mimeMultipart.addBodyPart(mimeBodyPart);

            for (String fileName : this.attachmentNames) {
                MimeBodyPart mimeBodyPart1 = new MimeBodyPart();
                FileDataSource fileDataSource = new FileDataSource(fileName);
                mimeBodyPart1.setDataHandler(new DataHandler(fileDataSource));
                mimeBodyPart1.setFileName(changeEncode(fileDataSource.getName()));
                mimeMultipart.addBodyPart(mimeBodyPart1);
            }

            this.recipients.clear();
            this.attachmentNames.clear();

            message.setContent(mimeMultipart);
            message.saveChanges();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        try {
            Transport transport = session.getTransport("smtp");
            transport.connect(this.smtpServer, this.username, this.password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public static boolean sendEmail(String recipient, String subject, String content) {
        try {
            logger.info("发送邮件给：" + recipient);
            List<String> recipients = new ArrayList<String>();
            recipients.add(recipient);
            List<String> attachmentNames = new ArrayList<String>();


            String smtpServer = CommonTools.getApplicationConf("engine.alarm.send.email.smtpServer");
            String port = CommonTools.getApplicationConf("engine.alarm.send.email.port");
            String username = CommonTools.getApplicationConf("engine.alarm.send.email.username");
            String password = CommonTools.getApplicationConf("engine.alarm.send.email.password");

            SendMailBySSL sendMailBySSL = new SendMailBySSL(smtpServer, port, username, password, recipients, subject, content, attachmentNames);


            boolean sendMail = sendMailBySSL.sendMail();
            logger.info("邮件发送：" + (sendMail ? "成功" : "失败"));
            return sendMail;
        } catch (Exception e) {
            logger.error("发送邮件异常", e);
            return false;
        }
    }


    public static void main(String[] args) {
        List<String> recipients = new ArrayList<String>();
        recipients.add("yanbl@huayunworld.com");
        String subject = "这封邮件是为了测试SMTP的SSL加密传输";
        String content = "这是这</br>aaaaaaaaaaaaaaa封邮件</br>的正文";
        List<String> attachmentNames = new ArrayList<String>();
        attachmentNames.add("e://meminfo.txt");
        SendMailBySSL sendMailBySSL = new SendMailBySSL("smtp.exmail.qq.com", "465", "weihc@huayunworld.com", "Wwei1993", recipients, subject, content, attachmentNames);


        sendMailBySSL.sendMail();
    }
}