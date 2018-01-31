package com.example.DemoGraphQL.resolver;
import com.example.DemoGraphQL.models.*;
import com.example.DemoGraphQL.repositories.*;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
public class Mutation implements GraphQLMutationResolver {
  private BookRepository bookRepository;
  private AuthorRepository authorRepository;


	/**
	* Default empty Mutation constructor
	*/
	public Mutation() {
		super();
	}

	/**
	* Default Mutation constructor
	*/
	public Mutation(BookRepository bookRepository, AuthorRepository authorRepository) {
		super();
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

  public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setlastName(lastName);

        authorRepository.save(author);

        return author;
    }

    public Book newBook(String title, String isbn, Integer pageCount, Long authorId) {
        Book book = new Book();
        book.setAuthor(new Author(authorId));
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setPageCount(pageCount != null ? pageCount : 0);

        bookRepository.save(book);

        return book;
    }

    public boolean deleteBook(Long id) {
      bookRepository.delete(id);
      return true;
  }

  public Book updateBookPageCount(Integer pageCount, Long id) {
     Book book = bookRepository.findOne(id);
     book.setPageCount(pageCount);

     bookRepository.save(book);

     return book;
 }
}
