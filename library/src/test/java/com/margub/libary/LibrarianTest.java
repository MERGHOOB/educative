package com.margub.libary;

import com.margub.cataloge.book.BookItem;
import com.margub.library.Librarian;
import org.junit.Test;

public class LibrarianTest {

    @Test
    public void insertBookIntoLibrary() {
        BookItem bookItem = new BookItem();
        Librarian librarian = new Librarian();
        librarian.addBookItem(bookItem);
    }



}
