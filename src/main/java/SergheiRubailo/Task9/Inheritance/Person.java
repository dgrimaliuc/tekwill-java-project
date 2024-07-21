package SergheiRubailo.Task9.Inheritance;

/*Develop a class called "Person" with instance variables for name, age, and address. Design a subclass called "Student" that inherits from
"Person" and includes additional instance variables such as student ID and grade (курс).*/

public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Name " + getName() + ", Address: " + getAddress() + ", Age: " + getAge());
    }

}
