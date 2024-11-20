package ThrowsDemo;

public class Customexcption extends Exception {
	public Customexcption(String s) 
    { 
        super(s); 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        { 
            throw new Customexcption("temp"); 
        } 
        catch (Customexcption ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 

	}
	

}
