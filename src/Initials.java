import javax.swing.*;
public class Initials {
    public static void main (String[]args){
        String firstInitial;
        String secondInitial;
        String thirdInitial;
        firstInitial = JOptionPane.showInputDialog(null, "What is your first initial?",
                JOptionPane.INFORMATION_MESSAGE);
        secondInitial = JOptionPane.showInputDialog(null, "What is your second initial?",
                JOptionPane.INFORMATION_MESSAGE);
        thirdInitial = JOptionPane.showInputDialog(null, "What is your third initial?",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.print("Your initials are " + firstInitial + ". " + secondInitial + ". " + thirdInitial + ".");
    }
}
