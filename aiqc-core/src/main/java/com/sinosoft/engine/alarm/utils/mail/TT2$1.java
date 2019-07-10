
package com.sinosoft.engine.alarm.utils.mail;


import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


final class TT2$1 extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication("username", "password");
    }
}


