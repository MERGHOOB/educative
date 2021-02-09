package com.margub.library;

import java.util.Date;

public class LibraryCard {
    String barcode;
    String cardNumber;
    Date issuedAt;
    Date validTill;

    private ActiveStatus activeStatus;

    public boolean isActive() {
        return activeStatus == ActiveStatus.ACTIVE;
    }

    public void setActiveStatus(ActiveStatus activeStatus) {
        this.activeStatus = activeStatus;
    }
}
