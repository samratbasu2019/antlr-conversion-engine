package com.org.infy.cpc.controller;

import com.org.infy.cpc.payload.UploadFileResponse;
import com.org.infy.cpc.service.PLJConverter;
import com.org.infy.cpc.service.PostProcessor;
import com.org.infy.cpc.util.Constants;
import com.org.infy.cpc.service.FileStorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PLJController {

	private static final Logger logger = LoggerFactory.getLogger(PLJController.class);

	@Autowired
	private FileStorageService fileStorageService;
	@Autowired
	private PLJConverter plsqlConverter;
	@Autowired
	private PostProcessor pprocessor;

	@PostMapping("/cpc/plsql/java/conversion")
	public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
		return Arrays.asList(files).stream().map(file -> {
			long starttime = System.currentTimeMillis();

			final String dir = System.getProperty("user.dir");
			final String interimOutput = dir + "/" + Constants.INTERIM_OUTPUT_FOLDER;
			final String finalOutput = dir + "/" + Constants.FINAL_OUTPUT_FOLDER;
			String fileName = fileStorageService.storeFile(file);
			if (plsqlConverter.convert(fileStorageService.getTargetPlSqlLocation().toString(), interimOutput)) {
				logger.info("Calling post processor!");
				pprocessor.process(interimOutput);
			}
			long endtime = System.currentTimeMillis();
			logger.info("Total processing time " + (endtime - starttime) + " ms.");
			return new UploadFileResponse(fileName, file.getContentType(), file.getSize(), finalOutput);
		}).collect(Collectors.toList());
	}
}
