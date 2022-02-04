package behavioralPatterns.mediator;

public class ConcreteMediator implements Mediator {
    private Admin admin;
    private Editor editor;
    // Конструктор конкретного медиатора принимает конкретные объекты-коллеги
    // в ходе создания конкретного посредника объектам-коллегам устанавливаем посредника
    public ConcreteMediator(Admin admin, Editor editor) {
        this.admin = admin;
        this.editor = editor;
        editor.setMediator(this);
        admin.setMediator(this);
    }
    // Переопределяем метод отправки сообщения
    @Override
    public void sendMessage(String message, Colleague colleague) {
        if (colleague.equals(admin)){// если сообщение отправляет admin, оно отправляется объекту editor
            editor.getMessage(message);
        } else if (colleague.equals(editor)){// если сообщение отправляет editor, оно отправляется объекту admin
            admin.getMessage(message);
        }
    }
}
