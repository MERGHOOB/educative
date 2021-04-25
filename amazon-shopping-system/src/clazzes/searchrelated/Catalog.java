package clazzes.searchrelated;

import clazzes.entities.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalog implements Search  {

    Map<String,  List<Product>> productNames;
    Map<String,  List<Product>> productCategories;

    @Override
    public List<Product> searchProductByName(String name) {
        return productNames.get(name);
    }

    @Override
    public List<Product> searchProductByCategor(String category) {
        return productCategories.get(category);
    }
}
