package collectionframework;

import java.util.HashSet;

public class Hashset {
	public static void main(String args[]) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Hyundai");
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("Lambo");
		
		System.out.println(cars.contains("BMW"));
		System.out.println(cars.remove("Toyota"));
		
		
		System.out.println(cars);
		
	}

	

}
