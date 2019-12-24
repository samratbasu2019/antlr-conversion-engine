package com.org.infy.cpc.antlr.transformer;

import java.io.FileReader;
import java.io.FileWriter;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.apache.log4j.Logger;


public class PL2JTransformer 
{
	private final static Logger log = Logger.getLogger(PL2JTransformer.class);
    private static StringTemplateGroup templates;

    public static void transform(String plsqlFileName, String targetFilePath) throws Exception {

    	String dir = System.getProperty("user.dir");
    	String templateFileName = dir+ "/Java.stg";

	templates = new StringTemplateGroup(new FileReader(templateFileName),
					    AngleBracketTemplateLexer.class);

	CharStream input = new ANTLRFileStream(plsqlFileName);
	PLSQL3Lexer lexer = new PLSQL3Lexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	PLSQL3Parser parser = new PLSQL3Parser(tokens);
	
	parser.setTemplateLib(templates);
	RuleReturnScope r = parser.program();
	log.debug(r.getTemplate().toString());
	log.debug("Target Wrapper Class path is :"+targetFilePath);
	FileWriter fileWriter = new FileWriter(targetFilePath+"/Wrapper.java");
    fileWriter.write(r.getTemplate().toString());
    fileWriter.close();
    }
}
