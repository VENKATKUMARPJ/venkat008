package callingMethod;

public class MethodOverloading {
	public void add() {
		int number1 = 10;
		int number2 = 20;
		System.out.println(number1+number2);
		}
	public void add(int num1,int num2) {
		
		System.out.println(num1+num2);
		}
     public void add(float num1,int num2,int num3) {
	
	System.out.println(num1+num2+num3);
	}
     
     public static void main(String[] args) {
    	 MethodOverloading load = new MethodOverloading();
    	 load.add();
    	 load.add(50,32);
    	 load.add(23.3f,44,65);
     }
}