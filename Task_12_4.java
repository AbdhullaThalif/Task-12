package programming;

import java.util.ArrayList;

public class ListtoArray {
	public static void main(String args[]){
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("Lilly");
	      list.add("Lotus");
	      list.add("Sunflower");

	      System.out.println("Contents of list ::"+list);
	      String[] myArray = new String[list.size()];
	      list.toArray(myArray);

	      for(int i=0; i<myArray.length; i++){
	         System.out.println("Element at the index "+i+" is ::"+myArray[i]);
	      }
	   }

}
