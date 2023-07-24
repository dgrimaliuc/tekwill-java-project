package mirela_b.reflection_annotations;

import java.util.ArrayList;
import java.util.List;

public class Box<T, Y> {
    protected List<Pair<T, Y>> pairList;

    public Box() {
        pairList = new ArrayList<>();
    }

    public void addPair(T firstEl, Y secondEl) {
        pairList.add(new Pair<>(firstEl, secondEl));
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
