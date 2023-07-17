package alexei_drujinin;
public class For {

    public static void main(String[] args) {
        printNumbers();
        summOfNumbers();
        factorialOfGivenNumber();
        numbersWithStep();
    }

    public static void printNumbers() {
        System.out.println("Вывод числ от 1 до 10 ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void summOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 100;i++ ) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от до 100  равна " + sum);
    }

    public static void factorialOfGivenNumber(){
        int res = 1;
        for(int i=1;i<=10;i++) {
            res = res * i;
        }
        System.out.println("Факториал 10 равен "+res);
    }

    public static void numbersWithStep(){
        System.out.println("Вывод чисел от 20 до 0 , с шагом 2 ");
        for(int i=20;i>=0;i-=2){

                System.out.println(i);



        }
    }
}


