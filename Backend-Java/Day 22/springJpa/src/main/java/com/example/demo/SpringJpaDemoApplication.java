package com.example.demo;

import java.util.List;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
 
import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
 
@SpringBootApplication
public class SpringJpaDemoApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(ProductRepository repository) {
		return(args)->{
			repository.save(new Product("Java","Book",700));
			repository.save(new Product("Java","Book",700));
			repository.save(new Product("Java","Book",700));
			repository.save(new Product("Java","Book",700));
			Product myPrd=repository.findById(2).get();
			myPrd.setPrdName("Spring");
			myPrd.setPrdPrice(2300);
			repository.save(myPrd);
			System.out.println(myPrd);
			System.out.println("Product Listing");
			repository.findAll().forEach(System.out::println);
		};
	}
}
