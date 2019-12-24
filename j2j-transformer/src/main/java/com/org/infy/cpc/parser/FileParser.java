package com.org.infy.cpc.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.org.infy.cpc.j2j.transformer.QueryGenerator;
import com.org.infy.cpc.jaxb.EntityMappings.*;
import com.org.infy.cpc.util.Constants;

public class FileParser {
	private final static Logger log = Logger.getLogger(FileParser.class);

	public List<NamedNativeQuery> parseNNQ(String inputIterimFile) {
		File file = new File(inputIterimFile);
		List<String> listStr = new ArrayList<String>();
		List<QGInput> listQGInput = new ArrayList<>();
		List<NamedNativeQuery> nnq = new ArrayList<>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String st;

			while ((st = br.readLine()) != null) {
				String matchedString = null;
				matchedString = PatternMatcher.match(st, Constants.GET_QUERY_PATTERN);
				if (null != matchedString) {
					listStr.add(matchedString);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		listQGInput = prepareQG(listStr);
		for (QGInput qgi : listQGInput) {
			log.debug("QGInput query name :" + qgi.getQueryName() + " Query : " + qgi.getQuery());
			nnq.add(new QueryGenerator().generateNativeNamedQuery(qgi.getQueryName(), qgi.getQuery()));
			// new QueryGenerator(as,sdf);
		}
		log.debug("Matched text :" + listStr);

		return nnq;
	}

	private List<QGInput> prepareQG(List<String> listStr) {
		List<QGInput> lst = new ArrayList<>();
		QGInput qgi;
		for (String str : listStr) {
			String mtStr = null;
			qgi = new QGInput();
			mtStr = PatternMatcher.match(str, Constants.GET_QUERY_NAME_PATTERN);
			if (null != mtStr)
				qgi.setQueryName(Constants.GET_PREFIX
						+ (mtStr.trim().length() > 31 ? mtStr.trim().substring(0, 30) : mtStr.trim()));
			qgi.setQuery(str);
			//log.debug("Query param key :" + mtStr + " Query :" + str);
			lst.add(qgi);
		}
		return lst;
	}

	public List<NamedQuery> parseNQ() {

		return null;
	}
}
