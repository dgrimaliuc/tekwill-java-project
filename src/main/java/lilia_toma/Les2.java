package main.java.lilia_toma;

public class Les2 {


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello: " + name);
//    }
//}
// = atribuire, == verificare egalitate

// public class Main2{
//    public static void main(String[] args) {
//        System.out.println(3 == 3);
//    }
// }

    public static void main(String[] args) {
//switch
        String str = "22";
        System.out.println("\n");

        switch (str) {
            case "1":
                System.out.println("Case 1 executed");
                break;
            case "2":
                System.out.println("Case 2 executed");
                break;
            case "3":
                System.out.println("Case 3 executed");
                break;
            default:
                System.out.println("Default case executed");
        }
    }
}
//        //gaseste maximul dintre 3 numere.
//        int a, b, c;
//        a = 100;
//        b = 28;
//        c = -33;

//        if (a > b && a > c) {
//            System.out.println("First number is the biggest: " + a);
//        } else if (b > a && b > c) {
//            System.out.println("Second number is the biggest: " + b);
//        } else if (c > a && c > b) {
//            System.out.println("Thirst number is the biggest: " + c);
//        }
//    }
//    }
//        ---// sau alta modalitate de verificare
//        int max1 = Math.max(a, b);
//        int max = Math.max(max1, c);
//        System.out.println("The biggest number is: " + max);
//    }}

//        //citeste un sir de caractere de la utilizator si afiseaza lungimea acestuia.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        String string = sc.nextLine();
//
//        System.out.println("The length is: " + string.length());
//    }
//}
//        //verifica daca un numar este divizibil cu 2 si 3.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//
//        if (number % 2 == 0 && number % 3 == 0){
//            System.out.println("Number is divizible by 2 and 3");
//        } else {
//            System.out.println("Number is not divizible by 2 and 3");
//        }
//    }}

//        //determina daca un numar este par sau impar.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//
//        if (number > 0) {
//            System.out.println("Number is positive");
//        } else if (number < 0){
//            System.out.println("Number is negative");
//        } else {
//            System.out.println("Number is 0");
//        }
//
//        if (number % 2 == 0){
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
//    }}

//verifica daca un numar este pozitiv, negativ sau zero.
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = sc.nextInt();
//
//        if (number > 0) {
//            System.out.println("Number is positive");
//        } else if (number < 0){
//            System.out.println("Number is negative");
//        } else {
//            System.out.println("Number is 0");
//        }
//    }

//        int num = 10;
//        if (num > 0) {
//            if (num % 2 == 0) {
//            System.out.println("Numar pozitiv par");
//        } else {
//            System.out.println("Numar pozitiv impar");
//        }
//    } else if (num < 0 ) {
//            System.out.println("Numar negativ");
//        } else {
//            System.out.println("Zero");
//        }
//    }

//        int Age = 18;
//        if (Age >= 18) {
//            System.out.println("Esti adult.");
//        }
//        else{
//            System.out.println("Esti minor.");
//        }
//    }

//        int myAge = 25;
//        int votingAge = 18;
//        if (myAge >= votingAge) {
//            System.out.println("Old enough to vote!");
//        } else {
//            System.out.println("Not old enough to vote.");
//        }


