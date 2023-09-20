package com.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ManagerController {

	@Autowired
	ManagerService ms;
	

	
	@RequestMapping(value="/manager",method=RequestMethod.GET,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public List<Manager> getAllManager()
	{
		System.out.println("Manager Controller");
		return ms.getAllManagers();
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/managerLogin",method=RequestMethod.POST,produces= "application/json")
	public Boolean ManagerLogin(@RequestBody Manager newManager	)
	{
		return ms.checkManager(newManager.getManagerUsername(),newManager.getPassword());
	}
	
	@RequestMapping(value="/manager",method=RequestMethod.POST)
	public String addManager(@RequestBody Manager newManager	)
	{
		return ms.addManager(newManager);
	}
	
	@RequestMapping(value="/manager/id/{id}",method=RequestMethod.DELETE)
	
	public String removeManager(@PathVariable("id") int cid) {
		System.out.println( "The manager id given is "+ cid);
		return ms.deleteById(cid);
	}
}
