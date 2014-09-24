
public class GolfStats 
{

	public static void main(String[] args) 
	{ 
		for(int i = 0; i < Calculate.counter++; i++) 
		{
			Calculate.inputNewName();
			AddData.newData();
			System.out.println(AddData.data.get(i));
		}
		
	}

}
