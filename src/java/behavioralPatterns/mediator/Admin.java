package behavioralPatterns.mediator;

public class Admin extends Colleague {
    @Override
        // переопределяем метод получения сообщения для наглядности работы
    void getMessage(String message) {
        System.out.println("Admin get message: " + message);
    }
}
