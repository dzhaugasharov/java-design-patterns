package behavioralPatterns.interpreter;

public class Client {
    public static void main(String[] args) {
        Parser parser = new Parser();

        Expression expression = parser.evaluate("-25+43-34+1");
        System.out.println(expression.interpret());
    }
}
