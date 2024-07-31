package DenisGrimaliuc.lection2207.enums;

public enum Languages {
    JAVA(".java"),
    PYTHON(".py"),
    C_PLUS_PLUS(".cpp");


    private final String fileExtension;


    Languages(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public static void main(String[] args) {
        System.out.println(JAVA.getFileExtension());
        System.out.println(PYTHON.getFileExtension());
        System.out.println(C_PLUS_PLUS.getFileExtension());
    }

    public String getFileExtension() {
        return fileExtension;
    }
}
