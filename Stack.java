package practicelessonfour;

public class Stack {
	static final int MAX=1000;
	   int tos;
	   int a[]=new int[MAX];
	   
	   boolean isEmpty() {
		   return tos<0;
	   }
	   
	   public Stack() {
		   tos=-1;//default stack an empty
	   }
	   
	   boolean push(int x) {
		   if(tos>=(MAX-1)) {
			   System.out.println("Stack over flow");
			   return false;
		   }
		   else {
			   a[++tos]=x;
			   System.out.println(x+" Pushed into stack");
			   return true;
		   }
	   }
	   int pop() {
		   if(tos<0) {
			   System.out.println("Stack under flow");
			   return 0;
		   }
		   else {
			   int x=a[tos--];
			   return x;
		   }
	   }
	   
	   public static void main(String args[]) {
		   Stack s=new Stack();
		   s.push(10);
		   s.push(20);
		   s.push(30);
		   s.push(40);
		   
	      System.out.println(s.pop()+" Poped out from stack");
	      System.out.println(s.pop()+" Poped out from stack");
		   
	   }
	 

}
