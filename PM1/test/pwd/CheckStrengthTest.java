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
public class CheckStrengthTest {
    
    public CheckStrengthTest() {
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
     * Test of checkPasswordLevel method, of class CheckStrength.
     */
    @Test
    public void testCheckPasswordLevel() {
        System.out.println("checkPasswordLevel");
        String passwd = "";
        CheckStrength instance = null;
        int expResult = 0;
        int result = instance.checkPasswordLevel(passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordStrength method, of class CheckStrength.
     */
    @Test
    public void testGetPasswordStrength() {
        System.out.println("getPasswordStrength");
        String passwd = "";
        CheckStrength instance = null;
        CheckStrength.LEVEL expResult = null;
        CheckStrength.LEVEL result = instance.getPasswordStrength(passwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
