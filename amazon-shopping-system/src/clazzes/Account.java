package clazzes;

import clazzes.entities.Product;
import clazzes.entities.ProductReview;
import enums.AccountStatus;

import java.util.List;

public class Account {
    String userName;
    String password;
    private AccountStatus accountStatus;
    private String name;
    private String email;
    private String phone;

    private List<CreditCard> creditCards;
    private List<ElectronicBankTransfer> electronicBankTransfers;

    public boolean addProduct(Product product) {
        return true;
    }
    public boolean addProductReview(ProductReview productReview) {return true;}
    


}
