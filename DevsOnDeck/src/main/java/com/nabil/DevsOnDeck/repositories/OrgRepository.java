package com.nabil.DevsOnDeck.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nabil.DevsOnDeck.models.Organization;

public interface OrgRepository extends CrudRepository<Organization, Long> {
	Optional<Organization> findByEmail(String email);

	List<Organization> findAll();

}
