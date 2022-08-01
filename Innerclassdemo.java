package innerClass;

public class Innerclassdemo {
	private int data=55;
	 void display(){  
	  class Local{  
	   void msg(){System.out.println(data);}  
	  }  
	  Local m=new Local();  
	  m.msg();  
	 }  
	 public static void main(String args[]){  
		 Innerclassdemo obj=new Innerclassdemo();  
	  obj.display();  
	 } 

}
