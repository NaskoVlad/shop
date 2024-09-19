package baseProduct;

/*
Разделы продуктов
 */
public enum Chapter {
    DAIRYPRODUCTS("МОЛОЧНЫЕ ПРОДУКТЫ"),
    ALCOHOL("АЛКОГОЛЬ"),
    READYFOOD("ГОТОВАЯ ЕДА"),
    VEGETABLESANDFRUITS("ОВОЩИ И ФРУКТЫ"),
    BREADANDPASTRY("ХЛЕБ И ВЫПЕЧКА"),
    MEAT("МЯСО"); //

    private String title;

    private Chapter(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
