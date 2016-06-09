import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String []args){
		
		//Step One
		//Two objects of CD type are created and populated
		CD one = new CD ("Rattle and Hum", "U2", "1988", "Island Records");
		CD two = new CD ("The Dark Side of the Moon", "Pink Floyd", "1973", "Capitol");
		
		//A CD catalogue list is created
		List <CD> cdCatalogue = new ArrayList <>();
		
		//CD one and two are added to the list
		cdCatalogue.add(one);
		cdCatalogue.add(two);
		
		//Step Two
		//A third object of CD type is created and populated
		CD three = new CD ("The Very Best Of Fleetwood Mac", "Fleetwood Mac", "2002", "Warner Bros. Records");
		
		//The CD object three is added to position 0 of the list 
		cdCatalogue.add(0, three);
		
		//Step Three
		//A fourth object of CD type is created and populated
		CD four = new CD ("Alanis Morissette: The Collection", "Alanis Morissette", "2005", "Maverick");
		
		//The CD object four is added to position 1 of the list
		cdCatalogue.add(1, four);
		
		//Step Four
		System.out.println("Step 4: \n");
		//Checks if CD object three is in the list and prints out the text below if it is
		if (cdCatalogue.contains(three)){
			System.out.println("The album, '" + three.getName() + "', is already stored in the catalogue.\n");
		}
		
		//Step Five
		System.out.println("Step 5: ");
		//Prints out the CD at position 3
		System.out.println(cdCatalogue.get(3));
		
		//Step Six
		//Removes the CD object three from the list
		cdCatalogue.remove(three);
		
		//Step Seven
		//Prints out the amount of CDs contained in the list
		System.out.println("\nThis catalogue contains " + cdCatalogue.size() + " CDs\n");
		
		//Step Eight
		//Prints out the entire list using an enhanced for loop
		System.out.println("**********************CD Catalogue**********************");
		for (CD c : cdCatalogue){
			System.out.println(c);
		}
		System.out.println("********************************************************");

	}

}
