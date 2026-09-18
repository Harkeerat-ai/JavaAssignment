// Import Button: an AWT clickable button component.
import java.awt.Button;
// Import Checkbox: creates checkboxes or radio buttons (when grouped).
import java.awt.Checkbox;
// Import CheckboxGroup: groups checkboxes together into mutually exclusive radio buttons.
import java.awt.CheckboxGroup;
// Import Choice: creates a drop-down selection menu.
import java.awt.Choice;
// Import Color: defines custom foreground and background colors.
import java.awt.Color;
// Import FlowLayout: arranges components horizontally in a line.
import java.awt.FlowLayout;
// Import Font: defines font family, style (bold/plain), and size.
import java.awt.Font;
// Import Frame: the top-level AWT window that holds other components.
import java.awt.Frame;
// Import GridBagConstraints: sets position/size/alignment of each component placed in a GridBagLayout.
import java.awt.GridBagConstraints;
// Import GridBagLayout: a flexible grid-based layout manager for placing components precisely.
import java.awt.GridBagLayout;
// Import Insets: defines the spacing (padding) around each component.
import java.awt.Insets;
// Import Label: a component that displays static text on the form.
import java.awt.Label;
// Import Panel: a lightweight container used to group components together.
import java.awt.Panel;
// Import TextArea: a multi-line text input component.
import java.awt.TextArea;
// Import TextField: a single-line text input box.
import java.awt.TextField;

/**
 * AWT Registration Form (GUI design only - no event handling).
 * Practical 8 adds event handling to this form.
 *
 * Layout:
 * - Dark slate-blue window background
 * - Bright yellow "Registration Form" title header
 * - Fields:
 *     - Name: TextField (prefilled with "Ram")
 *     - Father Name: TextField (prefilled with "Kumar")
 *     - Age: TextField (prefilled with "23")
 *     - Gender: Radio buttons (Male selected, Female)
 *     - Course: Drop-down Choice menu (preselected "Java")
 *     - Hobbies: Multiple Checkboxes (Drawing selected, Singing, Music, Others)
 *     - Address: Multi-line TextArea with prefilled address
 * - "Save Details" button with vibrant blue background
 * - "Clear All" button with vibrant red background
 */
public class Q5_c_RegistrationForm {
    public static void main(String[] args) {
        System.out.println("Starting Practical 7 - Question 5.c: AWT Registration Form (design only)...");

        // Create the main window frame with title "Registration Form".
        Frame frame = new Frame("Registration Form");
        // Set the window width to 520 and height to 580 pixels.
        frame.setSize(520, 580);
        // Set the layout manager to GridBagLayout for precise component placement.
        frame.setLayout(new GridBagLayout());
        // Use a dark slate-blue background color matching the design.
        Color bgColor = new Color(50, 56, 68);
        frame.setBackground(bgColor);

        // Create the fonts used for the title, labels, inputs, and buttons.
        Font titleFont = new Font("SansSerif", Font.BOLD, 20);
        Font labelFont = new Font("SansSerif", Font.BOLD, 14);
        Font inputFont = new Font("SansSerif", Font.PLAIN, 13);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 13);

        // Create the constraints object that will control where each component is placed.
        GridBagConstraints gbc = new GridBagConstraints();
        // Give each component padding around all four sides, and stretch it horizontally.
        gbc.insets = new Insets(6, 12, 6, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0: Yellow "Registration Form" Title.
        gbc.gridx = 0;
        gbc.gridy = 0;
        // Let this title span two columns so it sits across the whole form.
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        Label titleLabel = new Label("Registration Form");
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.YELLOW);
        titleLabel.setBackground(bgColor);
        frame.add(titleLabel, gbc);

        // Row 1: Name Field.
        gbc.gridy = 1;
        // Reset the span back to one column.
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        Label nameLbl = new Label("Name");
        nameLbl.setFont(labelFont);
        nameLbl.setForeground(Color.WHITE);
        nameLbl.setBackground(bgColor);
        frame.add(nameLbl, gbc);

        gbc.gridx = 1;
        // Create a text field prefilled with "Ram".
        TextField nameField = new TextField("Ram", 25);
        nameField.setFont(inputFont);
        frame.add(nameField, gbc);

        // Row 2: Father Name Field.
        gbc.gridx = 0;
        gbc.gridy = 2;
        Label fatherNameLbl = new Label("Father Name");
        fatherNameLbl.setFont(labelFont);
        fatherNameLbl.setForeground(Color.WHITE);
        fatherNameLbl.setBackground(bgColor);
        frame.add(fatherNameLbl, gbc);

        gbc.gridx = 1;
        // Create a text field prefilled with "Kumar".
        TextField fatherNameField = new TextField("Kumar", 25);
        fatherNameField.setFont(inputFont);
        frame.add(fatherNameField, gbc);

        // Row 3: Age Field.
        gbc.gridx = 0;
        gbc.gridy = 3;
        Label ageLbl = new Label("Age");
        ageLbl.setFont(labelFont);
        ageLbl.setForeground(Color.WHITE);
        ageLbl.setBackground(bgColor);
        frame.add(ageLbl, gbc);

        gbc.gridx = 1;
        // Create a text field prefilled with "23".
        TextField ageField = new TextField("23", 25);
        ageField.setFont(inputFont);
        frame.add(ageField, gbc);

