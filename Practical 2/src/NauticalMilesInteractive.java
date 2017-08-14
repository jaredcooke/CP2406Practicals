import javax.swing.JOptionPane;
public class NauticalMilesInteractive {

    public static void main(String[] args) {
        String nauticalMilesString;
        double KILOMETRESTONMILES = 1.852, MILESTONMILES = 1.150779, nauticalMiles, kilometres, miles;
        nauticalMilesString = JOptionPane.showInputDialog(null,"How many nautical miles?");
        nauticalMiles = Double.parseDouble(nauticalMilesString);
        miles = nauticalMiles * MILESTONMILES;
        kilometres = nauticalMiles * KILOMETRESTONMILES;
        JOptionPane.showMessageDialog(null, nauticalMiles + " nautical miles is " + miles + " miles and " + kilometres + " kilometres");
    }

}
