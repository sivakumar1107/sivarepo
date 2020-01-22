import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {

	public static void main(String[] args) 
	{
		List<String> colors = new ArrayList<String>();
		colors.add("A");
		colors.add("B");
		colors.add("C");
		colors.add("D");
		colors.add("E");
		colors.add("F");
		System.out.println("Colors :"+colors);
List<String> names = new ArrayList<String>();
		colors.add("G");
		colors.add("H");
		colors.add("I");
		colors.add("J");
		colors.add("K");
		colors.add("L");
		System.out.println("Names :"+names);
		Collections.copy(colors,names);
		System.out.println("Colors :"+names);
		System.out.println("Names :"+colors);
	}
}
