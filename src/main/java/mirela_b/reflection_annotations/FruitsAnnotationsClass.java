package mirela_b.reflection_annotations;

@FruitsAnnotation({"Class", "Fruits"})
public class FruitsAnnotationsClass {

    @FruitsAnnotation({"Field", "banana"})
    protected String banana;

    @FruitsAnnotation({"Get", "banana"})
    public String getBanana(){
        return banana;
    }
}
