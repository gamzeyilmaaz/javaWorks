//public: accessible
public class Product {

    //attribute | field
    //private: valid in the product block it is defined in
    private int id;
    private String name;
    private String decription;
    private double price;
    private int stockAmount;
    private String code;

    public Product(int id, String name, String decription, double price, int stockAmount, String code) {
        System.out.println("constructor block worked");
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.price = price;
        this.stockAmount = stockAmount;
        this.code = code;
    }

    public Product() {

    }

    public String getCode() {
        return  this.name.substring(0,1)+id ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        //this: mean that is id in this class
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

}
