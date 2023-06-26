package ana_raetcaia;

public class ArrayUtilsTest {
    public static void main (String[]args){

    ArrayUtils maxIntObj = new ArrayUtils();
    ArrayUtils maxDobObj = new ArrayUtils();
    ArrayUtils maxStrObj = new ArrayUtils();

    System.out.println("Maximum element in an array of integers: ");
    System.out.println(maxIntObj.maximumElement(new int[]{4, 6, 7}));

    System.out.println("Maximum element in an array of floating-point number: ");
    System.out.println(maxDobObj.maximumElement(new double[]{4.5, 6.43, 7.5}));

    System.out.println("Maximum element in an array of strings: ");
    System.out.println(maxStrObj.maximumElement(new String[]{"9884", "55"}));
    }

    }


