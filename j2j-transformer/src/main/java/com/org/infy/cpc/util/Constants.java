package com.org.infy.cpc.util;

public class Constants {
	private Constants() {		
	}
	public final static String GET_QUERY_PATTERN = "(SELECT.*|Select.*|select.*)(?<!;)";
	public final static String GET_QUERY_NAME_PATTERN = "(?<= FROM )(.*)";
	public final static String GET_PREFIX = "GET_";
	
}
