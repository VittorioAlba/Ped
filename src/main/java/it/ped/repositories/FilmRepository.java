package it.ped.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import it.ped.entities.Film;


public interface FilmRepository extends JpaRepository<Film, Integer> {

	  List<Film> findByTitle(String title);
	  
	  Optional<Film> findById(Integer id);
	  
	}
