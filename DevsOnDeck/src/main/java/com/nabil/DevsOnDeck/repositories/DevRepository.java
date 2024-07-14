package com.nabil.DevsOnDeck.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nabil.DevsOnDeck.models.Developer;

public interface DevRepository extends CrudRepository<Developer, Long> {
	Optional<Developer> findByEmail(String email);

	List<Developer> findAll();

}
