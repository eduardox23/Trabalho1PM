/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;

/**
 *
 * @author urielbertoche
 */
public class CheckDictionary implements PwdRules{
    
    private static final String[] DICTIONARY = { "password", "abc123",
        "iloveyou", "adobe123", "123123", "sunshine", "1314520", "a1b2c3", 
        "123qwe", "aaa111", "qweasd", "admin", "passwd" };
    
    public int checkStrength(String passwd) {
        int level = 0;
        
        level += pwdDownLevel(passwd);
        
        return level;
    }
    
    public int pwdDownLevel(String passwd) {
        int level = 0;
        
        if (null != DICTIONARY && DICTIONARY.length > 0) {// dictionary
            for (int i = 0; i < DICTIONARY.length; i++) {
                if (passwd.equals(DICTIONARY[i]) || DICTIONARY[i].indexOf(passwd) >= 0) {
                    level--;
                    break;
                }
            }
        }
        
        return level;
    }
}
