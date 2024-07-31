package VictorMurashev.homework_20240723.interfaces;

public interface Printable {
    default void print(){
        System.out.println(this.toString());
    }
}
