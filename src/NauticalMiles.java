import javax.swing.*;
public class NauticalMiles {
    public static void main(String[] args){
        final double NM_TO_M = 1.150779;
        final double NM_TO_K = 1.852;
        double userInputNM;
        double nauticalToMiles;
        double nauticalToKilometers;
        String nauticalMilesEntered;
        nauticalMilesEntered = JOptionPane.showInputDialog(null, "how many nautical miles did you travel? ",
                "Nautical Mile Converter", JOptionPane.INFORMATION_MESSAGE);
         userInputNM = Integer.parseInt(nauticalMilesEntered);
        nauticalToMiles = NM_TO_M * userInputNM;
        nauticalToKilometers = NM_TO_K * userInputNM;
        JOptionPane.showMessageDialog(null, "You traveled " + nauticalToMiles + " miles, and " +
         nauticalToKilometers + " kilometers.");
    }
}
