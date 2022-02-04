package behavioralPatterns.command;

/**
 * Receiver
 */
public class Calculator {
    public void addition(int a, int b){
        System.out.println(a + b);
    }
    public void subtraction(int a, int b){
        System.out.println(a - b);
    }
}
