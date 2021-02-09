package com.margub.library;

import com.margub.cataloge.book.BookItem;

public class Librarian extends LibraryUser {

    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

    public boolean blockMember(String memberId) {
        return false;
    }

    public boolean ubBlockMember(String memberId) {
        return false;
    }
}
