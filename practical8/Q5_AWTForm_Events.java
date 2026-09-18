// Import TextField: the text field whose contents are read/cleared by the handlers.
import java.awt.TextField;
// Import ActionEvent: the object that carries information about a button click.
import java.awt.event.ActionEvent;
// Import ActionListener: the interface that must be implemented to receive button click events.
import java.awt.event.ActionListener;

/**
 * Practical 8 - Event handling for the Q5_AWTForm (Login Form).
 *
 * Contains ONLY event handling logic - no GUI code.
 * Attaches to the "Login" and "Reset" buttons of the login form.
 *
 * Behaviour:
 * - "Login": validates the entered Gmail ID and password and prints the result.
 * - "Reset": clears the Gmail ID and password fields.
 */
public class Q5_AWTForm_Events implements ActionListener {
    // Reference to the Gmail ID text field on the login form.
    private final TextField gmailField;
    // Reference to the password text field on the login form.
    private final TextField passwordField;

    // Hard-coded credentials used for validation.
    private static final String VALID_GMAIL = "admin@gmail.com";
    private static final String VALID_PASSWORD = "admin123";

    /**
     * Stores references to the login form's input fields so events can be handled.
     *
     * @param gmailField    the Gmail ID text field on the login form
     * @param passwordField the password text field on the login form
     */
    public Q5_AWTForm_Events(TextField gmailField, TextField passwordField) {
        this.gmailField = gmailField;
        this.passwordField = passwordField;
    }

    /**
     * Called automatically whenever the Login or Reset button is clicked.
     *
     * @param event the event object; its action command is the button's label
     */
    public void actionPerformed(ActionEvent event) {
        // Read the label of the button that was clicked.
        String command = event.getActionCommand();

        // Route the click to the right handler based on the button label.
        if (command.equals("Login")) {
            handleLogin(event);
        } else if (command.equals("Reset")) {
            handleReset(event);
        }
    }

    /**
     * Event handler for the "Login" button: validates Gmail and password.
     *
     * @param event the Login button click event
     */
    private void handleLogin(ActionEvent event) {
        // Read the Gmail ID and password typed by the user.
        String gmail = gmailField.getText().trim();
        String password = passwordField.getText();

        // Check the entered credentials against the hard-coded valid values.
        if (gmail.equals(VALID_GMAIL) && password.equals(VALID_PASSWORD)) {
            // Credentials matched - login is a success.
            System.out.println("Login successful. Welcome " + gmail + "!");
        } else {
            // Credentials did not match - login is a failure.
            System.out.println("Login failed. Invalid Gmail ID or Password.");
        }
    }

    /**
     * Event handler for the "Reset" button: clears both input fields.
     *
     * @param event the Reset button click event
     */
    private void handleReset(ActionEvent event) {
        // Clear the Gmail ID field so the user can type a fresh value.
        gmailField.setText("");
        // Clear the password field so the user can type a fresh value.
        passwordField.setText("");
        // Put the cursor back into the first field for the next entry.
        gmailField.requestFocus();
        // Notify the user on the console that the form was cleared.
        System.out.println("Login form reset. Fields cleared.");
    }
}