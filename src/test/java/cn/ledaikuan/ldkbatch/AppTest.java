package cn.ledaikuan.ldkbatch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest {
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
    
    @org.junit.Test
    public void testStr(){
        String str1 = "BO20170822020885,\"°¥Ó´,18705838410,2,2017-07-09 18:55:03,20170822";
        
        String str2 = "BO20170825057897,\"€ÄÌ,13048530790,2,2017-07-15 19:35:02,20170825";
        
        String str3 = "BO20170831001066,³Â³ÐÒµ,,£¬¡££¿£¿¡££¬,13132949424336*83,20170831";
        
        System.out.println(filter(str1));
        System.out.println(filter(str2));
        System.out.println(filter(str3));
        
    }
    
    public String filter(String str) {
        String regEx = "[`~!@#$%^&*()\\-+={}':;,\\[\\].<>/?£¤%¡­£¨£©_+|¡¾¡¿¡®£»£º¡±¡°¡¯¡££¬¡¢£¿\\s]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }
}
