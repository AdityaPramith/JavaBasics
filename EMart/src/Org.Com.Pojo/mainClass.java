public class mainClass {
    
    public static void main(String[] Args){
        
        Product massager =new Product();
        massager.setName("Massager");
        massager.setPrice(21100.78f);
        massager.setProductId(100023);
        massager.setStock(25);
        massager.displayDetails();
        massager.displayDetails(12);

    }
}
