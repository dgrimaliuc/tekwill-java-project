package AnastasiaGoncear.Lesson7AnastasiaGoncear.PolimorfismOverload;
//Create a Display class and
// overload the show method to display an integer, a double, and a String.
public class Display {
    public void show(int number) {
        System.out.println("Displaying integer: " + number);
    }


    public void show(double number) {
        System.out.println("Displaying double: " + number);
    }

    public void show(String text) {
        System.out.println("Displaying string: " + text);
    }

    public static void main(String[] args) {
        Display display = new Display();

        display.show(42);
        display.show(3.14159);
        display.show("Hello, World!");
    }
}

