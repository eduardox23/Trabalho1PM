/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pwd;


/**
 * Check strength of a password string
 * 
 */
public class CheckStrength {

	public enum LEVEL {
            EASY, MIDIUM, STRONG, VERY_STRONG, EXTREMELY_STRONG, WRONG_PASSWORD
        }
        
        public Object[] rules;
        
        public CheckStrength (Object[] rules) {
            this.rules = rules;
        }

	/**
	 * Check password's strength
	 * 
	 * @param passwd
	 * @return strength integer level
	 */
	public int checkPasswordLevel(String passwd) {
            int level=-1;
            try {
                if (StringUtils.equalsNull(passwd)) {
                    throw new IllegalArgumentException("password is empty");
                }
                
                for (Object object : this.rules) {
                    PwdRules rule = (PwdRules)object;
                    level += rule.checkStrength(passwd);
                }

                if (StringUtils.isCharEqual(passwd)) {
                    level = 0;
                }

                if (level < 0) {
                    level = 0;
                }

                return level;
                
            } catch (Exception e) {
                e.printStackTrace();
                return level=-1;
            }
	}
        
	/**
	 * Get password strength level, includes easy, medium, strong, very strong, extremely strong
	 * 
	 * @param passwd
	 * @return String with the password Strength
	 */
	public LEVEL getPasswordStrength(String passwd) {
		int level = checkPasswordLevel(passwd);
		switch (level) {
			case -1:
				return LEVEL.WRONG_PASSWORD;
			case 0:
			case 1:
			case 2:
			case 3:
				return LEVEL.EASY;
			case 4:
			case 5:
			case 6:
				return LEVEL.MIDIUM;
			case 7:
			case 8:
			case 9:
				return LEVEL.STRONG;
			case 10:
			case 11:
			case 12:
				return LEVEL.VERY_STRONG;
			default:
				return LEVEL.EXTREMELY_STRONG;
		}
	}

}