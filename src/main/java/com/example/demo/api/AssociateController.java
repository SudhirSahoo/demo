package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Associate;
import com.example.demo.service.AssociateService;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AssociateController {

	private List<Associate> associates = createList();
	
	@Autowired
	AssociateService associateService;
	
	@RequestMapping(value = "/associates", method = RequestMethod.GET, produces = "application/json")
	public List<Associate> firstPage() {
		return associates;
	}
	
	private static List<Associate> createList() {
		List<Associate> tempAssociates = new ArrayList<>();
		Associate associate1 = new Associate();
		associate1.setFirstName("emp1");
		associate1.setLastName("emp1");
		//associate1.setId("1");

		Associate associate2 = new Associate();
		associate2.setFirstName("emp2");
		associate2.setLastName("emp2");
		//associate2.setId("2");

		tempAssociates.add(associate1);
		tempAssociates.add(associate2);
		return tempAssociates;
	}

	@RequestMapping(value="/api/associate/findall", method = RequestMethod.GET, produces = "application/json")
	public List<Associate> getAllAssociates() {
		List<Associate> allAssociateList = associateService.findAll();
		
		return allAssociateList;
	}
	
	@RequestMapping(value = "/api/associate/create", method = RequestMethod.POST, consumes = "application/json")
    public Associate create(@RequestBody Associate associate) {
		associate = associateService.create(associate);
    	return associate;
    }
	
}
