package structurePatterns.adapter;

public class Adapter implements CertainInterface{

    private OtherService obj;

    public Adapter(OtherService obj) {
        this.obj = obj;
    }

    @Override
    public void method() {
        obj.someDifferentMethod();
    }
}
