package AnastasiaGoncear.Lesson7AnastasiaGoncear.Homework;

class Magazine implements Printable {
    private String name;
    private String owner;

    public Magazine(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Magazine [Name: " + name + ", Owner: " + owner + "]";
    }


}