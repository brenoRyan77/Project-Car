package com.project.carros.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.carros.domain.Carro;
import com.project.carros.domain.CarrosService;

@RestController
@RequestMapping("/api/v1/carros")
public class CarrosController {
	
	@Autowired
	private CarrosService service;
	
	@GetMapping()
	public Iterable<Carro> get() {
		return service.getCarros();
	}

}
