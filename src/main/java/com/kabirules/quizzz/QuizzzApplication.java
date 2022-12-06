package com.kabirules.quizzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizzzApplication {

	// private static final Logger log = LoggerFactory.getLogger(QuizzzApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(QuizzzApplication.class, args);
	}
/*
	@Bean
	ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {

		ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
		initializer.setConnectionFactory(connectionFactory);
		initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("schema.sql")));

		return initializer;
	}

	@Bean
	public CommandLineRunner demo(QuizzRepository repository) {

		return (args) -> {
			// save a few customers
			repository.saveAll(Arrays.asList(new Quizz("Jack", "Bauer"),
							new Quizz("Chloe", "O'Brian"),
							new Quizz("Bauer", "Kim"),
							new Quizz("David", "Palmer"),
							new Quizz("Michelle", "Dessler")))
					.blockLast(Duration.ofSeconds(10));

			// fetch all quizzes
			log.info("Quizzes found with findAll():");
			log.info("-------------------------------");
			repository.findAll().doOnNext(quizz -> {
				log.info(quizz.toString());
			}).blockLast(Duration.ofSeconds(10));

			log.info("");

			// fetch an individual quizz by ID
			repository.findById(1L).doOnNext(quizz -> {
				log.info("Quizz found with findById(1L):");
				log.info("--------------------------------");
				log.info(quizz.toString());
				log.info("");
			}).block(Duration.ofSeconds(10));


			// fetch quizzes by last name
			log.info("Quizz found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByName("Bauer").doOnNext(quizz -> {
				log.info(quizz.toString());
			}).blockLast(Duration.ofSeconds(10));;
			log.info("");
		};
	}
*/
}
