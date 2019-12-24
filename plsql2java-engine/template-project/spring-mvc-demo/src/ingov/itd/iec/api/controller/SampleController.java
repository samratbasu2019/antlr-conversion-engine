package ingov.itd.iec.api.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ingov.itd.iec.api.model.ToDo;
import ingov.itd.iec.api.response.Response;
import ingov.itd.iec.api.service.SampleService;

@RestController
public class SampleController {
	private final static Logger log = Logger.getLogger(SampleController.class);
	@Autowired
	SampleService service;
	Response response = new Response();


	@RequestMapping(value = "[uri]", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Object addUser(@RequestBody ToDo todo) {
		//To Do
		return response;
	}

	@RequestMapping(value = "[uri]", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUserDetails(@RequestParam("todo") String todo) {
		//To do	
		return response != null ? new ResponseEntity<Object>(response, HttpStatus.OK)
				: new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}
}