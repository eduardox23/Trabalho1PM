package pwd;

/**
 * Interface to password rules. No need to import anything in this file
 * @author urielbertoche
 */
public interface PwdRules {
    public int checkStrength(String password);
}
