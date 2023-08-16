package com.tran.dojosNninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tran.dojosNninjas.models.Dojo;
import com.tran.dojosNninjas.models.Ninja;
import com.tran.dojosNninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	public void addNinjaToDojo(Ninja n, Dojo d) {	//fills "dojo_id" column in Ninjas table with correct id
		n.setDojo(d);
		this.ninjaRepository.save(n);
	}
}