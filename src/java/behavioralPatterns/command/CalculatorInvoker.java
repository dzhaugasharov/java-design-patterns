package behavioralPatterns.command;


/**
 * Invoker
 */
public class CalculatorInvoker {
    private CalculatorCommand addition; // Ссылка на интерфейс CalculatorCommand
    private CalculatorCommand subtraction; // Ссылка на интерфейс CalculatorCommand

    // конструктор с параметрами
    public CalculatorInvoker(CalculatorCommand addition, CalculatorCommand subtraction) {
        this.addition = addition;
        this.subtraction = subtraction;
    }

    // считаем сумму
    public void getSum(int a, int b) {
        addition.execute(a, b);// Вызываем execute(a, b) у реализации интерфейса CalculatorCommand
    }

    // считаем разность
    public void getDifference(int a, int b) {
        subtraction.execute(a, b);// Вызываем execute(a, b) у реализации интерфейса CalculatorCommand
    }
}
