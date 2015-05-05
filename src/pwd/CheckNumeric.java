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
public class CheckNumeric implements PwdRules {
    
    private static final String[] DICTIONARY = { "01234567890", "1234", "12345",
        "123123", "0987654321", "09876543210" };
    /**
     * TODO: Should compare password with a preset of a dictionary and remove
     * points if password is a word in the dictionary, Also should take in
     * consideration the position of each numeric character found
     * @param password
     * @return
     */
    public int checkStrength(String password) {
        int level = 0;
        
        level += this.pwdDownLevel(password);
        level += this.pwdUpLevel(password);
        
        return level;
    }
    
    private int countNumerics(String password) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(password);
        
        int counter = 0;
        while(matcher.find())
            counter ++;
        
        return counter;
    }
    
    private boolean isYear(String passwd) {
        int len = passwd.length();
        if (StringUtils.isNumeric(passwd) && len >= 6) { // 19881010 or 881010
            int year = 0;
            if (len == 8 || len == 6) {
                year = Integer.parseInt(passwd.substring(0, len - 4));
            }
            int size = StringUtils.sizeOfInt(year);
            int month = Integer.parseInt(passwd.substring(size, size + 2));
            int day = Integer.parseInt(passwd.substring(size + 2, len));
            if (year >= 1950 && year < 2050 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
                return true;
            }
        }
        
        return false;
    }
    
    private int pwdDownLevel(String password) {
        int level = 0;
        int len = password.length();
        int counter = this.countNumerics(password);
        
        if (counter == len)
            level--;
        
        if ("01234567890".indexOf(password) > 0)
            level--;
        
        if ("09876543210".indexOf(password) > 0)
            level--;
        
        if (this.isYear(password))
            level--;
        
        return level;
    }
    
    private int pwdUpLevel(String password) {
        int level = 0;
        int len = password.length();
        
        int counter = this.countNumerics(password);
        
        if (counter > 0 && len != counter) {
            level++;
            
            if (counter >= 2) {
                level++;
                
                if (counter >= 3)
                    level++;
            }
        }
        
        return level;
    }
}