        // Row 4: Gender Radio Buttons (CheckboxGroup).
        gbc.gridx = 0;
        gbc.gridy = 4;
        Label genderLbl = new Label("Gender");
        genderLbl.setFont(labelFont);
        genderLbl.setForeground(Color.WHITE);
        genderLbl.setBackground(bgColor);
        frame.add(genderLbl, gbc);

        gbc.gridx = 1;
        // Create a Panel to hold the radio buttons side by side.
        Panel genderPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        genderPanel.setBackground(bgColor);
        // Group the two radio buttons so only one can be selected at a time.
        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox maleRadio = new Checkbox("Male", genderGroup, true);
        Checkbox femaleRadio = new Checkbox("Female", genderGroup, false);
        maleRadio.setFont(inputFont);
        maleRadio.setForeground(Color.WHITE);
        maleRadio.setBackground(bgColor);
        femaleRadio.setFont(inputFont);
        femaleRadio.setForeground(Color.WHITE);
        femaleRadio.setBackground(bgColor);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        frame.add(genderPanel, gbc);

        // Row 5: Course Dropdown (Choice).
        gbc.gridx = 0;
        gbc.gridy = 5;
        Label courseLbl = new Label("Course");
        courseLbl.setFont(labelFont);
        courseLbl.setForeground(Color.WHITE);
        courseLbl.setBackground(bgColor);
        frame.add(courseLbl, gbc);

        gbc.gridx = 1;
        // Create a drop-down menu with a list of courses, preselected to "Java".
        Choice courseChoice = new Choice();
        courseChoice.setFont(inputFont);
        courseChoice.add("Java");
        courseChoice.add("Python");
        courseChoice.add("C++");
        courseChoice.add("Web Development");
        courseChoice.add("Data Science");
        courseChoice.select("Java");
        frame.add(courseChoice, gbc);

        // Row 6: Hobbies Checkboxes.
        gbc.gridx = 0;
        gbc.gridy = 6;
        Label hobbiesLbl = new Label("Hobbies");
        hobbiesLbl.setFont(labelFont);
        hobbiesLbl.setForeground(Color.WHITE);
        hobbiesLbl.setBackground(bgColor);
        frame.add(hobbiesLbl, gbc);

        gbc.gridx = 1;
        // Create a Panel to hold the hobby checkboxes side by side.
        Panel hobbiesPanel = new Panel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        hobbiesPanel.setBackground(bgColor);
        // Create the four hobby checkboxes; only "Drawing" starts selected.
        Checkbox cbDrawing = new Checkbox("Drawing", true);
        Checkbox cbSinging = new Checkbox("Singing", false);
        Checkbox cbMusic = new Checkbox("Music", false);
        Checkbox cbOthers = new Checkbox("Others", false);
        cbDrawing.setFont(inputFont);
        cbDrawing.setForeground(Color.WHITE);
        cbDrawing.setBackground(bgColor);
        cbSinging.setFont(inputFont);
        cbSinging.setForeground(Color.WHITE);
        cbSinging.setBackground(bgColor);
        cbMusic.setFont(inputFont);
        cbMusic.setForeground(Color.WHITE);
        cbMusic.setBackground(bgColor);
        cbOthers.setFont(inputFont);
        cbOthers.setForeground(Color.WHITE);
        cbOthers.setBackground(bgColor);
        hobbiesPanel.add(cbDrawing);
        hobbiesPanel.add(cbSinging);
        hobbiesPanel.add(cbMusic);
        hobbiesPanel.add(cbOthers);
        frame.add(hobbiesPanel, gbc);

        // Row 7: Address TextArea.
        gbc.gridx = 0;
        gbc.gridy = 7;
        // Align this label to the top-left corner of its cell.
        gbc.anchor = GridBagConstraints.NORTHWEST;
        Label addressLbl = new Label("Address");
        addressLbl.setFont(labelFont);
        addressLbl.setForeground(Color.WHITE);
        addressLbl.setBackground(bgColor);
        frame.add(addressLbl, gbc);

        gbc.gridx = 1;
        // Create a multi-line text area prefilled with the address and a vertical scrollbar.
        TextArea addressArea = new TextArea("234 - 1d First Street,\nAnna Main Road\nNamakkal", 4, 25, TextArea.SCROLLBARS_VERTICAL_ONLY);
        addressArea.setFont(inputFont);
        frame.add(addressArea, gbc);

        // Row 8: Action Buttons (Save Details & Clear All).
        gbc.gridx = 0;
        gbc.gridy = 8;
        // Let the buttons span both columns so they sit centered below the fields.
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(16, 12, 12, 12);

        // Create a Panel to hold the two buttons side by side.
        Panel btnPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        btnPanel.setBackground(bgColor);

        // Create the blue "Save Details" button.
        Button saveBtn = new Button("Save Details");
        saveBtn.setFont(buttonFont);
        saveBtn.setBackground(new Color(0, 50, 230));
        saveBtn.setForeground(Color.WHITE);
        btnPanel.add(saveBtn);

        // Create the red "Clear All" button.
        Button clearBtn = new Button("Clear All");
        clearBtn.setFont(buttonFont);
        clearBtn.setBackground(new Color(220, 20, 20));
        clearBtn.setForeground(Color.WHITE);
        btnPanel.add(clearBtn);

        frame.add(btnPanel, gbc);

        // Center the whole window in the middle of the screen.
        frame.setLocationRelativeTo(null);
        // Make the window visible to the user.
        frame.setVisible(true);
        // End of main. Note: no event handling here, so clicking buttons does nothing yet.
    }
}