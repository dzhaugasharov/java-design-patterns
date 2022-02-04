package behavioralPatterns.chainOfResponsibility;

public class FirstHandler extends Handler {

    public FirstHandler(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Event handling with FirstHandler \n\"" + message + "\"");
    }
}
