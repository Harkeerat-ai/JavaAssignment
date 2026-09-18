// Import TextField: a single-line text input box on the form.
import java.awt.TextField;
// Import TextArea: the multi-line address input on the form.
import java.awt.TextArea;
// Import Checkbox: radio buttons and hobby checkboxes on the form.
import java.awt.Checkbox;
// Import Choice: the course drop-down menu on the form.
import java.awt.Choice;
// Import ActionEvent: the object that carries information about a button click.
import java.awt.event.ActionEvent;
// Import ActionListener: the interface that must be implemented to receive button click events.
import java.awt.event.ActionListener;

/**
 * Practical 8 - Event handling for the Q5_c_RegistrationForm.
 *
 * Contains ONLY event handling logic - no GUI code.
 * Attaches to the "Save Details" and "Clear All" buttons of the registration form.
 *
 * Behaviour:
 * - "Save Details": collects every value entered on the form and prints it to the console.
 * - "Clear All": restores every field on the form to its initial/empty state.
 */
public class Q5_c_RegistrationForm_Events implements ActionListener {
    // References to the text fields on the registration form.
    private final TextField nameField;
    private final TextField fatherNameField;
    private final TextField ageField;
    // References to the gender radio buttons (male/female).
    private final Checkbox maleRadio;
    private final Checkbox femaleRadio;
    // Reference to the course drop-down menu.
    private final Choice courseChoice;
    // References to the four hobby checkboxes.
    private final Checkbox cbDrawing;
    private final Checkbox cbSinging;
    private final Checkbox cbMusic;
    private final Checkbox cbOthers;
    // Reference to the multi-line address text area.
    private final TextArea addressArea;

    /**
     * Stores every form component so the handlers can read and reset their values.
     *
     * @param nameField        the Name text field
     * @param fatherNameField  the Father Name text field
     * @param ageField         the Age text field
     * @param maleRadio        the "Male" radio button
     * @param femaleRadio      the "Female" radio button
     * @param courseChoice     the Course drop-down menu
     * @param cbDrawing        the "Drawing" hobby checkbox
     * @param cbSinging        the "Singing" hobby checkbox
     * @param cbMusic          the "Music" hobby checkbox
     * @param cbOthers         the "Others" hobby checkbox
     * @param addressArea      the Address multi-line text area
     */
    public Q5_c_RegistrationForm_Events(TextField nameField, TextField fatherNameField, TextField ageField,
                                        Checkbox maleRadio, Checkbox femaleRadio, Choice courseChoice,
                                        Checkbox cbDrawing, Checkbox cbSinging, Checkbox cbMusic, Checkbox cbOthers,
                                        TextArea addressArea) {
        this.nameField = nameField;
        this.fatherNameField = fatherNameField;
        this.ageField = ageField;
        this.maleRadio = maleRadio;
        this.femaleRadio = femaleRadio;
        this.courseChoice = courseChoice;
        this.cbDrawing = cbDrawing;
        this.cbSinging = cbSinging;
        this.cbMusic = cbMusic;
        this.cbOthers = cbOthers;
        this.addressArea = addressArea;
    }

    /**
     * Called automatically whenever the "Save Details" or "Clear All" button is clicked.
     *
     * @param event the event object; its action command is the button's label
     */
    public void actionPerformed(ActionEvent event) {
        // Read the label of the button that was clicked.
        String command = event.getActionCommand();

        // Route the click to the right handler based on the button label.
        if (command.equals("Save Details")) {
            saveDetails(event);
        } else if (command.equals("Clear All")) {
            clearAll(event);
        }
    }

    /**
     * Event handler for the "Save Details" button: collects and prints all form data.
     *
     * @param event the Save Details button click event
     */
    private void saveDetails(ActionEvent event) {
        // Read the values typed into the name, father name and age fields.
        String name = nameField.getText();
        String fatherName = fatherNameField.getText();
        String age = ageField.getText();

        // Determine the selected gender from the radio button state.
        String gender = maleRadio.getState() ? "Male" : "Female";

        // Read the course currently chosen in the drop-down menu.
        String course = courseChoice.getSelectedItem();

        // Build a comma-separated list of the hobbies that are ticked.
        String hobbies = collectHobbies();

        // Read the multi-line address text.
        String address = addressArea.getText().replace("\n", " ");

        // Print every collected detail to the console, grouped under a header.
        System.out.println("---------- SAVED REGISTRATION DETAILS ----------");
        System.out.println("Name        : " + name);
        System.out.println("Father Name : " + fatherName);
        System.out.println("Age         : " + age);
        System.out.println("Gender      : " + gender);
        System.out.println("Course      : " + course);
        System.out.println("Hobbies     : " + hobbies);
        System.out.println("Address     : " + address);
        System.out.println("-----------------------------------------------");
    }

    /**
     * Event handler for the "Clear All" button: resets every field on the form.
     *
     * @param event the Clear All button click event
     */
    private void clearAll(ActionEvent event) {
        // Empty the name, father name and age text fields.
        nameField.setText("");
        fatherNameField.setText("");
        ageField.setText("");

        // Restore the default radio button selection (Male).
        maleRadio.setState(true);
        femaleRadio.setState(false);

        // Reset the course drop-down back to its first entry ("Java").
        courseChoice.select(0);

        // Restore the default hobby selections (only Drawing ticked).
        cbDrawing.setState(true);
        cbSinging.setState(false);
        cbMusic.setState(false);
        cbOthers.setState(false);

        // Empty the address text area.
        addressArea.setText("");

        // Put the cursor back into the first field for the next entry.
        nameField.requestFocus();
        // Notify the user on the console that the form was cleared.
        System.out.println("Registration form cleared.");
    }

    /**
     * Builds a comma-separated String of all the ticked hobby checkboxes.
     *
     * @return the selected hobbies, or "None" if no hobby is selected
     */
    private String collectHobbies() {
        // Start with an empty list.
        StringBuilder hobbies = new StringBuilder();
        // Append each hobby label only if its checkbox is ticked.
        if (cbDrawing.getState()) {
            hobbies.append("Drawing, ");
        }
        if (cbSinging.getState()) {
            hobbies.append("Singing, ");
        }
        if (cbMusic.getState()) {
            hobbies.append("Music, ");
        }
        if (cbOthers.getState()) {
            hobbies.append("Others, ");
        }

        // If nothing was collected, report "None".
        if (hobbies.length() == 0) {
            return "None";
        }
        // Strip the trailing ", " and return the list.
        return hobbies.substring(0, hobbies.length() - 2);
    }
}