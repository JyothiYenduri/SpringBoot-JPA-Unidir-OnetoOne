package com.example.onetooneuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetooneuni.entity.Passport;
import com.example.onetooneuni.entity.Person;
import com.example.onetooneuni.repository.PersonRepository;

@SpringBootApplication
public class OneToOneUniApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OneToOneUniApplication.class, args);
	}
	@Autowired
	private PersonRepository pr;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Passport p=new Passport();
		p.setNumber("AP12345");
		
		Person per=new Person();
		per.setName("Vinay");
		per.setPassport(p);
		pr.save(per);
		
	}

}
