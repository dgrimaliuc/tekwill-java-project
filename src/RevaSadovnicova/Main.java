package RevaSadovnicova;

public class Main {
    public static void main(String[] args) {

    }

    void Task3_1 () {
        int count = 55;
        int sum = 0;
        do {
            sum += count;
            count++;
        }
        while (count < 112) ;
        System.out.println("sum of number from 55 to 111 = "+ sum);
    }

    void Task3_2 () {
        int sum=0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    void Task3_3 () {
        float[] a = {1,2,4,7,9,8} ;
        float sum=0;
        for (float i: a) {
            sum += i;
        }
        System.out.println(sum / a.length);
    }
}

