package menu;
/*
Принцип замены Барбары Лисков. Интерфейс создан для создания классов меню,
но в тоже время он не подходит для класса "MainMenu"
и другие классы мы не можем наследовать от "MainMenu"
 */

public interface Menu {
    void menu();
}
