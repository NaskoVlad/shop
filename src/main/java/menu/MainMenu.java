package menu;

import baseProduct.BaseProduct;
import basket.Basket;
import menu.title.HeaderOutput;
import menu.title.Title;

import java.util.Scanner;

public class MainMenu {
    BaseProduct baseProduct = BaseProduct.getBaseProduct();
    Scanner scanner;
    FilterMenu filterMenu = new FilterMenu();
    Title title = new HeaderOutput();
    BasketMenu basketMenu = new BasketMenu();
    Basket basket = Basket.getBasket();
    final String list = "Выберите один из следующих разделов меню ПРОДУКТЫ\n 1.Вывод всех продуктов " +
            "\n 2.Выбор фильтров\n 3.Корзина";
    final String list2 = "Дальнейшие действия: \n1. Остаемся в главном меню \n2. Завершение покупок";
    final String list3 = "Досвидания";


    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    public void mainMenu() {
        title.title(list);
        String list = scanner.nextLine();
        switch (list) {
            case "1" -> {
                System.out.println(baseProduct.toString());
                basket.addToCart();
            }
            case "2" -> filterMenu.menu();
            case "3" -> basketMenu.menu();
            default -> System.out.println("Вы ввели неверный номер \nПопробуйте еще раз");
        }


        title.title(list2);
        list = scanner.nextLine();
        switch (list) {
            case "1" -> mainMenu();
            case "2" -> title.title(list3);
            default -> System.out.println("Вы ввели неверный номер \nПопробуйте еще раз");
        }

    }
}
