import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item1.price = 3.5;
        item2.name = "latte";
        item2.price = 4.25;
        item3.name = "drip coffee";
        item3.price = 2.75;
        item4.name = "capuccino";
        item4.price = 4.5;

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order2.items.add(item1);
        order2.total += item1.price;
        
        order3.items.add(item4);
        order3.total += item4.price;
        
        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;
        
        order4.items.add(item2);
        order4.total += item2.price;
        //unsure how to add the item 2 times without redoing the code twice
        order4.items.add(item2);
        order4.total += item2.price;

        order2.ready = true;

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
