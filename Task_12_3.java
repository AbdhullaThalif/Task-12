package programming;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMap {
	public static void main(String[] args) {

		SortedMap<String, Integer> employee = new TreeMap<>();

		employee.put("Arun", "01");
		employee.put("Ashok", "02");
		employee.put("Guna", "03");
		employee.put("Barath", "04");
		employee.put("Chandran", "05");

		System.out.println(employee);
	}

}
