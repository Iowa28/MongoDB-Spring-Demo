package ru.kpfu.aminovniaz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoDbSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbSpringDemoApplication.class, args); }

	@Bean
	public CommandLineRunner runner(StudentRepository repository) {
		return args -> repository.insert(Student.builder()
				.firstname("Niaz")
				.lastname("Aminov")
				.address(Address.builder()
						.country("Russia")
						.city("Zainsk")
						.postCode("423520").build())
				.email("yazzzik@list.ru")
				.gender(Gender.MALE)
				.favouriteSubjects(List.of("Java", "Unity", "PostgreSQL"))
				.created(LocalDateTime.now())
				.totalSpentInBooks(BigDecimal.TEN)
				.build());
	}

}
