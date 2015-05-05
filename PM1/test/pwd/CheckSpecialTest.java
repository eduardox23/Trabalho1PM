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
public class CheckSpecialTest {
    
    public CheckSpecialTest() {
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
     * Test of checkStrength method, of class CheckSpecial.
     */
    @Test
    public void testCheckStrength() {
        System.out.println("checkStrength");
        String password = "";
        CheckSpecial instance = new  CheckSpecial();
        int expResult = 0;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
      
    }
     @Test
    public void testCheckStrength1() {
        System.out.println("checkStrength");
        String password = "[%$&+º%$&+º%$&+º%$&+º%$&+º%$&+º";
        CheckSpecial instance = new  CheckSpecial();
        int expResult = 7;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
    }
    
}
