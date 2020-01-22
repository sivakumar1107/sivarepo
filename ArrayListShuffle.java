import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListShuffle {

	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("183");
		list.add("143");
		list.add("163");
		list.add("201");
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
