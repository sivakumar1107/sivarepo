import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(183);
		list.add(143);
		list.add(163);
		list.add(201);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
