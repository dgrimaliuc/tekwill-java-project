package main.java.IonErm.Old.OOP_Enc_Inh;

public class Student {
    private int id;
    private String name;
    private int nota;

    public Student(int id, String name, int nota) {
        this.id = id;
        this.name = name;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
