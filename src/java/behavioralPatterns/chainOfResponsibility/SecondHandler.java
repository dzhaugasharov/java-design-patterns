package behavioralPatterns.chainOfResponsibility;

/**
 * Concrete handler
 */
public class SecondHandler extends Handler {

    public SecondHandler(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Event handling with SecondHandler \n\"" + message + "\"");
    }
}
