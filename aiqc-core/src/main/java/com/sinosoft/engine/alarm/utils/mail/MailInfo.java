package com.sinosoft.engine.alarm.utils.mail;

import org.apache.commons.mail.EmailAttachment;

import java.util.List;


public class MailInfo {
    private List<String> toAddress = null;

    private List<String> ccAddress = null;

    private List<String> bccAddress = null;

    private List<EmailAttachment> attachments = null;


    private String subject;

    private String content;


    public List<String> getToAddress() {
        return this.toAddress;
    }


    public void addToAddress(String toAddress) {
        this.toAddress.add(toAddress);
    }


    public void addToAddress(List<String> toAddress) {
        this.toAddress.addAll(toAddress);
    }


    public void addCcAddress(List<String> ccAddress) {
        if (null != ccAddress && ccAddress.size() > 0) {
            this.ccAddress.addAll(ccAddress);
        }
    }

    public List<EmailAttachment> getAttachments() {
        return this.attachments;
    }


    public void setAttachments(List<EmailAttachment> attachments) {
        this.attachments = attachments;
    }


    public List<String> getBccAddress() {
        return this.bccAddress;
    }


    public void setBccAddress(List<String> bccAddress) {
        this.bccAddress = bccAddress;
    }


    public String getSubject() {
        return this.subject;
    }


    public void setSubject(String subject) {
        this.subject = subject;
    }


    public String getContent() {
        return this.content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }


    public List<String> getCcAddress() {
        return this.ccAddress;
    }


    public void setCcAddress(List<String> ccAddress) {
        this.ccAddress = ccAddress;
    }
}

