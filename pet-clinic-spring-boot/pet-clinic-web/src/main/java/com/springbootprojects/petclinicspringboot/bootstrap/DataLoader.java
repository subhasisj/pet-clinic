package com.springbootprojects.petclinicspringboot.bootstrap;

import java.time.LocalDate;

import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootprojects.petclinicspringboot.model.Owner;
import com.springbootprojects.petclinicspringboot.model.Pet;
import com.springbootprojects.petclinicspringboot.model.PetType;
import com.springbootprojects.petclinicspringboot.model.Vet;
import com.springbootprojects.petclinicspringboot.service.OwnerService;
import com.springbootprojects.petclinicspringboot.service.PetTypeService;
import com.springbootprojects.petclinicspringboot.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	@Override
	public void run(String... args) throws Exception {
		
		PetType dog =  new PetType();
		dog.setName("Dog");
		petTypeService.save(dog);
		
		PetType cat =  new PetType();
		dog.setName("Cat");
		petTypeService.save(cat);
		
		System.out.println("Pet Types Created");

		Owner owner1 =  new Owner();
		owner1.setFirstName("Subhasis");
		owner1.setLastName("Jethy");
		owner1.setAddess("112 ,Berkley");
		owner1.setCity("New York City");
		owner1.setTelephone("98188912010");
		
		Pet pet1 = new Pet();
		pet1.setPetType(dog);
		pet1.setOwner(owner1);
		pet1.setBirthDate(LocalDate.now());
		pet1.setName("Tommy");
		owner1.getPets().add(pet1);
		
		ownerService.save(owner1);

		Owner owner2 =  new Owner();
		owner2.setFirstName("Avilipsha");
		owner2.setLastName("Tripathy");
		ownerService.save(owner2);

		Pet pet2 = new Pet();
		pet2.setPetType(cat);
		pet2.setOwner(owner2);
		pet2.setBirthDate(LocalDate.now());
		pet2.setName("Meooww");
		owner2.getPets().add(pet2);
		
		System.out.println("Owners Created");

		Vet vet1 = new Vet();
		vet1.setFirstName("James");
		vet1.setLastName("Bond");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Darth");
		vet2.setLastName("Vader");
		vetService.save(vet2);
		
		System.out.println("Vets Created");
	}

	protected DataLoader(OwnerService ownerService, VetService vetService , PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	
	
}
