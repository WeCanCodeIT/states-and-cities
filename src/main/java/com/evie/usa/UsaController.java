package com.evie.usa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsaController {

	@Resource
	private StateRepository stateRepo;

	@Resource
	private CityRepository cityRepo;

	@RequestMapping("/states")
	public String retrieveStates(Model model) {
		model.addAttribute("states", stateRepo.findAll());
		return "statesList";

	}

	@RequestMapping("/cities")
	public String retrieveCities(Model model) {
		model.addAttribute("cities", cityRepo.findAll());
		return "citiesList";
	}

	@RequestMapping("/state")
	public String retrieveState(@RequestParam ("id") long id, Model model) {
		model.addAttribute(stateRepo.findOne(id));
		return "state";
	}
	
	@RequestMapping("/city")
	public String retrieveCity(@RequestParam ("id") long id, Model model) {
		model.addAttribute(cityRepo.findOne(id));
		return "city";
	}

}
