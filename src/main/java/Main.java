import baseProduct.BaseProduct;
import baseProduct.Chapter;
import basket.Basket;
import menu.MainMenu;
import product.Product;
import product.ProductBuilder;

public class Main {
    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        no();
        System.out.println("Здравствуйте, вы посещаете магазин ПРОДУКТЫ");
        mainMenu.mainMenu();

        System.out.println();
    }

    public static void no() {

        BaseProduct baseProduct = BaseProduct.getBaseProduct();
        Product product = new ProductBuilder()
                .setChapter(Chapter.DAIRYPRODUCTS)
                .setSubsection("Молоко")
                .setName("Простовкашино 2,5")
                .setPrice(950)
                .setRating(4.5)
                .setManufacturer("ООО Молочные продукты")
                .setWeight(900)
                .setId(001)
                .build();

        Product product1 = new ProductBuilder()
                .setChapter(Chapter.DAIRYPRODUCTS)
                .setSubsection("Молоко")
                .setName("Простоквашино 3,5")
                .setPrice(105)
                .setRating(5.0)
                .setManufacturer("ООО Молочные продукты")
                .setWeight(900)
                .setId(002)
                .build();

        Product product2 = new ProductBuilder()
                .setChapter(Chapter.ALCOHOL)
                .setSubsection("Вино")
                .setName("Крымское красное")
                .setPrice(1700)
                .setRating(4.8)
                .setManufacturer("ООО Крымский алкоголь")
                .setWeight(700)
                .setId(003)
                .build();


        baseProduct.addition(product);
        baseProduct.addition(product1);
        baseProduct.addition(product2);


//        Basket basket = new Basket();
//        basket.addToCart(product);
//        basket.addToCart(product1);
//        basket.removalFromCart(1);
    }

}