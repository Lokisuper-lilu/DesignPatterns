package com.superlilu.inheritAdapter.utils;

import com.superlilu.dao.Aggregate;
import com.superlilu.dao.Iterator;
import com.superlilu.pojo.Book;

@SuppressWarnings("unused")
public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void addBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
