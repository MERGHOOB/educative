package com.margub.reservation;

import java.util.Date;

public class BookLending {

    private Date creationDate;
    private Date dueDate;
    private String bookItemBarCode;
    private String memberId;


    public static boolean lendBook(String barcode, String memberId) {
        return false;
    }

    public static BookLending fetchLendingDetails(String barcode) {
        return null;
    }
}
