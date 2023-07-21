package mirela_b.reflection_annotations;
import java.util.ArrayList;
import java.util.List;

@FruitsAnnotation({"Box", "class"})
public class Box<T, Y> {
    @FruitsAnnotation({"Fruits", "list"})
    protected List<Pair<T, Y>> pairList;

    public Box() {
        pairList = new ArrayList<>();
    }

    @FruitsAnnotation({"Mango", "Cherry"})
    public void addPair(T firstEl, Y secondEl) {
        Pair<T, Y> pair = new Pair<>(firstEl, secondEl);
        pairList.add(pair);
    }

    public void getPair() {
        int index = 0;
        T value = null;
        for (Pair<T, Y> pairs : pairList) {
            if (index == 0) {
                value = pairs.getFirstElement();
            }
            if (pairs.getFirstElement().equals(value)) {
                System.out.println(pairs);
                index++;
            }
        }

    }
}
