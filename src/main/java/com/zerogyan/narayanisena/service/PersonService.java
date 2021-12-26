package com.zerogyan.narayanisena.service;
import java.util.List;
import com.zerogyan.narayanisena.model.Person;

public interface PersonService {
	public List<Person> getAllPerson();
	 
	 public Person getPersonById(int id);
	 
	 public void addPerson(Person person);
	 public void updatePerson(Person person);
	 
	 public void deletePerson(int id);
}
