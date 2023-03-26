package eu.epfc.c6077.lesson23.lesson23;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Demoh2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demoh2Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CatRepository catRepository) {
		return args -> {
			catRepository.save(new Cat(null, "persan", 45.3, 4.3));
			catRepository.save(new Cat(null, "chat de gouttière", 37, 3.5));

			List<Cat> cats = catRepository.findAll();
			for (Cat c : cats) {
				System.out.println(c.getId() + " " + c.getBreed());
			}
		};
	}
}
