import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayList {

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		List<String> list1=new ArrayList<String>();
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("I");
		list1.add("J");
		list.addAll(list1);
		System.out.println(list);
	}
}
