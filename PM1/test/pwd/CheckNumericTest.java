/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author livaniosilva
 */
public class CheckNumericTest {
    
    public CheckNumericTest() {
    }
    
    
    @Test
    public void testCheckStrengthPwdLevel1() {
        System.out.println("checkStrength");
        String password = "abc";
        CheckNumeric instance = new CheckNumeric();
        int expResult = 0;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
    }
     @Test
    public void testCheckStrengthPwdLevel2() {
        System.out.println("checkStrength");
        String password = "abclkaskldja9655@";
        CheckNumeric instance = new CheckNumeric();
        int expResult = 0;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
    }
    
    
}
