package clazzes.searchrelated;

import clazzes.entities.Product;

import java.util.List;

public interface Search {

    public List<Product> searchProductByName(String name);
    public List<Product> searchProductByCategor(String category);
}
