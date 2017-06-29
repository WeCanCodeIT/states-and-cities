package com.evie.usa;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UsaPopulator implements CommandLineRunner{

	@Resource
	private StateRepository stateRepo;
	
	@Resource
	private CityRepository cityRepo;
	
	@Override
	public void run(String... args) throws Exception {
		State ohio=new State("Ohio");
		State california=new State("California");
		State texas=new State("Texas");
		
		stateRepo.save(ohio);
		stateRepo.save(california);
		stateRepo.save(texas);
	
		
		City springfield=new City(ohio, "Springfield");
		City columbus=new City(ohio, "Columbus");
		City austin=new City(texas, "Austin");
		
		cityRepo.save(springfield);
		cityRepo.save(columbus);
		cityRepo.save(austin);
	}
}
