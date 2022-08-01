package constructors;

public class Constructoroverloading {
	int len,bre,side;
	float radius;
	Constructoroverloading()
	{
		len=bre=10;
	}
	Constructoroverloading(int p,int q)
	{
		len=p;
		bre=q;
		
	}
	Constructoroverloading(int d)
	{
		side=d;
	}
	Constructoroverloading(float p)
	{
		radius=p;
	}
	void areaofcircle()
	{
		double area=3.14*radius*radius;
		System.out.print(area);
	}
	void areaofsquare()
	{
		int sarea=side*side;
		System.out.print(sarea);
	}
	void areaofrectangle()
	{
		int rarea=len*bre;
		System.out.print(rarea);
	}
	void areaofrhombus()
	{
		int rharea=side*side;
		System.out.print(rharea);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading cs1=new Constructoroverloading();
		Constructoroverloading cs2=new Constructoroverloading(20);
		Constructoroverloading cs3=new Constructoroverloading(12,23);
		Constructoroverloading cs4 = new Constructoroverloading(23.6F);
		cs1.areaofrectangle();
}
}


