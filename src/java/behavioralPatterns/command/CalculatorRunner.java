package behavioralPatterns.command;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();// Receiver
        // создаем приемник команд
        //в качестве параметров передаем новые объекты-команды
        CalculatorInvoker calculatorInvoker = new CalculatorInvoker(
                new AddCommand(calculator),// в качестве параметра передаем объект калькулятора
                new SubtractionCommand(calculator)// в качестве параметра передаем объект калькулятора
        );

        calculatorInvoker.getSum(20, 30);// выводим сумму чисел
        calculatorInvoker.getDifference(10, 20);// выводим разность чисел
    }
}
