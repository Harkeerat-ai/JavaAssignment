import java.util.*;

/**
 * Generates a formatted shop bill by accepting item names and prices from the
 * user and displaying them along with the total amount.
 */
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder bill = new StringBuilder();

        System.out.print("How many items did you buy : ");
        int count = sc.nextInt();

        String item[] = new String[count];
        int item_price[] = new int[count];

        // Collect item names and prices
        for (int i = 0; i < count; i++) {
            System.out.print("Name of item : ");
            item[i] = sc.next();
            System.out.print("What is the cost : ");
            item_price[i] = sc.nextInt();
        }

        // Calculate total cost
        int total = 0;
        for (int i = 0; i < item_price.length; i++) {
            total += item_price[i];
        }

        // Build the formatted bill string
        bill.append("******** SHOP BILL ********\n");
        for (int i = 0; i < item.length; i++) {
            bill.append(item[i] + "      : Rs.").append(item_price[i]).append("\n");
        }
        bill.append("--------------------------\n");
        bill.append("Total     : Rs.").append(total);

        System.out.println(bill);
    }
}
