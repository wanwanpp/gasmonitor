package com.gasmonitor.utils;

import org.assertj.core.internal.Strings;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * EncryptUtil Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十月 17, 2017</pre>
 */
public class EncryptUtilTest {
    private String passwrod = "myllllll";

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: encrypt(String rawPassword)
     */
    @Test
    public void testEncrypt() throws Exception {
        String ret = EncryptUtil.encrypt(passwrod);
        System.out.printf("%s 加密之后: %s \n", passwrod, ret);
        boolean pt = EncryptUtil.match(passwrod, ret);
        System.out.printf("%s 对比 %s ==> %s \n", ret, passwrod, pt);
    }
} 
