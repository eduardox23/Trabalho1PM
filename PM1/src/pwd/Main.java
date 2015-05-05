package pwd;

/**
 * Test password level
 * 
 */
public class Main {

	public static void main(String[] args) {
		String passwd = "2hAj5#mne-ix.86H";
               // String passwd = "8g5dh@45$2$01²3%¢";
                PwdRules[] rules_array = {
                    new CheckCase(), new CheckDictionary(),
                    new CheckLength(), new CheckNumeric(),
                    new CheckSpecial(), new CheckPattern()
                };

                CheckStrength cs = new CheckStrength(rules_array);
                
		System.out.println(cs.getPasswordStrength(passwd));
	}

}