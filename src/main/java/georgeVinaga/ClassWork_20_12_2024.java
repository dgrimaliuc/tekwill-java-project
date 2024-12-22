package main.java.georgeVinaga;

// Vom vorbi despre 1.Metode, 2.Clase, 3.Obiecte, 4.this

//--------------------------------------------------------------------------------
//1. Metode
//    public class ClassWork_20_12_2024 {
//        static void myMethod() {
//            System.out.println("I just get executed!");
//}
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}
//--------------------------------------------------------------------------------
// Parametrii metodei
//public class ClassWork_20_12_2024 {
//    static void myMethod(String fname) {
//        System.out.println(fname +" Refsnes");
//    }
//    public static void main(String[] args) {
//        myMethod("Liam");
//        myMethod("Jenny");
//        myMethod("Anja");
//    }
//}
//--------------------------------------------------------------------------------
// Câțiva parametri
//public class ClassWork_20_12_2024 {
//    static void myMethod(String fname, int age) {
//        System.out.println(fname + " is " + age);
//    }
//    public static void main(String[] args) {
//        myMethod("Liam", 5);
//        myMethod("Jenny", 8);
//        myMethod("Anja", 31);
//    }
//}
//--------------------------------------------------------------------------------
// Returnează rezultatul metodei.
public class ClassWork_20_12_2024 {
    static int myMethod(int x) {
        return 5 + x;
    }
    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}
//--------------------------------------------------------------------------------