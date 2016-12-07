package com.alternatecase;

public class StringUtils {

	public static String toAlternativeString(String input) {
		return convertToUpperOrLower(input);
	}

	private static String convertToUpperOrLower(String input) {
		StringBuilder result = new StringBuilder();
		for (char eachLetter : input.toCharArray()) {
			if (Character.isUpperCase(eachLetter)) {
				result.append(Character.toLowerCase(eachLetter));
			}
			else if (Character.isLowerCase(eachLetter)) {
				result.append(Character.toUpperCase(eachLetter));
			}
			else {
				result.append(eachLetter);
			}
		}
		return result.toString();
	}

}
