package com.gasmonitor.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by saplmm on 2017/10/17.
 */
public class EncryptUtil {
    //从配置文件中获得
    private static final PasswordEncoder encoder = new BCryptPasswordEncoder();

    /**
     * 加密
     *
     * @param rawPassword
     * @return
     */
    public static String encrypt(String rawPassword) {
        return encoder.encode(rawPassword);
    }

    /**
     * 比较密码是否正确
     *
     * @param rawPassword
     * @param password
     * @return
     */
    public static boolean match(String rawPassword, String password) {
        return encoder.matches(rawPassword, password);
    }
}
