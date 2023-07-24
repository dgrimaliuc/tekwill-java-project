package mirela_b.reflection_annotations;

public class FruitsAnnotationsClass {
    @FruitsAnnotation({"Field", "banana"})
    protected String banana;

    @FruitsAnnotation({"Get", "banana"})
    public String getBanana() {
        return banana;
    }
}
