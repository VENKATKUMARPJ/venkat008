package mapdemo;
import java.util.* ;
public class Map {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(); 
		
		set.add("Orange");
		set.add("Watermelon");
		set.add("Banana");
		set.add("Apple");
		System.out.println(set);
		
		System.out.println("Size: "+set.size());
		
		System.out.println("Contains: "+ set.contains("Apple"));
	}

}
