package it.ped.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.ped.entities.Address;


public interface AddressRepository extends JpaRepository<Address, Integer> {
	  
	  Optional<Address> findById(Integer id);
	  
	}
