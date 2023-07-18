package alina_gutsul.genericsAnnotationsReflection;

import java.util.ArrayList;
import java.util.List;

class Pair<T, Y> {
    private T first;
    private Y second;

    public Pair(T first, Y second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public Y getSecond() {
        return second;
    }
}

class Box<T, Y> {
    private List<Pair<T, Y>> pairs;

    public Box() {
        pairs = new ArrayList<>();
    }

    public void addPair(T first, Y second) {
        Pair<T, Y> pair = new Pair<>(first, second);
        pairs.add(pair);
    }

    public Pair<T, Y> getPairByFirstValue(T value) {
        for (Pair<T, Y> pair : pairs) {
            if (pair.getFirst().equals(value)) {
                return pair;
            }
        }
        return null;
    }
}
