package structurePatterns.adapter;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        CertainInterface certainInterface = new CertainInterfaceImpl();
        client.method(certainInterface);

        OtherService otherService = new OtherService();
        Adapter adapter = new Adapter(otherService);
        client.method(adapter);
    }
}
