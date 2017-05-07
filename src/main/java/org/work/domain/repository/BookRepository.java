package org.work.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.work.domain.model.Book;

/**
 * Created by akiraabe on 2017/05/07.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
