package br.com.lbs.libary_system.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lbs.libary_system.model.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Integer>{
    public Book findByTitle(String title);
    public void deleteByTitle(String title);
}
