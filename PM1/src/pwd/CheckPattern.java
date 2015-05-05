/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author urielbertoche
 */
public class CheckPattern implements PwdRules {
    private static final String PASSWORD_PATTERN_FULL = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";
    
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
        
        if (checkPatternFull(password))
            level++;
        
        return level;
    }
    
    private boolean checkPattern(String passwd, String pattern) {
        return passwd.matches(pattern);
    }
    
    private boolean checkPatternFull(String passwd) {
        return checkPattern(passwd, PASSWORD_PATTERN_FULL);
    }
}
