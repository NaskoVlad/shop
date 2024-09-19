package baseProduct;

import product.Product;

import java.util.ArrayList;
import java.util.List;

/*
База продуктов
Даннный класс используется для хранения Product
 */
public class BaseProduct {
    private static BaseProduct baseProduct;

    private BaseProduct() {
    }

    public static BaseProduct getBaseProduct() {
        if (baseProduct == null) {
            baseProduct = new BaseProduct();
        }
        return baseProduct;
    }

    private List<Product> base = new ArrayList<>();
    private StringBuilder list = new StringBuilder();

    public void addition(Product product) {
        base.add(product);
    }

    public List<Product> getProduct() {
        return base;
    }

    public String toString() {
        for (int i = 0; i < base.size(); i++) {
            list = list.append(i + 1).append(". ").append(base.get(i)).append("\n");
        }
        ;
        return list.toString();
    }
}
