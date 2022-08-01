package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
					public static void main(String[] args) {
						
						LinkedList<Integer> list= new LinkedList<Integer>();
						
						list.add(26);
						list.add(16);
						list.add(65);
						list.add(91);
						list.add(59);
						
						System.out.println("Size of list : "+list.size());
						System.out.println(list);
						
						list.remove(3);
						
						System.out.println(list);
						
						System.out.println("1st elemet: "+list.get(1));
						list.add(2,0);
						
						System.out.println(list);
						
						System.out.println("First element the List is: "+list.getFirst());
						
						System.out.println("Last element the List is: "+list.getLast());
	
						
						
					}

		}




