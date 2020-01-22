import java.util.*;
public class SwapArrayList 
{

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);
		Collections.swap(list, 1, 3);
		System.out.println(list);
	}
}
