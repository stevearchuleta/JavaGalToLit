/*
 Oracle Java 6th Edition
 Try This 1-1
 This program converts gallons to litres.
 */
public class GalToLit {

	public static void main(String[] args) {
		double gallons; // this instance variable holds the number of gallons.
		double litres; // this instance variable holds the conversion to litres.

		gallons = 10; // initialize value to 10.

		litres = gallons * 3.7854; // conversion factor to litres.

		System.out.println(gallons + " gallons equals " + litres + " litres.");
	}

}
