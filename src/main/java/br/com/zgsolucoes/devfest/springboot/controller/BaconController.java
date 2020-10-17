package br.com.zgsolucoes.devfest.springboot.controller;


import br.com.zgsolucoes.devfest.springboot.domain.Bacon;
import br.com.zgsolucoes.devfest.springboot.repository.BaconRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bacon")
public class BaconController {

	private final BaconRepository baconRepository;

	public BaconController(BaconRepository baconRepository) {
		this.baconRepository = baconRepository;
	}

	@GetMapping
	List<Bacon> list() {
		return baconRepository.findAll();
	}
}
