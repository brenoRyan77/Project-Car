package com.project.carros.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrosService {

	@Autowired
	private CarrosRepository rep;
	
	public Iterable<Carro> getCarros(){
		return rep.findAll();
	}
	
	public List<Carro> getCarrosFake(){
	 List<Carro> carros = new ArrayList<>();
	 
	 carros.add(new Carro(1L, "Fusca"));
	 carros.add(new Carro(2L, "Brasília"));
	 carros.add(new Carro(3L, "Chevette"));
	 
	 return carros;
	}
}
