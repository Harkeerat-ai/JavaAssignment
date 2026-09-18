/**
 * Abstract class Payment representing a digital payment transaction.
 */
abstract class Payment {
    // The amount of money being paid in this transaction.
    double amount;

    /**
     * Parameterized constructor: stores the transaction amount.
     */
    Payment(double amount) {
        // Copy the passed-in amount into the instance field of this object.
        this.amount = amount;
    }

    /**
     * Concrete method that prints the basic transaction total.
     */
    void displayReceipt() {
        // Print the amount currently stored in the field.
        System.out.println("Transaction Amount: " + amount);
    }

    /**
     * Abstract method - each payment type processes funds differently,
     * so every subclass must provide its own implementation.
     */
    abstract void processPayment();
}

/**
 * Subclass CryptoPayment that extends Payment for blockchain transfers.
 */
class CryptoPayment extends Payment {
    // The blockchain address that will receive the payment.
    String walletAddress;

    /**
     * Parameterized constructor: forwards the amount to the Payment class
     * via super and stores the wallet address locally.
     */
    CryptoPayment(double amount, String walletAddress) {
        // Call the parent class constructor to store the payment amount.
        super(amount);
        // Store the wallet address in this object's field.
        this.walletAddress = walletAddress;
    }

    /**
     * Overrides the abstract processPayment() method to implement a
     * blockchain-based transfer for cryptocurrency payments.
     */
    @Override
    void processPayment() {
        // Print a confirmation showing the amount and the target wallet address.
        System.out.println("Secure blockchain transfer of " + amount +
                " confirmed to wallet: " + walletAddress);
    }
}

/**
 * Demonstrates the abstract class concept using a Digital Payment Gateway.
 */
public class PaymentGateway {

    /**
     * Main method: creates a CryptoPayment object and demonstrates
     * both the concrete receipt method and the overridden payment method.
     */
    public static void main(String[] args) {
        // Create a crypto payment of 250.75 units to the given blockchain wallet address.
        CryptoPayment payment = new CryptoPayment(250.75, "0x3f9a1cB7e2D8a1f6b4C9E7d2A5B8e4F1c0D3a7b2");

        // Call the concrete method (inherited from Payment) to show the receipt.
        payment.displayReceipt();
        // Call the overridden method to process the blockchain transfer.
        payment.processPayment();
    }
}