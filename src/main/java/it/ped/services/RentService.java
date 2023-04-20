package it.ped.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ped.entities.Film;
import it.ped.entities.Inventory;
import it.ped.repositories.FilmRepository;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class RentService {
	
	
	@Autowired
	private FilmRepository filmRepo;
	
	public List<Film> findFilmToRent() {

		return filmRepo.findAll();	
	}
	
	public Film findById(Integer id) {
		log.debug("I'm looking for a film with id: "+id);
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.trace("trace");
		return filmRepo.findById(id).get();
	}
	
	public List<Inventory> findFilmInventory(Integer id) {
		return filmRepo.findById(id).get().getInventories();
	}
	
	
	
	
}
