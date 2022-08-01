package collections;
import java.util.LinkedHashSet;
public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();
		
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("E");
		linkedset.add("D");
		linkedset.add("A");
		linkedset.add("C");
		linkedset.add(null);
		
		System.out.println("Size: "+linkedset.size());
		
		System.out.println(linkedset);
		
		
		System.out.println("Contains E: "+linkedset.contains("E"));
		
		linkedset.remove(null);
		
		System.out.println("After Remove: "+linkedset);
		
	}
	
}


