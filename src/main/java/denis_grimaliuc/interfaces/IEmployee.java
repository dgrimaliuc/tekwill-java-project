package main.java.denis_grimaliuc.interfaces;

public interface IEmployee {
    default void calculateBonus() {
        this.toString();
    }
}
