/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author livaniosilva
 */
public class CheckDictionaryTest {
    
    public CheckDictionaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkStrength method, of class CheckDictionary.
     */
    @Test
    public void testCheckStrength() {
        System.out.println("checkStrength");
        String passwd = "";
        CheckDictionary instance = new CheckDictionary();
        int expResult = 0;
        int result = instance.checkStrength(passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pwdDownLevel method, of class CheckDictionary.
     */
    @Test
    public void testPwdDownLevel() {
        System.out.println("pwdDownLevel");
        String passwd = "";
        CheckDictionary instance = new CheckDictionary();
        int expResult = 0;
        int result = instance.pwdDownLevel(passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
