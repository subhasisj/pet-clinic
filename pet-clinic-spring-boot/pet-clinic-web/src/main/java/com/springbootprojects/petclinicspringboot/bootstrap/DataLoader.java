package com.springbootprojects.petclinicspringboot.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Vet;
import com.springbootprojects.petclinicspringboot.service.OwnerService;
import com.springbootprojects.petclinicspringboot.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 =  new Owner();
		owner1.setId(1l);
		owner1.setFirstName("Subhasis");
		owner1.setLastName("Jethy");
		ownerService.Save(owner1);

		Owner owner2 =  new Owner();
		owner2.setId(2l);
		owner2.setFirstName("Avilipsha");
		owner2.setLastName("Tripathy");
		ownerService.Save(owner2);
		
		System.out.println("Owners Created");

		Vet vet1 = new Vet();
		vet1.setId(1l);
		vet1.setFirstName("James");
		vet1.setFirstName("Bond");
		vetService.Save(vet1);

		Vet vet2 = new Vet();
		vet1.setId(2l);
		vet2.setFirstName("Darth");
		vet2.setFirstName("Vader");
		vetService.Save(vet2);

		System.out.println("Vets Created");
	}

	protected DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	
	
}
