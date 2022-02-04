package behavioralPatterns.command;

public class SubtractionCommand implements CalculatorCommand {
    private Calculator calculator;

    public SubtractionCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //Переопределяем execute()
    public void execute(int a, int b) {
        calculator.subtraction(a, b);// вызываем subtraction() у калькулятора
    }
}
