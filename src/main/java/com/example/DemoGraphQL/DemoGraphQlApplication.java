package com.example.DemoGraphQL;
import com.example.DemoGraphQL.models.*;
import com.example.DemoGraphQL.repositories.*;
import com.example.DemoGraphQL.resolver.*;
import org.springframework.context.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGraphQlApplication {
	@Bean
	public BookResolver authorResolver(AuthorRepository authorRepository) {
	return new BookResolver(authorRepository);
	}

	@Bean
	public Query query(AuthorRepository authorRepository, BookRepository bookRepository) {
	return new Query(bookRepository, authorRepository);
	}

	@Bean
	public Mutation mutation(AuthorRepository authorRepository, BookRepository bookRepository) {
	return new Mutation( bookRepository,authorRepository);
	}

	@Bean
	 public CommandLineRunner demo(AuthorRepository authorRepository, BookRepository bookRepository) {
		 return (args) -> {
			 Author author = new Author("joshua", "bengio");
			 authorRepository.save(author);

			 bookRepository.save(new Book("Deep learning book", "0071809252", 728, author));
		 };
	 }
	public static void main(String[] args) {
		SpringApplication.run(DemoGraphQlApplication.class, args);
	}


}
