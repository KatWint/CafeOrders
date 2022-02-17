public class Item {
    private String name;
    private double price;

    public Item() {
        
    }
    
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(String name) {
        this.name = name;
    }

    public double getPrice(double price) {
        this.price = price;
    }

    public String setName(String name) {
        this.name = name;
    }

    public double setPrice(double price) {
        this.price = price;
    }
}
