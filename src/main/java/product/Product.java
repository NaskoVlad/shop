package product;

import baseProduct.Chapter;

public class Product {
    protected Chapter chapter; // Раздел
    protected String subsection; // Подраздел
    protected String name; // Наименование прродукта
    protected int price; // Стоимость продукта
    protected double rating; // Рейтинг
    protected String manufacturer; // Производитель
    protected int weight;
    protected int id;

    public Product() {
    }

    public Product(Chapter chapter, String subsection, String name, int price, double rating, String manufacturer, int weight, int id) {
        this.chapter = chapter;
        this.subsection = subsection;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.id = id;
    }

    public Chapter getChapter() {
        return chapter;
    }

    public String getSubsection() {
        return subsection;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getRating() {
        return rating;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return '\n' + name + '\n' +
                "стоимость - " + price + '\n' +
                "рейтинг - " + rating + '\n' +
                "вес - " + weight + '\n' +
                "производитель - " + manufacturer + '\n' +
                "ID - " + id + '\n';
    }

}
