package com.zerogyan.narayanisena.repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;

import com.zerogyan.narayanisena.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	/* @Query("SELECT * FROM profile_tb")
	List<Person> findAll();

	@Query("SELECT * FROM profile_tb")
	Object findById(int id);
	


	@Query("SELECT * FROM profile_tb")
	void save(Person person);


	@Query("SELECT * FROM profile_tb from ")
	void deleteById(@Param("ID") int id);  */
}




