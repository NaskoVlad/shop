package filter;

/*
Принцип открытости\закрытости.
с помощью данного интерфейса мы создаем определенный фильтр но при необходимости можем его пото расширить.
 */
public interface Filter {
    void filter();
}
