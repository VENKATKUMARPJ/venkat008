package collections;
import java.util.HashSet;
public class Hashset {public static void main(String[] args) {
	HashSet<Integer> set = new HashSet<Integer>();
	
	set.add(34);
	set.add(84);
	set.add(15);
	set.add(69);
	set.add(76);
	set.add(13);
	set.add(null);
	
	System.out.println("Size: "+set.size());
	
	System.out.println(set);
	
	System.out.println("Contains: "+ set.contains(76));
	
	set.remove(null);
}

}
