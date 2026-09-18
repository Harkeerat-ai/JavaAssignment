// Import Button: an AWT clickable button component.
import java.awt.Button;
// Import Frame: the top-level AWT window that holds other components.
import java.awt.Frame;
// Import Label: a component that displays static text on the form.
import java.awt.Label;
// Import Panel: a container used to group other components together.
import java.awt.Panel;
// Import TextField: a single-line text input box.
import java.awt.TextField;
// Import GridBagLayout: a flexible grid-based layout manager for placing components precisely.
import java.awt.GridBagLayout;
// Import GridBagConstraints: sets position/size/alignment of each component placed in the GridBagLayout.
import java.awt.GridBagConstraints;
// Import Insets: defines the spacing (padding) around each component.
import java.awt.Insets;

/**
 * AWT Login Form layout (design only - no event handling).
 * Practical 8 adds event handling to this form.
 */
public class Q5_AWTForm {
    public static void main(String[] args) {
        // Create the main window and give it the title "Login Form".
        Frame frame = new Frame("Login Form");
        // Set the window width to 400 and height to 300 pixels.
        frame.setSize(400, 300);
        // Set the layout manager to GridBagLayout for precise component placement.
        frame.setLayout(new GridBagLayout());
        // Create the constraints object that will control where each component is placed.
        GridBagConstraints gbc = new GridBagConstraints();
        // Give each component 10 pixels of padding on all four sides (top, left, bottom, right).
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title: put the next component in column 0, row 0.
        gbc.gridx = 0;
        gbc.gridy = 0;
        // Let this title span two columns so it can be centered across the form.
        gbc.gridwidth = 2;
        // Add the title label "--- Login Form ---" using the current constraints.
        frame.add(new Label("--- Login Form ---"), gbc);

        // Gmail ID label: move to row 1 (still column 0).
        gbc.gridy = 1;
        // Reset the span back to one column.
        gbc.gridwidth = 1;
        // Align this label to the EAST (right side) of its cell.
        gbc.anchor = GridBagConstraints.EAST;
        // Add the "Gmail ID:" label at this position.
        frame.add(new Label("Gmail ID:"), gbc);

        // Create a text field that can hold roughly 20 characters of input; this stores the Gmail.
        TextField gmailField = new TextField(20);
        // Move to column 1 (same row 1) for the input field.
        gbc.gridx = 1;
        // Align this field to the WEST (left side) of its cell.
        gbc.anchor = GridBagConstraints.WEST;
        // Add the Gmail input field next to its label.
        frame.add(gmailField, gbc);

        // Password label: move back to column 0, then down to row 2.
        gbc.gridx = 0;
        gbc.gridy = 2;
        // Align the label to the right (EAST) of its cell.
        gbc.anchor = GridBagConstraints.EAST;
        // Add the "Password:" label at this position.
        frame.add(new Label("Password:"), gbc);

        // Create a text field for the password input.
        TextField passwordField = new TextField(20);
        // Mask every typed character with '*' so the password is hidden as you type.
        passwordField.setEchoChar('*');
        // Move to column 1 (same row 2) for the password field.
        gbc.gridx = 1;
        // Align the field to the left (WEST) of its cell.
        gbc.anchor = GridBagConstraints.WEST;
        // Add the password input field next to its label.
        frame.add(passwordField, gbc);

        // Create a Panel container to hold the buttons side by side.
        Panel buttonPanel = new Panel();
        // Add a "Login" button to the panel.
        buttonPanel.add(new Button("Login"));
        // Add a "Reset" button to the panel.
        buttonPanel.add(new Button("Reset"));

        // Place the button panel at column 0, row 3.
        gbc.gridx = 0;
        gbc.gridy = 3;
        // Make the panel span both columns so the buttons sit centered below the fields.
        gbc.gridwidth = 2;
        // Add the button panel to the frame.
        frame.add(buttonPanel, gbc);

        // Center the whole window in the middle of the screen.
        frame.setLocationRelativeTo(null);
        // Make the window visible to the user.
        frame.setVisible(true);
        // End of main. Note: no event handling here, so clicking buttons does nothing yet.
    }
}