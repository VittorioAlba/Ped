package it.ped.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.ped.entities.Film;
import it.ped.entities.Inventory;
import it.ped.services.RentService;
import it.ped.services.StoreService;

@Controller
@RestController
public class RentController {

	@Autowired
	public RentService rentService;
	
	@Autowired
	public StoreService storeService;
	
	
	@GetMapping("/hello")
	public String greatings() {
		    String greatings = "ciao";
		    return greatings;
		  }
	
	@GetMapping("/findFilm")
	public List<Film> all() {
		    return rentService.findFilmToRent();
		  }
		  // end::get-aggregate-root[]

	@PostMapping("/film")
	public Film newEmployee(@RequestBody Film newFilm) {
		    return storeService.saveFilm(newFilm);
		  }

		  // Single item
	@GetMapping("/film/{id}")
	public Film filmDetails(@PathVariable Integer id) {
		    return rentService.findById(id);
		  }
	
	@GetMapping("/filminventory/{id}")
	public List<Inventory> filmInventoryDetails(@PathVariable Integer id) {
		    return rentService.findFilmInventory(id);
		  }
	
}
