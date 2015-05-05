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
public class CheckCaseTest {
    
    public CheckCaseTest() {
    }
    
  
    @Test
    public void testCheckStrengthLevel0() {
        System.out.println("checkStrength");
        String passwd = "dashb9585";
        CheckCase instance = new CheckCase();
        int expResult = 0;
        int result = instance.checkStrength(passwd);
        assertEquals(expResult, result);
     
    }
    
      @Test
    public void testCheckStrengthLevel02() {
        System.out.println("checkStrength");
        String passwd = "dashb9585";
        CheckCase instance = new CheckCase();
        int expResult = 4;
        int result = instance.checkStrength(passwd);
        assertEquals(expResult, result);
     
    }
    
}
