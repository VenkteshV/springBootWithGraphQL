package com.example.DemoGraphQL.repositories;
import org.springframework.data.repository.CrudRepository;
import com.example.DemoGraphQL.models.*;

public interface AuthorRepository extends CrudRepository<Author, Long> { }
