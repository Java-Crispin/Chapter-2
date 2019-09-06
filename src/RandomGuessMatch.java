import javax.swing.*;
public class RandomGuessMatch {
    public static void main (String[]args){
        Boolean isCorrect;
        int randomNumber = (1 + (int)(Math.random() * 5));
        int userGuess;
        String  userInput;
        userInput = JOptionPane.showInputDialog(null, "Please enter a number that is between 1 and 5",
                "Would you like to play a game?" , JOptionPane.INFORMATION_MESSAGE);
        userGuess = Integer.parseInt(userInput);
if (userGuess == randomNumber) System.out.print("Correct");
        else System.out.print("Incorrect");
}
}
