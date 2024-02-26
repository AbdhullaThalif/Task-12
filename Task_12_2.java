package programming;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("Ashok");
		list.add("Prabhu");
		list.add("Sanjaj");
		list.add("Vishal");

		System.out.println("ArrayList: " + list);

		System.out.println("Size of ArrayList = " + list.size());

		list.clear();

		System.out.println("\nAfter clear\n\n" + "ArrayList: " + list);

		System.out.println("Size of ArrayList = " + list.size());
	}
}
