package com.org.infy.cpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.org.infy.cpc.antlr.transformer.PL2JTransformer;
import com.org.infy.cpc.j2j.transformer.J2JTransformer;

@Service
public class PLJConverter {
	private static final Logger logger = LoggerFactory.getLogger(PLJConverter.class);

	public boolean convert(String inputPLSqlFile, String interimOutput) {
		boolean hasConverted = false;
		try {
			logger.info(
					"input PLSQL file location : " + inputPLSqlFile + " and target interim o/p is : " + interimOutput);
			PL2JTransformer.transform(inputPLSqlFile, interimOutput);
			hasConverted = true;
			if (hasConverted)
				J2JTransformer.starter(inputPLSqlFile, interimOutput);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return hasConverted;
	}

}
