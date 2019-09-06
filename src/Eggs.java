import javax.swing.*;
public class Eggs {
    public static void main (String[]args){
        final double DOZEN_EGG_PRICE = 3.25;
        final double SINGLE_EGG_PRICE = .45;
        final int EGGS_IN_A_DOZEN = 12;
        int userInputEggs;
        double dozenEggs;
        double singleEggs;
        double dozenEggsPrice;
        double singleEggsPrice;
        String eggsEntered;
        eggsEntered = JOptionPane.showInputDialog(null, "How many eggs would you like?",
                "Egg interface" ,JOptionPane.INFORMATION_MESSAGE);
        userInputEggs = Integer.parseInt(eggsEntered);
        dozenEggs = userInputEggs / EGGS_IN_A_DOZEN;
        singleEggs = userInputEggs % EGGS_IN_A_DOZEN;
        dozenEggsPrice = dozenEggs * DOZEN_EGG_PRICE;
        singleEggsPrice = singleEggs * SINGLE_EGG_PRICE;
        System.out.print("You requested " + dozenEggs + " dozen, at the price of $" + dozenEggsPrice + ". And " + singleEggs +
                " loose eggs, at the price of $" + singleEggsPrice);
    }
}
