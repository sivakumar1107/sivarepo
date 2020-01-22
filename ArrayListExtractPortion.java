import java.util.ArrayList;
import java.util.List;

public class ArrayListExtractPortion {

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("183");
		list.add("143");
		list.add("163");
		list.add("201");
		System.out.println(list);
		List<String> list1= list.subList(1, 4);
		System.out.println(list1);
	}

}
