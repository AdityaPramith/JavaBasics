public class Product {
    private int productId;
    private String name;
    private float price;
    private int stock;
    
    public float getPriceAfterDiscount(int discountPercentage) {
        float discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }
    public void displayDetails() {
        System.out.println("Product Id: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Stock: " + stock);
    }
    
    public void displayDetails(int discountPercentage) {
        System.out.println("Product Name: " + name);
        System.out.println("Discounted price: " + getPriceAfterDiscount(discountPercentage));
        if(stock > 0) System.out.println("In stock");
        else System.out.println("Out of stock!");
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
