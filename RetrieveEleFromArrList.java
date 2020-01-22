import java.util.ArrayList;
import java.util.List;

public class RetrieveEleFromArrList {

	public static void main(String[] args) 
	{
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		System.out.println(colors);
		String name=colors.get(2);
		System.out.println(name);

	}

}
