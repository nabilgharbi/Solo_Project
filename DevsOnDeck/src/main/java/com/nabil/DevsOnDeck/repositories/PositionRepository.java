package com.nabil.DevsOnDeck.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nabil.DevsOnDeck.models.Position;

public interface PositionRepository extends CrudRepository<Position, Long> {
	List<Position> findAll();

}
