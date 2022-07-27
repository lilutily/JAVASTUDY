package com.lilutily.Jul26.stringclass;

public class StringCleaner {
	public static String clean(String s) {
		s=s.replace("<b>", "");
		s=s.replace("</b>", "");
		s=s.replace("&quot;","");
		return s;
	}
}
