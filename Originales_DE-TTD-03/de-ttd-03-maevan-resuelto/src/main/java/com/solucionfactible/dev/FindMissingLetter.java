package com.solucionfactible.dev;

import java.util.regex.Pattern;
/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {

	private static char[] af = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public static char findMissingLetter(char[] array) {
		int p = 0;
		boolean isLocd = false;
		Pattern prtn = Pattern.compile("[A-Z]+");
		for(char c: array) {
			if (!isLocd) {
				for (int i = 0; i < af.length; i++) {
					if (Character.toUpperCase(c) == Character.toUpperCase(af[i])) {
						isLocd = true;
						p = i;
						break;
					}
				}
			} else {
				p++;
				if (p < af.length) {
					if (Character.toUpperCase(c) != Character.toUpperCase(af[p])) {
						if (prtn.matcher(c+"").matches()) {
							return Character.toUpperCase(af[p]);
						}
						return af[p];
					}
				}
			}
		}
		return ' ';
	}

}
