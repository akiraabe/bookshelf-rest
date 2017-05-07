package org.work;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.work.domain.model.Book;
import org.work.domain.repository.BookRepository;
import org.work.util.DateUtils;

/**
 * DatabaseLoader.
 * <pre>
 *     Loading demo data to database before app running.
 *     It implements Spring Boot’s CommandLineRunner so that it gets run after all the beans are created and registered.
 * </pre>
 * Created by akiraabe on 2017/05/07.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private final BookRepository repository;

    public DatabaseLoader(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Book("Domain Driven Design","Addison-Wesley Professional", "Eric Evans", DateUtils.parse("2003-08-22")));
        this.repository.save(new Book("Patterns of Enterprise Application Architecture","Addison-Wesley Professional", "Martin Fowler", DateUtils.parse("2002-11-05")));
        this.repository.save(new Book("Django X python","技術評論社", "露木 誠",DateUtils.parse("2009-03-10")));
    }
}
