package org.work.domain.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by akiraabe on 2017/05/07.
 */
@Data
@ToString
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String publisher;

    private String author;

    @Temporal(value = TemporalType.DATE)
    private Date publishDate;

    private Book() {}
    public Book(String title, String publisher, String author, Date publishDate) {
        System.out.println("Book#constructor");
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.publishDate = publishDate;
    }
}
