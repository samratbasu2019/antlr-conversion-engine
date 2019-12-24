package ingov.itd.iec.api.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ingov.itd.iec.api.dao.SampleDAO;
import ingov.itd.iec.api.entity.SampleEntity;
import ingov.itd.iec.api.model.ToDo;


@Service
public class SampleService {
	@Autowired
	SampleDAO userDAO;

	
	public boolean addUser(ToDo todo) {
		boolean result=false;
		SampleEntity entity = new SampleEntity();
		  try {

	         //To do
	    	}
		  	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	        return result;
		
	}
	

	public List<ToDo> getUser() {
		List<ToDo> result = null;
		
		  try {
	   	    	
		    	//to do
	         
	    	}
		  	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	        return result;
		
	}

}
