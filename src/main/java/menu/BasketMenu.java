package menu;

import basket.Basket;
import menu.title.HeaderOutput;
import menu.title.Title;

import java.util.Scanner;

public class BasketMenu implements Menu {
    Scanner scanner = new Scanner(System.in);
    Title title = new HeaderOutput();
    Basket basket = Basket.getBasket();
    final String list1 = "Выберите один из следующих разделов меню:  \n 1.Просмотр корзины\n " +
            "2.Удаленить элемент с корзины \n 3.Купить товары \n * Выберите номер нужного пункта";
    final String list2 = "Дальнейшие действия: \n1. Остаемся в корзине  \n2. Выход в главное меню";
    final String list3 = "Досвидания";

    @Override
    public void menu() {
        title.title(list1);
        String list = scanner.nextLine();
        switch (list) {
            case "1" -> {
                System.out.println(basket.toString());
                System.out.println("Сумма товаров в корзине - " + basket.priceCart());
            }
            case "2" -> {
                System.out.println(basket.toString());
                basket.removalFromCart();
            }
            case "3" -> basket.buy();
            default -> {
                System.out.println("Вы ввели неверный номер \nПопробуйте еще раз");
                menu();
            }
        }

        title.title(list2);
        list = scanner.nextLine();
        switch (list) {
            case "1" -> menu();
            case "2" -> title.title(list3);
            default -> System.out.println("Вы ввели неверный номер \nПопробуйте еще раз");
        }
    }
}
