package com.example.konoplastiy;

import com.example.konoplastiy.entity.Human;
import com.example.konoplastiy.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Random;

@SpringBootApplication
public class KonoplastiyTestApplication implements CommandLineRunner {


	private PeopleRepository peopleRepository;

	@Autowired
	public KonoplastiyTestApplication(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDate time[] = new LocalDate[] {
				LocalDate.of(2002,12,2),
				LocalDate.of(2010,12,2),
				LocalDate.of(1980,12,2),
				LocalDate.of(1997,12,2),
				LocalDate.of(2013,12,2)
		};

		Random random = new Random();

		for (int i = 1; i < 20; i++) {
			Human human = new Human();
			human.setFirstName("Tom" + i);
			human.setLastName("Kekson" + i);
			human.setBirthday(time[random.nextInt(4)]);
			peopleRepository.save(human);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(KonoplastiyTestApplication.class, args);
	}




}
