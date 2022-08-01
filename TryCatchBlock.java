package tryandcatch;

public class TryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[7];
        try 
        {
            array[7] = 4;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("To Array index is out of bounds!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }


	}


}
