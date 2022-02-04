package behavioralPatterns.chainOfResponsibility;

/**
 * interface Handler
 */
public abstract class Handler {
    private int priority;// нужно для сравнения условий в каждом обработчике
    private Handler nextHandler; // Ссылка на следующий обработчик в цепи, может быть null.

    // Создаем конструктор, принимающий приоритет
    public Handler(int priority) {
        this.priority = priority;
    }

    // Сеттер для установки следующего в цепочке обработчика запроса
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Метод служит сравнения полученного запроса с условием и обрабатывает запрос сам, либо передает его по цепочке.
     * Переменная condition передает данные, которые нужно сравнить с нашим приоритетом.
     */
    public void handlerManager(String message, int condition) {
        if (condition >= priority) {// если условия проверки выполняются
            write(message);// выводим сообщение
        }

        // Если нужно, чтобы срабатывал только один обработчик - раскомментируйте следующую строку с оператором else
        // else

        // Далее проверяем наличие следующего в цепи обработчика
        if (nextHandler != null) {// если следующий обработчик существует, вызываем его и передаем ему переменные message и condition
            nextHandler.handlerManager(message, condition);
        } else {
            System.out.println("\n=======================\n");// эта строка кода для наглядности
        }
    }

    public abstract void write(String message);// выводит сообщение message, переопределяем для каждого обработчика
}
