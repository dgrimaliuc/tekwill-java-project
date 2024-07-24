package AnastasiaGoncear.Lesson7AnastasiaGoncear.Homework;

public interface Printable {

    default void print() {
        System.out.println(this.toString());
    }
}
