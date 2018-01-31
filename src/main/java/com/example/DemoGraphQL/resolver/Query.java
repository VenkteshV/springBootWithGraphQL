package com.example.DemoGraphQL.resolver;
import com.example.DemoGraphQL.repositories.*;
import com.example.DemoGraphQL.models.*;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
public class Query implements GraphQLQueryResolver{
  private BookRepository bookRepository;
  private AuthorRepository authorRepository;

	/**
	* Default empty Query constructor
	*/
	public Query() {
		super();
	}

	/**
	* Default Query constructor
	*/
	public Query(BookRepository bookRepository, AuthorRepository authorRepository) {
		super();
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

  public Iterable<Book> findAllBooks() {
     return bookRepository.findAll();
   }

   public Iterable<Author> findAllAuthors() {
     return authorRepository.findAll();
   }

   public long countBooks() {
      return bookRepository.count();
    }
    public long countAuthors() {
       return authorRepository.count();
     }
}
