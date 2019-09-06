import java.util.Scanner;
import javax.swing.*;
public class PostersInBoxInteractive {
    public static void main (String[]args){
        int numPosters;
        int numBoxes;
        int postersRemaining;
        int NUM_POSTERS_IN_BOX = 11;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of posters bought>>>>");
        numPosters = keyboard.nextInt();
        numBoxes = numPosters / NUM_POSTERS_IN_BOX;
        postersRemaining = numPosters % NUM_POSTERS_IN_BOX;
       System.out.println("You will need " + numBoxes + " boxes, and have " + postersRemaining + " posters remaining.");
    }
}
