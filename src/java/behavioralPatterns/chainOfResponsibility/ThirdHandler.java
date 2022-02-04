package behavioralPatterns.chainOfResponsibility;

/**
 * Concrete handler
 */
public class ThirdHandler extends Handler {

    public ThirdHandler(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Event handling with ThirdHandler \n\"" + message + "\"");
    }
}
