import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class IterateDemo 
{

	public static void main(String[] args)
	{
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		System.out.println(colors);
		Iterator<String> itr=colors.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
