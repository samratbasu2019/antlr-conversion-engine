package com.org.infy.cpc.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.log4j.Logger;

public class PatternMatcher {
	private final static Logger log = Logger.getLogger(PatternMatcher.class);	
	public static String match(String input, String pattern) {
		String matchText=null;
		//log.debug("match input :" + input + " Pattern :"+pattern);
		try {
		    Pattern regex = Pattern.compile(pattern);		    
		    Matcher regexMatcher = regex.matcher(input);
		    while (regexMatcher.find()) {	
		        for (int i = 1; i <= regexMatcher.groupCount(); i++) {
		        	log.debug("Match found! "+regexMatcher.group(i));
		        	matchText = regexMatcher.group(i);
		        }
		    } 
		} catch (PatternSyntaxException ex) {
		   ex.printStackTrace();
		}
		return matchText;
	}

}
