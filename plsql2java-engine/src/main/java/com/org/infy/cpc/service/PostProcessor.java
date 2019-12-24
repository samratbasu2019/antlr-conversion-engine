package com.org.infy.cpc.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.org.infy.cpc.util.Constants;

@Service
public class PostProcessor {
	private static final Logger logger = LoggerFactory.getLogger(PostProcessor.class);
	private final String dir = System.getProperty("user.dir");
	
	public void process(String interimFilePath) {
		boolean hasWSgenerated = generateWorkspace(interimFilePath);
		if (hasWSgenerated)
			configWorkspace(interimFilePath);
	}
	private void configWorkspace (String interimFilePath) {	
		String destDir = dir + Constants.CONFIG_JAVA_FILE_DIR;
		String destXmlDir = dir + Constants.CONFIG_XML_FILE_DIR;
		
		File source = new File(interimFilePath+"/Wrapper.java");
        File dest = new File(destDir);
		
        File sourceXML = new File(interimFilePath+"/named-query.xml");
        File destXML = new File(destXmlDir);
		try {
			logger.info("Source file to be copied :"+source.toString() + " Destination location :"+dest.toString());
			copyFileUsingStream(source,dest);
			copyFileUsingStream(sourceXML,destXML);
			logger.info("Workspace configured successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private boolean generateWorkspace(String interimFilePath) {
		
		boolean hasWorkspaceGenerated = false;
		File srcFolder = new File(dir+Constants.TEMPLATE_PROJ_FOLDER);
		File destFolder = new File(dir+"/final-output");
		if (!srcFolder.exists()) {
			logger.info("Directory does not exist.");
			System.exit(0);

		} else {

			try {
				copyFolder(srcFolder, destFolder);
				hasWorkspaceGenerated = true;
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		logger.info("Workspace copied successfully!");
		return hasWorkspaceGenerated;
	}
	private static void copyFolder(File src, File dest) throws IOException {
		if (src.isDirectory()) {
			if (!dest.exists()) {
				dest.mkdir();
				
			}

			// list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				// construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);

				copyFolder(srcFile, destFile);
			}

		} else {

			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);
			byte[] buffer = new byte[1024];
			int length;
			// copy the file content in bytes
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();
			
		}
	}
	
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	       os.close();
	    }
	}
}
