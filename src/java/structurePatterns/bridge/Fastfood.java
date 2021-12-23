package structurePatterns.bridge;

public abstract class Fastfood {
    private Terminal terminal;//    Класс Fastfood содержит ссылку на интерфейс Terminal (на схеме Implementor).

    //  сеттер для терминала, чтобы мы могли на лету изменить конкретный терминал
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }

    //  Конструктор, который принимает в качестве параметра интерфейс Terminal, что позволяет нам не привязывать код к конкретному реализатору.
    Fastfood(Terminal terminal) {
        this.terminal = terminal;
    }

    //  Метод saleFood(int cost) продает еду по цене cost
    public void saleFood(int cost) {
        getInfo();
        terminal.bill(cost);
    }

    abstract void getInfo();//  абстрактный метод, который выведет информацию о конкретной Абстракции
}
