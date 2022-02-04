package behavioralPatterns.command;

public class AddCommand implements CalculatorCommand {
    private Calculator calculator;// Ссылка на класс калькулятора
    // конструктор с параметром Calculator
    public AddCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override //Переопределяем execute()
    public void execute(int a, int b) {
        calculator.addition(a, b);// вызываем addition() у калькулятора
    }
}
