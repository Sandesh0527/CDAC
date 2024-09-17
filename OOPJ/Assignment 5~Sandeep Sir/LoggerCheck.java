package assignment5;
class Logger {
    private static Logger instance = null;  // The singleton instance
    private StringBuilder logMessages;  // To store log messages

    // Private constructor to prevent instantiation from outside
    private Logger() {
        logMessages = new StringBuilder();  // Initialize the log
    }

    // Static method to get the unique instance of Logger (Singleton pattern)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // Create the instance if not already created
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        logMessages.append(message).append("\n");  // Append the message to log
    }

    // Method to get all logged messages
    public String getLog() {
        return logMessages.toString();  // Return all log messages
    }

    // Method to clear the log
    public void clearLog() {
        logMessages.setLength(0);  // Clear the log
    }
}

// Test class to demonstrate the Logger functionality
public class LoggerCheck {
    public static void main(String[] args) {
        // Get the unique instance of Logger
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Application started");
        logger.log("User logged in");
        logger.log("Error: Invalid input");

        // Get and print the log
        System.out.println("Log Messages:");
        System.out.println(logger.getLog());

        // Clear the log
        logger.clearLog();
        System.out.println("Log after clearing:");
        System.out.println(logger.getLog());  // Should print an empty string
    }
}
