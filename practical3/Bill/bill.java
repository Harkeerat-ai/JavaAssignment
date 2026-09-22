// Import java.util.*: brings in the Scanner class used to read text input typed on the keyboard.
import java.util.*;

/**
 * Generates a formatted shop bill by accepting item names and prices from the
 * user and displaying them along with the total amount.
 */
public class bill {
    public static void main(String[] args) {
        // Create a Scanner object that reads from System.in (the keyboard).
        Scanner sc = new Scanner(System.in);
        // StringBuilder builds the bill text efficiently without creating many String objects.
        StringBuilder bill = new StringBuilder();

        // Ask the user how many items they purchased so we know how many slots to create.
        System.out.print("How many items did you buy : ");
        // Read the item count as an integer.
        int count = sc.nextInt();

        // Array to hold the name of each item, sized to the item count.
        String item[] = new String[count];
        // Array to hold the price of each item, sized to the item count.
        int item_price[] = new int[count];

        // Collect item names and prices
        // Loop once per item to gather its name and cost from the user.
        for (int i = 0; i < count; i++) {
            // Ask for the name of the current item.
            System.out.print("Name of item : ");
            // Store the name in the item array.
            item[i] = sc.next();
            // Ask for the cost of the current item.
            System.out.print("What is the cost : ");
            // Store the price in the item_price array.
            item_price[i] = sc.nextInt();
        }

        // Calculate total cost
        // total accumulates the final bill amount, started at 0.
        int total = 0;
        // Loop over every item price and add it to the running total.
        for (int i = 0; i < item_price.length; i++) {
            total += item_price[i];
        }

        // Build the formatted bill string
        // Add the heading line of the bill.
        bill.append("******** SHOP BILL ********\n");
        // Loop over every item and append its name and price to the bill.
        for (int i = 0; i < item.length; i++) {
            bill.append(item[i] + "      : Rs.").append(item_price[i]).append("\n");
        }
        // Add a separator line above the total.
        bill.append("--------------------------\n");
        // Add the total amount line to finish the bill.
        bill.append("Total     : Rs.").append(total);

        // Print the fully built bill to the console.
        System.out.println(bill);
    }
}