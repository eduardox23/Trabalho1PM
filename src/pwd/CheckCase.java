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
public class CheckCase implements PwdRules{
    
    public int checkStrength(String passwd) {
        int level = 0;
        
        level += pwdDownLevel(passwd);
        level += pwdUpLevel(passwd);
        
        return level;
    }
    
    private int pwdDownLevel(String passwd) {
        int level = 0;
        int len = passwd.length();
        
        int upper = countUpperCase(passwd);
        int lower = countLowerCase(passwd);
        
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(passwd) > 0 ||
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(passwd) > 0) {
            level--;
        }
        
        if ("qwertyuiop".indexOf(passwd) > 0 ||
                "asdfghjkl".indexOf(passwd) > 0 ||
                "zxcvbnm".indexOf(passwd) > 0) {
            level--;
        }
        
        if (upper == len || lower == len)
            level --;
        
        if (len % 2 == 0) { // aaabbb
            String part1 = passwd.substring(0, len / 2);
            String part2 = passwd.substring(len / 2);
            if (part1.equals(part2)) {
                level--;
            }
            if (StringUtils.isCharEqual(part1) && StringUtils.isCharEqual(part2)) {
                level--;
            }
        }
        
        if (len % 3 == 0) { // ababab
            String part1 = passwd.substring(0, len / 3);
            String part2 = passwd.substring(len / 3, len / 3 * 2);
            String part3 = passwd.substring(len / 3 * 2);
            if (part1.equals(part2) && part2.equals(part3)) {
                level--;
            }
        }
        
        return level;
    }
    
    private int pwdUpLevel(String passwd) {
        int level = 0;
        int len = passwd.length();
        
        int upper = countUpperCase(passwd);
        int lower = countLowerCase(passwd);
        
        // TODO: Review the code bellow, might not be working as intended
        if (lower >= 2)
            level++;
            
        if (lower >= 3)
            level++;
        
        if (upper >= 2)
            level++;

        if (upper >= 3)
            level++;
        
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
    
    private int countLowerCase(String passwd) {
        return countPattern(passwd, "[a-z]");
    }
    
    private int countUpperCase(String passwd) {
        return countPattern(passwd, "[A-Z]");
    }
    
}
