package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ManagerService {
	
	@Autowired
	ManagerRepository mRepository;
	
	public String addManager(Manager manager)
	{
		mRepository.save(manager);
		return "Successfully Added";
	}
	
	public List<Manager> getAllManagers()
	{
		
		List<Manager> allManager =  mRepository.findAll();
		return allManager;
	}
	
	public String deleteById(int id)
	{
		mRepository.delete(id);
		return "Successfully Deleted";
	}
	
	public Boolean checkManager(String managerUsername,String password)
	{
		Manager manager = mRepository.findByUsernameAndPassword(managerUsername, password);
		if(Objects.nonNull(manager)&& managerUsername.equals(manager.getManagerUsername()) && password.equals(manager.getPassword()))
		 return true;
		else 
			return false;
	}

}
