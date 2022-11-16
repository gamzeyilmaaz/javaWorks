public class ProductManager {
    public void add(Product product) {
        System.out.println("product added  " + product.getName());
    }

    //wrong using because we can want to change args. we getting error in other classes if we change args.
    public void add2(int id, String name, String description, int stockAmount, double price) {

    }
}
