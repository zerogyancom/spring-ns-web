package com.zerogyan.narayanisena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zerogyan.narayanisena.model.Person;
import com.zerogyan.narayanisena.repository.PersonRepository;


@Service
@Transactional
public class PersonServiceImplementation implements PersonService {

	@Autowired
	PersonRepository personRepository;
	
	
	@Override
	public List<Person> getAllPerson() {
		return (List<Person>) personRepository.findAll();
	}

	@Override
	public Person getPersonById(int id) {
		return personRepository.findById(id).get();
	}

	@Override
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	
	@Override
	public void updatePerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public void deletePerson(int id) {
		personRepository.deleteById(id);
	}

}