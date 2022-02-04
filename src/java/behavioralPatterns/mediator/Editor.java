package behavioralPatterns.mediator;

public class Editor extends Colleague {
    @Override
        // переопределяем метод получения сообщения для наглядности работы
    void getMessage(String message) {
        System.out.println("Editor get message: " + message);
    }
}
