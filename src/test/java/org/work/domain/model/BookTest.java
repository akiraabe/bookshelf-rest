package org.work.domain.model;

import org.junit.Test;
import org.work.util.DateUtils;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by akiraabe on 2017/05/07.
 */
public class BookTest {

    @Test
    public void testNormalCase() {

        Book book = new Book("DDD", "OREILLY", "Eric Evans", DateUtils.parse("2003-01-01"));
//        assertThat(book.getId(), is(1L));
        assertThat(book.getTitle(), is("DDD"));

    }
}
