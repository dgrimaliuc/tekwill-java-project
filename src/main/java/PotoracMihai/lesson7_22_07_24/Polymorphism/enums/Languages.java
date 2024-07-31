package main.java.PotoracMihai.lesson7_22_07_24.Polymorphism.enums;

public enum Languages {

    JAVA(".java"),
    PYTHON(".py"),

    C_PLUS_PLUS(".cpp");

    private final String fileExtension;

    Languages(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public static void main(String[] args) {
        System.out.println(JAVA.fileExtension);
        System.out.println(PYTHON.fileExtension);
        System.out.println(C_PLUS_PLUS.fileExtension);
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
