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
public class CheckPatternTest {
    
    public CheckPatternTest() {
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
     * Test of checkStrength method, of class CheckPattern.
     */
    @Test
    public void testCheckStrength() {
        System.out.println("checkStrength");
        String password = "";
        CheckPattern instance = new CheckPattern();
        int expResult = 0;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
        
    }
    
}
