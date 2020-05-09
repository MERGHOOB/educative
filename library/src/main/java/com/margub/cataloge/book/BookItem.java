package com.margub.cataloge.book;

import com.margub.reservation.BookLending;
import com.margub.messages.MessageDisplay;

import java.util.Date;

public class BookItem extends Book {

    private String barcode;
    private boolean isReferenceOnly; // if true not available for checkout

    private Date borrowed;
    private Date dueDate;

    private BookFormat bookFormat;
    private BookStatus bookStatus;

    private Date dateOfPurchase;
    private Date publicationDate;

    private Rack placeAt;


    public boolean checkout(String memberId) {
        if (isReferenceOnly) {
            MessageDisplay.showError("This book is reference only, can't be issued");
            return false;
        }
        if (!BookLending.lendBook(this.barcode, memberId)) {
            return false;
        }
        this.updateBookItemStatus(BookStatus.LOANED);
        return true;
    }

    private void updateBookItemStatus(BookStatus loaned) {
        bookStatus = loaned;
    }


}
