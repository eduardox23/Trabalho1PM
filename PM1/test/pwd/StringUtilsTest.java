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
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of sizeOfInt method, of class StringUtils.
     */
    @Test
    public void testSizeOfInt() {
        System.out.println("sizeOfInt");
        int x = 0;
        int expResult = 0;
        int result = StringUtils.sizeOfInt(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCharEqual method, of class StringUtils.
     */
    @Test
    public void testIsCharEqual() {
        System.out.println("isCharEqual");
        String str = "";
        boolean expResult = false;
        boolean result = StringUtils.isCharEqual(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isNumeric method, of class StringUtils.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "";
        boolean expResult = false;
        boolean result = StringUtils.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equalsNull method, of class StringUtils.
     */
    @Test
    public void testEqualsNull() {
        System.out.println("equalsNull");
        String str = "";
        boolean expResult = false;
        boolean result = StringUtils.equalsNull(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
