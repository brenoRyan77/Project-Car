package com.project.carros.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrosService {

	@Autowired
	private CarrosRepository rep;
	
	public Iterable<Carro> getCarros(){
		return rep.findAll();
	}
	
	public Optional<Carro> getCarrosById(Long id) {
		return rep.findById(id);
		
	}

	public Iterable<Carro> getCarrosByTipo(String tipo) {
		return rep.findByTipo(tipo);
	}

	public Carro save(Carro carro) {
		return rep.save(carro);
	}
}
