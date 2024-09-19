package menu.title;

/*
Принцип инверсии зависимостей
 */
public class HeaderOutput implements Title {
    @Override
    public void title(String line) {
        System.out.println("*******************************************");
        System.out.println(line);
    }
}
