package com.zerogyan.narayanisena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zerogyan.narayanisena.model.Person;
import com.zerogyan.narayanisena.service.PersonService;

@Controller
@RequestMapping(value="/person")
public class PersonController {

	@Autowired
	PersonService personService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("person_list");
	  List<Person> personList = personService.getAllPerson();
	  model.addObject("personList", personList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addPerson/", method=RequestMethod.GET)
	 public ModelAndView addStudent() {
		 
	  ModelAndView model = new ModelAndView();
	  Person person = new Person();
	  model.addObject("personForm", person);
	  model.setViewName("person_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editStudent/{id}", method=RequestMethod.GET)
	 public ModelAndView editStudent(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Person person = personService.getPersonById(id);
	  model.addObject("personForm", person);
	  model.setViewName("person_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addPerson", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("personForm") Person person) {
		 
	  personService.addPerson(person);
	  return new ModelAndView("redirect:/perosn/list");
	  
	 }
	 
	 @RequestMapping(value="/deletePerson/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  personService.deletePerson(id);
	  return new ModelAndView("redirect:/person/list");
	  
	 }
	
	
	
}