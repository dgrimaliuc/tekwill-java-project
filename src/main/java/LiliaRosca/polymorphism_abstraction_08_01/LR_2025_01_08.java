package main.java.LiliaRosca.polymorphism_abstraction_08_01;

public class LR_2025_01_08 {
    public static void main(String[] args) {
// III. polymorphism  - prezentarea class Animal + class Pig + class Dog
        /*/ 1. overloading - pot fi create mai multa metode cu aceeasi denumire dar ceva trebuie se difere - tipul de date, numarul variabilelor, etc.
         public class Calculator {
              public int add (int a, int b) {
                  return a + b;
              }
              public double add (double a, double b) {
                  return a + b;
              }
              public int add (int a, int b, int c) {
                  return a + b + c;
              }
              // sau public int add (int... a) {
                  int sum = 0;
                  for (int i : a){
                      sum += i;
                      }
                  return sum;
                  }
              public double add (int a, double c) {
                  return a + c;
              }
          }
          Calculator calculator = new Calculator(); // alta clasa
          int sum1 = calculator.add(5, 10); // prima metoda
          double sum2 = calculator.add(5.15, 10.01); // a doua metoda
          int sum3 = calculator.add(5, 10, 15); // a treia metoda
          int sum = calculator.add(5, 10, 15, 25, 2, 3, 4); // a treia metoda var 2
          double sum4 = calculator.add(5, 10.01); // a patra metoda
          System.out.println(sum);*/

        // de sine statator - Creează o clasă “Display” și supraincarcă metoda show pentru a afișa un int, un double și un String.
        /*Display display = new Display();
        display.show("1.1"); */

        // 2. overriding - classes Animal, Cat, Dog
        // Classes Shape, Circle, Square, Triangle

// polimorfismul permite folosirea variabilei din superclasa in clasa inferioara
// pagina 14 prezentarea / a doua varianta pentru main - Classes Shape, Circle, Square, Triangle


// IV. abstraction - abstract class, method, etc
        //

//  enumerare - enum - ? se creaza ca si o CLASA

        // Ctrl + Shift + u - transforma in upper/lower case

// interface --- clasa implements interface

    }
}
