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
	
	private static //Parametros de teste
	String[] partialRegexChecks = { ".*[a-z]+.*", // lowercase
			".*[A-Z]+.*", // upperCase
			".*[\\d]+.*", // Numéricos
			".*[@#$%]+.*" // simbolos
	};
	
	private static final String PASSWORD_PATTERN_FULL = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})";

	/**
	 * Check password's strength
	 * 
	 * @param passwd
	 * @return strength int level
	 */
	public static int checkPasswordLevel(String passwd) {
		int level=-1;
		try {
			if (StringUtils.equalsNull(passwd)) {
				throw new IllegalArgumentException("password is empty");
			}
			int len = passwd.length();
			//Aumenta Pontos
			level = pwdUpLevel(passwd, len);
			// Diminui pontos
			level = pwdLowLevel(passwd, len, level);

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

	private static int pwdUpLevel(String passwd, int len) {
		int level = 0;
	
                //uso de expressões regular para checar o tamanho e se atende a os 4 padrões
                if (passwd.matches(PASSWORD_PATTERN_FULL)) {
                        level++;
                }
		
			if (countLetter(passwd, OTHER_CHAR) >= 3) {
				level++;
			}
			if (countLetter(passwd, OTHER_CHAR) >= 6) {
				level++;
			}
		
			if (len > 12) {
				level++;
				if (len >= 16) {
					level++;
				}
			}
		}
		return level;
	}

	/**
	 * Get password strength level, includes easy, midium, strong, very strong, extremely strong
	 * 
	 * @param passwd
	 * @return String with the password Strength
	 */
	public static LEVEL getPasswordStrength(String passwd) {
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