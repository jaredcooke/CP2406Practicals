public class NauticalMiles {

    public static void main(String[] args) {
    double KILOMETRESTONMILES = 1.852, MILESTONMILES = 1.150779, nauticalMiles = 10, kilometres, miles;
    miles = nauticalMiles * MILESTONMILES;
    kilometres = nauticalMiles * KILOMETRESTONMILES;
    System.out.println(nauticalMiles + " nautical miles is " + miles + " miles and " + kilometres + " kilometres");

    }
}
