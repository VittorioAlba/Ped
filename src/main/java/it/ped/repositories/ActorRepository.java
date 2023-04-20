package it.ped.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ped.entities.Actor;


public interface ActorRepository extends JpaRepository<Actor, Integer> {

	  List<Actor> findByLastName(String lastName);
	  
	  Optional<Actor> findById(Integer id);
	  
	}
