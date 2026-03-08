import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class onlineStore {
    public static void main(String[] args) {
        ArrayList<Double> orders = new ArrayList<>();
        orders.add(100.0);
        orders.add(800.0);
        orders.add(5200.0);
        orders.add(4500.0);
        orders.add(7000.0);
        orders.add(300.0);

        System.out.println("Original Orders: " + orders);

        // Remove all orders below 500
        Iterator<Double> it = orders.iterator();
        while (it.hasNext()) {
            if (it.next() < 500) {
                it.remove();
            }
        }

        // Apply 10% discount to orders above 5000
        int index = 0;
        for (double order : orders) {
            if (order > 5000) {
                orders.set(index, order * 0.9);
            }
            index++;
        }

        // Calculate total revenue after modifications
        double totalRevenue = 0;
        for (double order : orders) {
            totalRevenue += order;
        }

        // Display sorted order list (ascending)
        Collections.sort(orders);

        System.out.println("Modified Orders (sorted): " + orders);
        System.out.println("Total Revenue: " + totalRevenue);
    }
}


