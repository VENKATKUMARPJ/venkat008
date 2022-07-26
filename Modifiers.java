package project;

public class Modifiers {
	void display()
	{
	System.out.println("You are using defalut access specifier");
	}
	public static void main(String[]args)
	{
		System.out.println("Dafault modifers");
        Modifiers obj = new  Modifiers();
        obj.display();
	}
}

    