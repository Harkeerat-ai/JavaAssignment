// Import Scanner: used to read input typed on the keyboard (available for future interactive features).
import java.util.Scanner;

/**
 * Base class User storing basic user information.
 */
class User {
    // Unique identifier assigned to the user.
    int userID;
    // Name of the user.
    String userName;
    // Mobile phone number of the user.
    long mobileNumber;

    /**
     * Parameterized constructor: creates a User using the values passed in.
     */
    User(int id, String name, long mobile) {
        // Copy the supplied ID into the instance field.
        userID = id;
        // Copy the supplied name into the instance field.
        userName = name;
        // Copy the supplied mobile number into the instance field.
        mobileNumber = mobile;
    }

    /**
     * Displays the basic details of the user.
     */
    void displayUserDetails() {
        // Print the user ID stored in the object.
        System.out.println("User ID: " + userID);
        // Print the user name stored in the object.
        System.out.println("User Name: " + userName);
        // Print the mobile number stored in the object.
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

/**
 * Intermediate class Customer inheriting from User.
 * Adds address and order ID.
 */
class Customer extends User {
    // Delivery address of the customer.
    String customerAddress;
    // Order ID associated with the customer's purchase.
    int orderID;

    /**
     * Parameterized constructor: forwards the basic user data to the User class
     * via super and stores the address and order ID locally.
     */
    Customer(int id, String name, long mobile, String address, int order) {
        // Call the parent class constructor to set ID, name and mobile number.
        super(id, name, mobile);
        // Store the delivery address in this object's field.
        customerAddress = address;
        // Store the order ID in this object's field.
        orderID = order;
    }

    /**
     * Displays the customer details including the inherited user details.
     */
    void displayCustomerDetails() {
        // Display the basic user details using the inherited method.
        displayUserDetails();
        // Print the customer's delivery address.
        System.out.println("Customer Address: " + customerAddress);
        // Print the customer's order ID.
        System.out.println("Order ID: " + orderID);
    }
}

/**
 * Most derived class PremiumCustomer inheriting from Customer.
 * Adds membership type and discount percentage.
 */
class PremiumCustomer extends Customer {
    // Type of membership held by this premium customer (e.g., "Gold").
    String membershipType;
    // Percentage of discount offered to this premium customer.
    double discountPercentage;

    /**
     * Parameterized constructor: forwards the customer data to the parent class
     * via super and stores the membership type and discount locally.
     */
    PremiumCustomer(int id, String name, long mobile, String address, int order,
                    String membership, double discount) {
        // Call the parent (Customer) constructor with the first five values.
        super(id, name, mobile, address, order);
        // Store the membership type in this object's field.
        membershipType = membership;
        // Store the discount percentage in this object's field.
        discountPercentage = discount;
    }

    /**
     * Calculates the discount amount on the given order amount.
     */
    double calculateDiscount(double orderAmount) {
        // Multiply the order amount by the discount percentage and divide by 100.
        return orderAmount * discountPercentage / 100;
    }

    /**
     * Displays the final bill amount after applying the discount.
     */
    void displayFinalBill(double orderAmount) {
        // Compute the discount using the calculateDiscount() method.
        double discount = calculateDiscount(orderAmount);
        // Print the original order amount.
        System.out.println("Order Amount: " + orderAmount);
        // Print the discount percentage and the computed discount amount.
        System.out.println("Discount (" + discountPercentage + "%): " + discount);
        // Print the final bill after subtracting the discount from the order amount.
        System.out.println("Final Bill Amount: " + (orderAmount - discount));
    }

    /**
     * Displays the complete details of the premium customer.
     */
    void displayPremiumDetails() {
        // Display the customer details using the inherited method.
        displayCustomerDetails();
        // Print the membership type of the premium customer.
        System.out.println("Membership Type: " + membershipType);
        // Print the discount percentage offered to the premium customer.
        System.out.println("Discount Percentage: " + discountPercentage + "%");
    }
}

/**
 * Demonstrates multilevel inheritance: User -> Customer -> PremiumCustomer.
 */
public class OnlineShopping {

    /**
     * Main method: creates a PremiumCustomer object and demonstrates the full
     * inheritance chain by displaying details and calculating the final bill.
     */
    public static void main(String[] args) {
        // Create a premium customer with all details used across the inheritance chain.
        PremiumCustomer pc = new PremiumCustomer(201, "Harkeerat", 9876543210L,
                "Mithibai College, Mumbai", 5001, "Gold", 15);

        // Print a header showing the premium customer's full details.
        System.out.println("--- Premium Customer Details ---");
        // Display the complete details of the premium customer.
        pc.displayPremiumDetails();

        // Print a blank line to separate the two output sections.
        System.out.println();
        // Print a header showing the bill calculation section.
        System.out.println("--- Bill Calculation ---");
        // Display the final bill for an order amount of 5000.
        pc.displayFinalBill(5000);
    }
}