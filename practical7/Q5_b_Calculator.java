// Import Button: an AWT clickable button component.
import java.awt.Button;
// Import Color: defines custom foreground and background colors.
import java.awt.Color;
// Import ComponentOrientation: allows setting right-to-left orientation for display alignment.
import java.awt.ComponentOrientation;
// Import Font: defines font family, style (bold/plain), and size.
import java.awt.Font;
// Import Frame: the top-level AWT window that holds other components.
import java.awt.Frame;
// Import GridLayout: a layout manager that arranges components in a rectangular grid of equal cells.
import java.awt.GridLayout;
// Import Panel: a lightweight container used to group components together.
import java.awt.Panel;
// Import TextField: a single-line text input/display component.
import java.awt.TextField;

/**
 * AWT Calculator (GUI design only - no event handling).
 * Practical 8 adds event handling to this form.
 *
 * Layout:
 * - Dark slate frame background
 * - Top display screen showing "0"
 * - 4x4 button grid:
 *     [ 7 ] [ 8 ] [ 9 ] [ ÷ ]
 *     [ 4 ] [ 5 ] [ 6 ] [ x ]
 *     [ 1 ] [ 2 ] [ 3 ] [ - ]
 *     [ 0 ] [ . ] [ + ] [ = ]
 * - Crisp white standard buttons with bold dark text
 * - High-visibility orange "=" button
 */
public class Q5_b_Calculator {
    public static void main(String[] args) {
        System.out.println("Starting Practical 7 - Question 5.b: AWT Calculator (design only)...");

        // Create the main window frame with title "Calculator".
        Frame frame = new Frame("Calculator");
        // Set the window width to 320 and height to 440 pixels.
        frame.setSize(320, 440);
        // Use absolute layout so each component is positioned by exact coordinates.
        frame.setLayout(null);
        // Set the dark gray/slate background color matching the design.
        frame.setBackground(new Color(68, 73, 80));
        // Prevent the user from resizing the window.
        frame.setResizable(false);

        // Create the display screen at the top, starting with the value "0".
        TextField display = new TextField("0");
        // Place the display at x=20, y=45 with width 280 and height 55.
        display.setBounds(20, 45, 280, 55);
        // Prevent the user from typing directly in the display.
        display.setEditable(false);
        // Give the display a light grayish-blue background matching the design.
        display.setBackground(new Color(220, 226, 230));
        // Use dark text so the display value is easy to read.
        display.setForeground(new Color(25, 25, 25));
        // Use a large bold monospaced font to mimic a digital calculator screen.
        display.setFont(new Font("Monospaced", Font.BOLD, 28));
        // Right-align the text by using a right-to-left component orientation.
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        // Add the display to the frame.
        frame.add(display);

        // Create a Panel that will hold the 4x4 button grid.
        Panel buttonPanel = new Panel();
        // Place the panel at x=20, y=115 with width 280 and height 290.
        buttonPanel.setBounds(20, 115, 280, 290);
        // Arrange 4 rows and 4 columns with 10px horizontal and vertical gaps.
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        // Match the panel background to the dark frame background.
        buttonPanel.setBackground(new Color(68, 73, 80));

        // Array of button labels matching the 4x4 layout from the assignment image.
        String[] buttons = {
            "7", "8", "9", "÷",
            "4", "5", "6", "x",
            "1", "2", "3", "-",
            "0", ".", "+", "="
        };

        // Create, style, and add each button one at a time.
        for (String text : buttons) {
            // Create the button with its label text.
            Button btn = new Button(text);
            // Use a large bold sans-serif font so the buttons are easy to read.
            btn.setFont(new Font("SansSerif", Font.BOLD, 22));

            // Give the "=" button orange styling; all others get white styling.
            if (text.equals("=")) {
                btn.setBackground(new Color(245, 142, 44)); // Vibrant calculator orange
                btn.setForeground(Color.WHITE);
            } else {
                btn.setBackground(Color.WHITE);
                btn.setForeground(new Color(35, 35, 35));
            }

            // Add the styled button to the grid panel.
            buttonPanel.add(btn);
        }

        // Add the button grid panel to the frame.
        frame.add(buttonPanel);

        // Center the whole window in the middle of the screen.
        frame.setLocationRelativeTo(null);
        // Make the window visible to the user.
        frame.setVisible(true);
        // End of main. Note: no event handling here, so clicking buttons does nothing yet.
    }
}