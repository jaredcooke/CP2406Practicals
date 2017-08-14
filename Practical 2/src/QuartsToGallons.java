public class QuartsToGallons {
    public static void main(String[] args) {
        int quartsInGallon = 4, quarts = 20, gallons, extraQuarts;
        gallons = (quarts / quartsInGallon);
        extraQuarts = quarts % quartsInGallon;
        System.out.println(gallons + " gallons plus " + extraQuarts + " quarts");


    }
}
