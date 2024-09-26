package problemDimond;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}  
public class Diamond implements First,Second{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond ob = new Diamond(); 
        ob.show(); 

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		First.super.show();
		Second.super.show(); 
	}



}
