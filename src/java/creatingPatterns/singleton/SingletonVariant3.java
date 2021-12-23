package creatingPatterns.singleton;

public class SingletonVariant3 {

    private static SingletonVariant3 instance;

    private SingletonVariant3() {

    }

    /**
     * Теперь наряду с ленивой инициализацией мы заставили Синглтон работать в многопоточной среде.
     * Теперь поток, который первый занимает метод getInstance(), блокирует доступ к нему остальным потокам и спокойно
     * инициализирует синглтон. Остальный потоки получат готовый объект-одиночку. Но и в этом способе не все гладко.
     * Из-за синхронизации метода getInstance() произойдет снижение производительности.
     * По сути синхронизация getInstance() нам нужна только до момента инициализации Синглтона.
     */
    public static synchronized SingletonVariant3 getInstance(){
        if (instance == null) instance = new SingletonVariant3();
        return instance;
    }
}
