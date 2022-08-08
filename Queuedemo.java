package practicelessonfour;
import java.util.Queue;
import java.util.LinkedList;
public class Queuedemo {
		public static void main(String[] args) {
			Queue<String> FruitsQueue= new LinkedList<String>();

			FruitsQueue.add("Watermelon");
			FruitsQueue.add("Orange");
			FruitsQueue.add("Banana");
			FruitsQueue.add("Mango");
			FruitsQueue.add("pineapple");
			FruitsQueue.add("Kiwi");

			System.out.println("Queue is : "+FruitsQueue);


			//find head of queue
			System.out.println("Head of Queue: "+FruitsQueue.peek());

			FruitsQueue.remove();

			System.out.println("After Removing Head: "+FruitsQueue);
			

		}
	

}
