package test;
import java.util.regex.Pattern;

public class ValidatePIN {
	public static boolean isValid(String pin) {
		Pattern p = Pattern.compile("[+-]?\\d+");
		String cs[] = pin.split("");
		if ((cs.length != 6) && (cs.length != 4)) {
			return false;
		}
		for(String c: cs) {
            if (!p.matcher(c).matches()) {
            	return false;
            }
        }
		return true;
	}
}
