package ThrowsDemo;

public class ThrowsUsage {
	void Division() throws ArithmeticException
    {
        int a=35,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }

	public static void main(String[] args) {
	
		ThrowsUsage T = new ThrowsUsage();
        try
       {
           T.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       System.out.print("\n\tEnd of program.");
   }


}
