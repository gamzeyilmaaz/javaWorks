public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3,2,"red");
//        product.setName("Laptop");
//        product.setId(1);
//        product.setDecription("Asus Laptop");
//        product.setPrice(5000);
//        product.setStockAmount(3);
        ProductManager productManager = new ProductManager();
        productManager.add(product);

        System.out.println(product.getDecription());
        System.out.println(product.getCode());

    }
}
