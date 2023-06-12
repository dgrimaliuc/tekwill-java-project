package denis_grimaliuc;

class Person {
    String name;

    public void setName(String name) {
        this.name = name; // Assign the name parameter to the name instance variable
    }

    public void displayName() {
        System.out.println("Name: " + this.name); // Access the name instance variable
    }
}

