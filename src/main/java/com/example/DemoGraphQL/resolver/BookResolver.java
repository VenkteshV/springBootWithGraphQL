package com.example.DemoGraphQL.resolver;
import com.example.DemoGraphQL.models.*;
import com.example.DemoGraphQL.repositories.*;
import com.coxautodev.graphql.tools.GraphQLResolver;

public class BookResolver implements GraphQLResolver<Book> {
   private AuthorRepository authorRepository;
  public BookResolver(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
   }
   public Author getAuthor(Book book) {
      return authorRepository.findOne(book.getAuthor().getId());
     }
   }
