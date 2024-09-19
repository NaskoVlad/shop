package menu;

import basket.Basket;
import filter.AscendingFilter;
import filter.DescendingFilter;
import menu.title.HeaderOutput;
import menu.title.Title;

import java.util.Scanner;

/*
Принцип единственной ответственности.
Данный класс используется исключительно для как меню фильров.
 */
public class FilterMenu implements Menu {
    AscendingFilter ascendingFilter = new AscendingFilter();
    DescendingFilter descendingFilter = new DescendingFilter();
    Scanner scanner = new Scanner(System.in);
    Title title = new HeaderOutput();
    Basket basket = Basket.getBasket();
    final String list = "Выберите один из следующих разделов меню:  \n 1.Фильтр по возрастанию цены\n " +
            "2.Фильтр по убыванию цены\n * Выберите номер нужного пункта";
    final String list2 = "Дальнейшие действия: \n1. Остаемся в меню фильтров \n2. Выход в главное меню";
    final String list3 = "Досвидания";

    @Override
    public void menu() {
        title.title(list);
        String list = scanner.nextLine();
        switch (list) {
            case "1" -> {
                ascendingFilter.filter();
                basket.addToCart();
            }
            case "2" -> {
                descendingFilter.filter();
                basket.addToCart();
            }
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

