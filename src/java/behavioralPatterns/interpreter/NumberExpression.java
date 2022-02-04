package behavioralPatterns.interpreter;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {// конструктор
        this.number = number;
    }

    @Override
    public int interpret() {// возвращает число
        return number;
    }
}
