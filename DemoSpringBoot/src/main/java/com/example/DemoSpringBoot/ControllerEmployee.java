package com.example.DemoSpringBoot;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerEmployee {
	  
  ArrayList<EmployeeEntity>employeeList=new ArrayList<>();
  EmployeeEntity obj = new EmployeeEntity();
    @RequestMapping("/Add")
    //Add some data in the list!
  public String A(int id,String ename,int salary,String desiganation,int experience) {
	  System.out.println("Welcome To Method A");
	 obj.id=id;
	 obj.ename=ename;
	 obj.salary=salary;
	 obj.designation=desiganation;
	 obj.experience=experience; 
	 employeeList.add(obj);
	 return "Added Successfully";
	  
  }
    @RequestMapping("/list")
    //Show all the list in the web services!
    public ArrayList<EmployeeEntity>B(){
    	
    	System.out.print("Displayying All info");
    	return employeeList;  	
    }
    @RequestMapping("/search")
  //find the particular element fetch on the employee id and show From list !
    public EmployeeEntity find(int id) {
	  for (int i = 0; i < employeeList.size(); i++) {
		if(employeeList.get(i).id==id) {
			return employeeList.get(i);
		}
		
	}
      return null;
      
	}
    @RequestMapping("/removeall")
    //Remove all the element showing in the web service in the web page!
    public String removeall() {
		// TODO Auto-generated method stub
    	employeeList.clear();
      return "All data remove";
	}
    @RequestMapping("/delete")
    //delete the particular element fetch on the employee id and delete From list !
    public String delete(int id) {
		
    	for(int i=0;i<employeeList.size();i++) {
    		if(employeeList.get(i).id==id) {
    			 employeeList.remove(i);
    		}
    	}
    	return "Data deleted from the id!";

	}
    //Update ename in list!
    @RequestMapping("/UpdateName")
      public String updateEname(int id ,String ename) {
		// TODO Auto-generated method stub
        for(int i=0;i<employeeList.size();i++) {
        	if(employeeList.get(i).id==id) {
        		employeeList.get(i).ename=ename;
        	}
        }
        return "Updated!";
       
        }
    //update desigantion in the list!
    @RequestMapping("/UpdateDesi")
    public String updateDesiganation(int id,String desiganation) {
    	for(int i=0;i<employeeList.size();i++) {
    		if(employeeList.get(i).id==id) {
    			employeeList.get(i).designation=desiganation;
    		}
    	}
    	return "Updated!";
	}
}