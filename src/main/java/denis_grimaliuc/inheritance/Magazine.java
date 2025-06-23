package main.java.denis_grimaliuc.inheritance;

import main.java.denis_grimaliuc.interfaces.Printable;

public class Magazine implements Printable {
    public String editor;
    public String title;

    public Magazine(String editor, String title) {
        this.editor = editor;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "editor='" + editor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
