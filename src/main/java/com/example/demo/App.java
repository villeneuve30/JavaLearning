package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

//	@Bean
//	public CommandLineRunner addAnimal( AnimalRepository animalRepository, PaysRepository paysRepository, FoodRepository foodRepository )
//	{
//		return (args) -> {
//			Food f1 = new Food( "viande" , 1.5, 5.99);
//			Food f2 = new Food( "salade" , 0.5, 2.00);
//			Food f3 = new Food( "graine" , 1.0, 1.50);
//			foodRepository.save( f1 );
//			foodRepository.save( f2 );
//			foodRepository.save( f3 );
//
//			List<Animal> animaux = animalRepository.findAll();
//			for( Animal a : animaux )
//			{
//				if (a.getNom().equals("aligator")) {
//					a.addFood( f1 );
//				}
//
//				if (a.getNom().equals("cheval")) {
//					a.addFood( f2 );
//					a.addFood( f3 );
//				}
//
//				if (a.getNom().equals("hippopotame")) {
//					a.addFood( f1 );
//					a.addFood( f2 );
//					a.addFood( f3 );
//				}
//				animalRepository.save(a);
//			}
//		};
//	}

//	@Bean
//	public CommandLineRunner addEmployee(EmployeeRepository employeeRepository) {
//		return (args) -> {
//			log.info("Preloading " + employeeRepository.save(new Employee("Bilbo Baggins", "burglar")));
//			log.info("Preloading " + employeeRepository.save(new Employee("Frodo Baggins", "thief")));
//		};
//	}

//	@Bean
//	CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
//
//		return args -> {
//			employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
//			employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));
//
//			employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));
//
//
//			orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
//			orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));
//
//			orderRepository.findAll().forEach(order -> {
//				log.info("Preloaded " + order);
//			});
//
//		};
//	}

}
