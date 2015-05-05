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
public class CheckLengthTest {
    
    public CheckLengthTest() {
    }
    
   
    @Test
    public void testCheckStrengthlevel03() {
        System.out.println("checkStrength");
        String password = "dashbprnn98#$jjfsdl";
        CheckLength instance = new CheckLength();
        int expResult = 3;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
      
    }
    
     @Test
    public void testCheckStrengthlevel04() {
        System.out.println("checkStrength");
        String password = "dashbprnn98#$jjfsdl46456456894646544fsdfs6545(*&¨%¨$¨%";
        CheckLength instance = new CheckLength();
        int expResult = 6;
        int result = instance.checkStrength(password);
        assertEquals(expResult, result);
      
    }
    
}
