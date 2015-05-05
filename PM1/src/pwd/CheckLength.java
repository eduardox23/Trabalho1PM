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
public class CheckLength implements PwdRules {
    
    public int checkStrength(String password) {
        int level = 0;
        int len = password.length();
        
        if (len == 3){
            return level;
        }
        
        level += this.pwdDownLevel(password);
        
        level += this.pwdUpLevel(password);

        return level;
    }
    
    private int pwdDownLevel(String password) {
        int level = 0;
        
        if (password.length() <= 6)
            level--;
        
        if (password.length() <= 4)
            level--;
        
        return level;
    }
    
    private int pwdUpLevel(String password) {
        int level = 0;
        
        if (password.length() > 8)
            level++;
        if (password.length() > 12)
            level++;
        if (password.length() >= 16)
            level++;
        
        return level;
    }
}
