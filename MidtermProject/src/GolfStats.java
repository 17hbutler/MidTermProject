
public class GolfStats 
{

	public static void main(String[] args) 
	{ 
		for(int i = 0; i < 5; i++) 
		{
			AddData.newData();
			System.out.println(AddData.data.get(i));
		}
		
	}

}
