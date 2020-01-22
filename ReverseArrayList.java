import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("183");
		list.add("143");
		list.add("163");
		list.add("201");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
