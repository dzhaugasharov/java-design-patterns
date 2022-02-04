package behavioralPatterns.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        // Создаем объекты обработчиков и каждому передаем приоритет, с которым будет сравниваться запрос
        Handler firstHandler = new FirstHandler(Priority.INFO);
        Handler secondHandler = new SecondHandler(Priority.WARNING);
        Handler thirdHandler = new ThirdHandler(Priority.ERROR);

        firstHandler.setNextHandler(secondHandler);// первому обработчику назначаем следующего
        secondHandler.setNextHandler(thirdHandler);// второму обработчику назначаем следующего
        // Вызываем handlerManager() у первого обработчика и передаем ему сообщение и параметр, который нужно обработать
        firstHandler.handlerManager("We are fine...", Priority.INFO);
        firstHandler.handlerManager("There is a reason to think...", Priority.WARNING);
        firstHandler.handlerManager("Help me please!!!", Priority.ERROR);
    }
}
