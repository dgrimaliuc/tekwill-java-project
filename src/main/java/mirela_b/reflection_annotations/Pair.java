package mirela_b.reflection_annotations;

public class Pair<T, Y> {
    protected T firstElement;
    protected Y secondElement;

    public Pair(T firstElement, Y secondElement) {
        setFirstElement(firstElement);
        setSecondElement(secondElement);
    }

    private void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    private void setSecondElement(Y secondElement) {
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public Y getSecondElement() {
        return secondElement;
    }

    @Override
    public String toString() {
        return "[ " + getFirstElement() + " : " + getSecondElement() + " ]";
    }
}
