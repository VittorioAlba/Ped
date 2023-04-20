package it.ped.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ped.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

	  List<Category> findByName(String lastName);
	  
	  Optional<Category> findById(Integer id);
	  
	}
