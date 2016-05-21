package com.victor.playground.repository;

import com.victor.playground.domain.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Book entity.
 */
@SuppressWarnings("unused")
public interface BookRepository extends MongoRepository<Book,String> {

}
