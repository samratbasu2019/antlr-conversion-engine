package com.org.infy.cpc.j2j.transformer;

import org.apache.log4j.Logger;

import com.org.infy.cpc.jaxb.EntityMappings.NamedNativeQuery;
import com.org.infy.cpc.jaxb.EntityMappings.NamedQuery;

public class QueryGenerator {
	private final static Logger log = Logger.getLogger(QueryGenerator.class);		
	public NamedNativeQuery generateNativeNamedQuery(String queryName, String query) {
		log.debug("Native Named Query Name is : " + queryName + " & Query : "+query);
		NamedNativeQuery namedNativeQuery = new NamedNativeQuery();			
		namedNativeQuery.setName(queryName);
		namedNativeQuery.setQuery(query);		
		return namedNativeQuery;
	}
	
	public NamedQuery generateNamedQuery(String queryName, String query) {
		log.debug("Name Query Name is : " + queryName + " & Query : "+query);
		NamedQuery namedQuery = new NamedQuery();			
		namedQuery.setName(queryName);
		namedQuery.setQuery(query);		
		return namedQuery;
	}
}
