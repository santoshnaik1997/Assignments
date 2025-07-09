package classassigments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_ArrayCollections {

	public static void main(String[] args) {
		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.	
        // Example data (areas in sq km) :
        // 1. New York City - 783
        // 2. Tokyo - 2191
        // 3. India - 1302
        // 4. Chicago - 606
        // 5. Houston - 1651
		
		List<Integer> areaOfCity = new ArrayList<Integer>();
		
		areaOfCity.add(783);
		areaOfCity.add(2191);
		areaOfCity.add(1302);
		areaOfCity.add(606);
		areaOfCity.add(1651);
		
		int sum = areaOfCity.get(2)+areaOfCity.get(3);
		
		System.out.println("total area of the 3rd and 4th cities: " + sum + " sq km");
		
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		//1. Eiffel Tower (France)
		//2. Great Wall of China (China)
		//3. Times Square (USA)
		//4. Colosseum (Italy)
		//5. Louvre Museum (France)
		//6. Statue of Liberty (USA)
		//7. Machu Picchu (Peru)
		//8. Christ the Redeemer (Brazil)
		//9. Taj Mahal (India)
		//10. Burj Khalifa (UAE)
		
		Set<String> vistPlace = new HashSet<String>();
		vistPlace.add("Eiffel Tower - France");
		vistPlace.add("Great Wall of China");
		vistPlace.add("Times Square (USA)");
		vistPlace.add("Colosseum (Italy)");
		vistPlace.add("Louvre Museum (France)");
		vistPlace.add("Statue of Liberty (USA)");
		vistPlace.add("Machu Picchu (Peru)");
		vistPlace.add("Christ the Redeemer (Brazil)");
		vistPlace.add("Taj Mahal (India)");
		vistPlace.add("Burj Khalifa (UAE)");
		
		System.out.println(vistPlace.size());
		System.out.println("The top 10 most visited tourist attractions in the world " + vistPlace);
		
		//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
		//Data - 3, 12, 6, 8 , 33, 23, 1, 2, 54, 10.
		
		//int[] number = new int[10];
		
		int[] num= {3, 12, 6, 8 , 33, 23, 1, 2, 54, 10};
		
		int average = (num[4] + num[5]) / 2;
		
		System.out.println("The Average of 5th and 6th Value is " + average);
		
		
		//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		//Data - Dangal, Baahubali, RRR, KGF, Kantara
		
		List<String> movies = new ArrayList<String>();
		
		movies.add("Dangal");
		movies.add("Baahubali");
		movies.add("RRR");
		movies.add("KGF");
		movies.add("Kantara");
		
		System.out.println(movies.get(2));
		
	
	}
	

}
