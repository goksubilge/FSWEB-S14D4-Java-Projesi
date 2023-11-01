import com.wit.store.models.Bread;
import com.wit.store.models.Cholcolate;
import com.wit.store.models.Coke;
import com.wit.store.models.ProductForSale;

public class Store {
    public static void main(String[] args) {
        // ProductForSale sale = new ProductForSale();  // yapamam çünkü bu bir abstract method !
        // ProductForSale sale = new Chocolate();       //  array' siz gösterim bu.
        // [Chocolate, Bread, Coke, null, null]
        ProductForSale[] sales = new ProductForSale[5];
        sales[0] = new Cholcolate("sweet",30, "Yoğun lezzet.","square",true);
        sales[1] = new Bread("Bakery", 40,"Kabarmayan katı tuzlu tat.","yellow", "elipse");
        sales[2] = new Coke("Asitli yakan içecek.", 50,"cold drink", true);

        listProducts(sales);
        listProducts(null);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null) {
            for (ProductForSale product: products) {
                if (product !=null) {
                    product.showDetails();
                }else {
                    System.out.println("ProducT can't be null");
                }
            }
        }
    }
}