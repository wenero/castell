package com.tecsup.castell.helper;

import java.io.UnsupportedEncodingException;
import org.springframework.util.DigestUtils;

public class Utiles {

    public static String getMD5(String pass) {
        String rtrn = "";
        try {
            byte[] bytesOfMessage = pass.getBytes("UTF-8");
            rtrn = DigestUtils.md5DigestAsHex(bytesOfMessage);
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        return rtrn;

    }

}
