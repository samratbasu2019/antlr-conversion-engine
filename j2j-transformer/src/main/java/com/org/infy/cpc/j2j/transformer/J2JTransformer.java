package com.org.infy.cpc.j2j.transformer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;
import com.org.infy.cpc.jaxb.*;
import com.org.infy.cpc.jaxb.EntityMappings.NamedNativeQuery;
import com.org.infy.cpc.jaxb.EntityMappings.NamedQuery;
import com.org.infy.cpc.parser.FileParser;

public class J2JTransformer 
{
	private final static Logger log = Logger.getLogger(J2JTransformer.class);
	private static final String FILE_NAME = "/named-query.xml";
    public  static void starter(String interimFilePath, String outputPath) throws JAXBException
    {
    	log.debug("J2JTransformer interim file path : "+interimFilePath+" Output path : "+outputPath);
    	JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        EntityMappings em = (EntityMappings) unmarshaller.unmarshal(new File("named-query.xml")); 
        final String dir = System.getProperty("user.dir");
        List<NamedNativeQuery> nnq = new FileParser().parseNNQ(interimFilePath);
        //List<NamedQuery> nq = new FileParser().parseNQ();
        em.getNamedNativeQuery().addAll(nnq);
        //em.getNamedQuery().addAll(nq);            
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(em, new File(outputPath+FILE_NAME));
        log.debug("NamedQuery XML {} Successfully created...");
    }
}
