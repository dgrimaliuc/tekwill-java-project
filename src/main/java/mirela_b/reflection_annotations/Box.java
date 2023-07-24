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

    public Y getPair(T firstElement) {
        for (Pair<T, Y> pairs : pairList) {
            if (pairs.getFirstElement().equals(firstElement)) {
                return pairs.getSecondElement();
            }
        }
        return null;
    }
}
