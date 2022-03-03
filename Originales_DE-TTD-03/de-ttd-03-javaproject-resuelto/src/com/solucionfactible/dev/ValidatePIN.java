package com.solucionfactible.dev;

import java.util.regex.Pattern;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
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
