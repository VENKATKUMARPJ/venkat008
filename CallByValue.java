package callingMethod;

public class CallByValue {
	int number=300;

	void operation(int number) {
		this.number=number*10/100;
		//if parameter is not passed it will take default value, but once the parameter
		// is passed it will take the value of parameter
	}
	public static void main(String[] args) {
		
		CallByValue obj= new CallByValue();
		
		System.out.println("Numbere value without call by value: "+obj.number);
		
		obj.operation(400);
		System.out.println("Number value with call by value: "+obj.number);
	}
}


