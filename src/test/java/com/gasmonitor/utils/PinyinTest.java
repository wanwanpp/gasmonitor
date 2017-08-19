package com.gasmonitor.utils;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Pinyin Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>八月 19, 2017</pre>
 */
public class PinyinTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getPingYin(String src)
     */
    @Test
    public void testGetPingYin() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getPinYinHeadChar(String str)
     */
    @Test
    public void testGetPinYinHeadChar() throws Exception {
        String s = Pinyin.getPinYinHeadChar("租户jsfajfowj0q9e0q");
        System.out.println("s--->" + s);
    }

    /**
     * Method: getCnASCII(String cnStr)
     */
    @Test
    public void testGetCnASCII() throws Exception {
//TODO: Test goes here... 
    }


} 
