package com.myproject.library_app;
import org.springframework.data.repository.CrudRepository;
import com.myproject.library_app.LibraryBook;

// This will be AUTO IMPLEMENTED by Spring into a Bean called LibraryRepository
// CRUD refers Create, Read, Update, Delete
public interface LibraryBookRepository extends CrudRepository<LibraryBook, Integer> {

}