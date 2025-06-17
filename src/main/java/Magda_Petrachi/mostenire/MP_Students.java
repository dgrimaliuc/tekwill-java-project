package main.java.Magda_Petrachi.mostenire;

public class MP_Students extends MP_person {
    int studentID;
    Double nota;

    public MP_Students(String nume, String adresa, int varsta, int studentID, Double nota) {
        super(nume, adresa, varsta);
        this.studentID = studentID;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "MP_Student{" +
                "varsta=" + varsta +
                ", adresa='" + adresa + '\'' +
                ", nume='" + nume + '\'' +
                ", nota=" + nota +
                ", studentID=" + studentID +
                '}';
    }
}
