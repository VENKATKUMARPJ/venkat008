package oopstypes;

public class Polymorphism {
	 public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 	Polymorphism obj = new Polymorphism(); 
     System.out.println(obj.sum(1, 29)); 
     System.out.println(obj.sum(1, 30, 50)); 
     System.out.println(obj.sum(1.5, 27.5)); 
		

	}


}
