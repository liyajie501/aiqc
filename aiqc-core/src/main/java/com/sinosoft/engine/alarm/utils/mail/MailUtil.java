package com.sinosoft.engine.alarm.utils.mail;

import com.sinosoft.engine.analyze.utils.CommonTools;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.util.List;


public class MailUtil {
    private static String mailServerHost = "smtp.163.com";
    private static String mailSenderAddress = "test@163.com";
    private static String mailSenderNick = "test";
    private static String mailSenderUsername = "test@163.com";
    private static String mailSenderPassword = "xxx";

    static {
        mailServerHost = CommonTools.getApplicationConf("engine.alarm.send.email.mailServerHost");
        mailSenderAddress = CommonTools.getApplicationConf("engine.alarm.send.email.mailSenderAddress");
        mailSenderNick = CommonTools.getApplicationConf("engine.alarm.send.email.mailSenderNick");
        mailSenderUsername = CommonTools.getApplicationConf("engine.alarm.send.email.mailSenderUsername");
        mailSenderPassword = CommonTools.getApplicationConf("engine.alarm.send.email.mailSenderPassword");
    }


    public static void sendEmail(MailInfo mailInfo) {
        try {
            HtmlEmail email = new HtmlEmail();

            email.setHostName(mailServerHost);
            email.setFrom(mailSenderAddress, mailSenderNick);
            email.setAuthentication(mailSenderUsername, mailSenderPassword);
            email.setCharset("UTF-8");
            email.setSubject(mailInfo.getSubject());
            email.setHtmlMsg(mailInfo.getContent());


            List<EmailAttachment> attachments = mailInfo.getAttachments();
            if (null != attachments && attachments.size() > 0) {
                for (int i = 0; i < attachments.size(); i++) {
                    email.attach((EmailAttachment) attachments.get(i));
                }
            }


            List<String> toAddress = mailInfo.getToAddress();
            if (null != toAddress && toAddress.size() > 0) {
                for (int i = 0; i < toAddress.size(); i++) {
                    email.addTo((String) toAddress.get(i));
                }
            }

            List<String> ccAddress = mailInfo.getCcAddress();
            if (null != ccAddress && ccAddress.size() > 0) {
                for (int i = 0; i < ccAddress.size(); i++) {
                    email.addCc((String) ccAddress.get(i));
                }
            }

            List<String> bccAddress = mailInfo.getBccAddress();
            if (null != bccAddress && bccAddress.size() > 0) {
                for (int i = 0; i < bccAddress.size(); i++) {
                    email.addBcc((String) ccAddress.get(i));
                }
            }
            try {
                email.send();
            } catch (Exception exception) {
            }


            System.out.println("邮件发送成功！");
        } catch (EmailException e) {
            e.printStackTrace();
        }
    }
}

