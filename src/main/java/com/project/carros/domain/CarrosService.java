package com.project.carros.domain;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.tools.javac.util.Assert;

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
	
	public Carro insert(Carro carro) {
		Assert.isNull(carro.getId(), "Não foi possível atualizar o registro");
		
		return rep.save(carro);
	}
}
