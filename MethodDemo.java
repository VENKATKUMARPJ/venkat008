package callingMethod;

public class MethodDemo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {

		MethodDemo b=new MethodDemo();
		int ans= b.multipynumbers(76,8);
		System.out.println("Multipilcation of Demo method is :"+ans);

}
}
