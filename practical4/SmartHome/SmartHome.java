// Import Scanner: used to read input typed on the keyboard (available for future interactive features).
import java.util.Scanner;

/**
 * Base class Device with device ID, name and power status.
 */
class Device {
    // Unique identification number assigned to the device.
    int deviceID;
    // Human-readable name of the device (e.g., "Living Room Light").
    String deviceName;
    // Stores whether the device is currently switched on (true = ON, false = OFF).
    boolean powerStatus; // true = ON, false = OFF

    /**
     * Parameterized constructor: initializes the device ID and name,
     * and starts the device in the OFF state.
     */
    Device(int id, String name) {
        // Store the passed-in id into the instance field.
        deviceID = id;
        // Store the passed-in name into the instance field.
        deviceName = name;
        // A brand-new device always starts switched off.
        powerStatus = false;
    }

    /**
     * Switches the device on by setting the power status to true.
     */
    void turnOn() {
        // Update the power status to ON.
        powerStatus = true;
        // Print a message confirming that the device is now ON.
        System.out.println(deviceName + " is turned ON.");
    }

    /**
     * Switches the device off by setting the power status to false.
     */
    void turnOff() {
        // Update the power status to OFF.
        powerStatus = false;
        // Print a message confirming that the device is now OFF.
        System.out.println(deviceName + " is turned OFF.");
    }

    /**
     * Displays the ID, name and current power status of the device.
     */
    void displayInfo() {
        // Print the device ID stored in the object.
        System.out.println("Device ID: " + deviceID);
        // Print the device name stored in the object.
        System.out.println("Device Name: " + deviceName);
        // Use a ternary to print ON when powerStatus is true, otherwise OFF.
        System.out.println("Power Status: " + (powerStatus ? "ON" : "OFF"));
    }
}

/**
 * Derived class SmartLight inheriting from Device.
 * Adds brightness level and color mode.
 */
class SmartLight extends Device {
    // Stores the brightness level of the light as a percentage (0-100).
    int brightnessLevel;
    // Stores the colour mode of the light (e.g., "Warm White").
    String colorMode;

    /**
     * Parameterized constructor: forwards the ID and name to the Device class
     * via super and stores the brightness and colour mode locally.
     */
    SmartLight(int id, String name, int brightness, String color) {
        // Call the parent class constructor to set the device ID and name.
        super(id, name);
        // Store the brightness level in this object's field.
        brightnessLevel = brightness;
        // Store the colour mode in this object's field.
        colorMode = color;
    }

    /**
     * Changes the brightness of the light to the given level.
     */
    void changeBrightness(int level) {
        // Update the brightness field with the new level.
        brightnessLevel = level;
        // Print a confirmation showing the new brightness percentage.
        System.out.println("Brightness set to " + brightnessLevel + "%");
    }

    /**
     * Overrides the parent displayInfo() to also show brightness and colour mode.
     */
    @Override
    void displayInfo() {
        // Reuse the parent class method to print the basic device details.
        super.displayInfo();
        // Print the current brightness level.
        System.out.println("Brightness Level: " + brightnessLevel + "%");
        // Print the current colour mode.
        System.out.println("Color Mode: " + colorMode);
    }
}

/**
 * Demonstrates single inheritance using a Smart Home Automation System.
 */
public class SmartHome {

    /**
     * Main method: creates a SmartLight, turns it on, changes its brightness
     * and displays its status at each stage.
     */
    public static void main(String[] args) {
        // Create a SmartLight with an ID, name, starting brightness and colour mode.
        SmartLight light = new SmartLight(101, "Living Room Light", 50, "Warm White");

        // Print a header showing the current status section.
        System.out.println("--- SmartLight Status ---");
        // Display the initial details before the light is switched on.
        light.displayInfo();

        // Print a blank line to separate the output sections.
        System.out.println();
        // Switch the light on using the inherited turnOn() method.
        light.turnOn();
        // Change the brightness to 80 percent.
        light.changeBrightness(80);
        // Display the updated details after switching on and changing brightness.
        light.displayInfo();

        // Print a blank line to separate the output sections.
        System.out.println();
        // Switch the light off using the inherited turnOff() method.
        light.turnOff();
    }
}