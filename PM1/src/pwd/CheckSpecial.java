/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;

import java.util.regex.*;

/**
 *
 * @author urielbertoche
 */
public class CheckSpecial implements PwdRules {
    private static final String SPECIAL_CHARS = "[@#$%.!]";
    
    public int checkStrength(String password) {
        int level = 0;
        
        level += this.pwdDownLevel(password);
        
        level += this.pwdUpLevel(password);

        return level;
    }
    
    private int pwdDownLevel(String password) {
        int level = 0;
        
        return level;
    }
    
    private int pwdUpLevel(String password) {
        int level = 0;
        int counter = countSpecial(password);
        
        if (counter >= 3)
            level ++;
        
        if (counter >= 6)
            level ++;
        
        return level;
    }
    
    private int countPattern(String passwd, String str_pattern) {
        Pattern pattern = Pattern.compile(str_pattern);
        Matcher matcher = pattern.matcher(passwd);
        
        int counter = 0;
        while(matcher.find())
            counter ++;
        
        return counter;
    }
    
    private int countSpecial(String passwd) {
        return countPattern(passwd, SPECIAL_CHARS);
    }
}
