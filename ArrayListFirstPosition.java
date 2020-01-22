import java.util.ArrayList;
import java.util.List;

public class ArrayListFirstPosition {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> colors = new ArrayList<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		System.out.println(colors);
		colors.add(0,"Pink");
		System.out.println(colors);

	}

}
