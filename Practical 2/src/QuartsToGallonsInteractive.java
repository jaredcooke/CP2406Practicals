import javax.swing.JOptionPane;
public class QuartsToGallonsInteractive {

    public static void main(String[] args) {
        int quartsInGallon = 4,quarts, gallons, extraQuarts;
        String quartsString;
        quartsString = JOptionPane.showInputDialog(null, "How many quarts?");
        quarts = Integer.parseInt(quartsString);
        gallons = (quarts / quartsInGallon);
        extraQuarts = quarts % quartsInGallon;
        System.out.println(gallons + " gallons plus " + extraQuarts + " quarts");


    }
}
