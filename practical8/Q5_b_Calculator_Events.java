// Import TextField: the non-editable display screen of the calculator.
import java.awt.TextField;
// Import ActionEvent: the object that carries information about a button click.
import java.awt.event.ActionEvent;
// Import ActionListener: the interface that must be implemented to receive button click events.
import java.awt.event.ActionListener;

/**
 * Practical 8 - Event handling for the Q5_b_Calculator.
 *
 * Contains ONLY event handling logic - no GUI code.
 * Attaches to all 16 buttons of the calculator form, whose labels determine the action.
 *
 * Behaviour:
 * - Digits (0-9) and ".". append to the current value shown on the display.
 * - Operators (+, -, x, ÷) store the pending operator and the first operand.
 * - "=" computes the pending operation and shows the result on the display.
 */
public class Q5_b_Calculator_Events implements ActionListener {
    // Reference to the calculator's non-editable display screen.
    private final TextField display;
    // Stores the first operand of the pending calculation.
    private double firstOperand = 0;
    // Stores the pending operator ("+", "-", "x" or "÷").
    private String pendingOperator = "";
    // True when the next digit must start a fresh entry instead of appending.
    private boolean startNewEntry = true;

    /**
     * Stores the calculator display so results, digits and operators can be applied.
     *
     * @param display the calculator's display text field
     */
    public Q5_b_Calculator_Events(TextField display) {
        this.display = display;
    }

    /**
     * Called automatically when any calculator button is clicked.
     *
     * @param event the event object; its action command is the button's label
     */
    public void actionPerformed(ActionEvent event) {
        // Read the label of the button that was clicked.
        String command = event.getActionCommand();

        // Digits and the decimal point build up the number in the display.
        if (isDigitOrDecimal(command)) {
            handleDigit(command);
        }
        // The "=" button computes the pending operation.
        else if (command.equals("=")) {
            calculateResult();
        }
        // Any other label is an operator ( +, -, x, ÷ ).
        else {
            handleOperator(command);
        }
    }

    /**
     * Handles a digit or decimal point press by appending to the display.
     *
     * @param digit the digit or "." that was pressed
     */
    private void handleDigit(String digit) {
        // If this is a fresh entry, replace the old value with the new digit.
        if (startNewEntry) {
            display.setText(digit);
            startNewEntry = false;
        }
        // Otherwise prevent multiple decimal points in one number and append.
        else if (!(digit.equals(".") && display.getText().contains("."))) {
            display.setText(display.getText() + digit);
        }
    }

    /**
     * Handles an operator press by storing the first operand and the pending operator.
     *
     * @param operator the operator label ( +, -, x, ÷ )
     */
    private void handleOperator(String operator) {
        // If a number was just entered, compute any previous pending operation first.
        if (!startNewEntry) {
            calculateResult();
        }
        // Remember the value currently on the display as the first operand.
        firstOperand = Double.parseDouble(display.getText());
        // Remember which operator the user chose.
        pendingOperator = operator;
        // The next digit starts a brand new entry.
        startNewEntry = true;
    }

    /**
     * Computes the pending two-operand operation and shows the result on the display.
     */
    private void calculateResult() {
        // If there is no pending operator, there is nothing to calculate.
        if (pendingOperator.isEmpty()) {
            return;
        }

        // Read the second operand from the display.
        double secondOperand = Double.parseDouble(display.getText());
        // Variable that will hold the computed result.
        double result = 0;

        // Apply the correct arithmetic based on the stored pending operator.
        switch (pendingOperator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "x":
                result = firstOperand * secondOperand;
                break;
            case "÷":
                // Guard against division by zero.
                if (secondOperand == 0) {
                    display.setText("Error");
                    // Clear the pending operator so a mistake cannot repeat.
                    pendingOperator = "";
                    startNewEntry = true;
                    return;
                }
                result = firstOperand / secondOperand;
                break;
            default:
                // Unknown operator: do nothing.
                return;
        }

        // Drop the trailing ".0" on whole numbers so results look clean on screen.
        if (result == Math.floor(result) && !Double.isInfinite(result)) {
            display.setText(String.valueOf((long) result));
        } else {
            display.setText(String.valueOf(result));
        }

        // Reset the calculator state after a completed calculation.
        pendingOperator = "";
        startNewEntry = true;
    }

    /**
     * Returns true if the given command is a digit or the decimal point.
     *
     * @param command the button label to test
     * @return true if command is 0-9 or ".", false otherwise
     */
    private boolean isDigitOrDecimal(String command) {
        // Single character check: a digit, or the decimal point.
        return command.length() == 1 && (Character.isDigit(command.charAt(0)) || command.equals("."));
    }
}