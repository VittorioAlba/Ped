package it.ped.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.ped.entities.Film;
import it.ped.repositories.FilmRepository;

@Service
public class StoreService {
	
	@Autowired
	private FilmRepository filmRepo;
	
	
	public Film saveFilm (Film newFilm) {
		return filmRepo.save(newFilm);
	}

}
