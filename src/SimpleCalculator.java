import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
//        int x = 2147000000;
//        double y = 9.999999999;
//        byte z = 127;
//        long l = 1900000000000000000L;
//        short s = 32767;
//        System.out.println(x + " number is how2 large a data set yo9u can use and it is also\n" +
//        " 4 bytes in size.");
//        System.out.println(y + " double data type number is larger than an int but in decimals");
//        System.out.println(z + " a byte data type is rather small in size and is only 1 byte.");
//        System.out.println(l + " long data type is the largest and takes 8 bytes.");
//        System.out.println(s + " short data type is only two bytes or memory.");
        double entry1;
        double entry2;
        double total;
        System.out.println("Enter a number >>>>");
        Scanner inputDevice = new Scanner(System.in);
        entry1 = inputDevice.nextDouble();
        System.out.println("Enter another number>>>>");
        entry2 = inputDevice.nextDouble();
        total = entry1 + entry2;
       System.out.println(entry1 +" + " + entry2 + " = "+ total);
        total = entry1 - entry2;
        System.out.println(entry1 +" - " + entry2 + " = "+ total);
        total = entry1 * entry2;
        System.out.println(entry1 +" x " + entry2 + " = "+ total);
        total = entry1 / entry2;
        System.out.println(entry1 +" / " + entry2 + " = "+ total);

    }
}
