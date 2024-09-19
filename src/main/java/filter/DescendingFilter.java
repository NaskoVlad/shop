package filter;

import baseProduct.BaseProduct;
import product.Product;

import java.util.Comparator;
import java.util.List;

public class DescendingFilter implements Filter {
    BaseProduct baseProduct = BaseProduct.getBaseProduct();

    @Override
    public void filter() {
        int a;
        List list = baseProduct.getProduct().stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();
        for (int i = 0; i < list.size(); i++) {
            a = i + 1;
            System.out.println(a + "" + list.get(i));
        }
    }
}
