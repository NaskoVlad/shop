package product;

import baseProduct.Chapter;

public class ProductBuilder {
    private Chapter chapter; // Раздел
    private String subsection; // Подраздел
    private String name; // Наименование прродукта
    private int price; // Стоимость продукта
    private String manufacturer; // Производитель
    private double rating; // Рейтинг
    private int weight;
    private int id;

    public ProductBuilder setRating(double rating) {
        this.rating = rating;
        return this;
    }

    public ProductBuilder setChapter(Chapter chapter) {
        this.chapter = chapter;
        return this;
    }

    public ProductBuilder setSubsection(String subsection) {
        this.subsection = subsection;
        return this;
    }


    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public ProductBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public ProductBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Product build() throws IllegalArgumentException {
        return new Product(chapter, subsection, name, price, rating, manufacturer, weight, id);
    }
}
