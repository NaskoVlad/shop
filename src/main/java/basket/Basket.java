package basket;

import baseProduct.BaseProduct;
import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Корзина
public class Basket {
    private static Basket basket;
    private List<Product> listBasket = new ArrayList<>();//Список товаров, которые находятся в корзине
    private int price;
    private StringBuilder list = null;
    Scanner scanner = new Scanner(System.in);
    int answer;
    String line;
    BaseProduct baseProduct = BaseProduct.getBaseProduct();

    private Basket() {
    }

    public static Basket getBasket() {
        if (basket == null) {
            basket = new Basket();
        }
        return basket;
    }

    // Метод, с помощью которого добавляем в корзину продукты
    public void addToCart() {
        System.out.println("Если хотите добавить товар в корзину введите его номер ID");
        answer = scanner.nextInt();
        List<Product> product = baseProduct.getProduct().stream()
                .filter(sc -> sc.getId() == answer)
                .collect(Collectors.toList());
        listBasket.addAll(product);
    }

    // Метод, с помощью которого удаляем из корзины товары
    public void removalFromCart() {
        System.out.println("Какой продукт вы хотите удалить из корзины");
        answer = scanner.nextInt();
        if (answer - 1 < listBasket.size()) {
            listBasket.remove(answer - 1);
        } else {
            System.out.println("Данный товар отсутствует в корзине");
        }
    }

    // Вычисляем сумму, на которую набрали товаров в корзину
    public int priceCart() {
        price = listBasket.stream()
                .map(Product::getPrice)
                .mapToInt(Integer::intValue)
                .sum();
        return price;
    }

    public void buy() {
        System.out.println("Если хотите купить все товары в корзине нажмите - 1, выйти назад - 2");
        System.out.println("Поздравляем с покупкой!");
        basket = null;
        listBasket = new ArrayList<>();
    }

    public String toString() {
        if (listBasket == null || listBasket.isEmpty()) {
            System.out.println("Корзина пуста, добавьте товар");
        }
        list = new StringBuilder();
        for (int i = 0; i < listBasket.size(); i++) {
            list = list.append(i + 1).append(". ").append(listBasket.get(i)).append("\n");
        }
        return list.toString();
    }
}
