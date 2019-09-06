import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args){
        int INCHES_IN_A_FOOT = 12;
        int numInches;
        int numFeet;
        int inchesRemaining;
        Scanner keyboard = new Scanner (System.in);
        System.out.print("How many inches long is the object you are measuring?");
        numInches = keyboard.nextInt();
        numFeet = numInches / INCHES_IN_A_FOOT;
        inchesRemaining = numInches % INCHES_IN_A_FOOT;
        System.out.println("The object is " + numFeet + " feet and " + inchesRemaining + " inches long.");
    }
}
