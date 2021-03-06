package com.projects.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projects.crud.entity.BookCategory;


@RepositoryRestResource(collectionResourceRel="bookCategory" , path="book-category")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
