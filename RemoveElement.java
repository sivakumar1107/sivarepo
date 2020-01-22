import java.util.*;
public class RemoveElement {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(183);
		list.add(143);
		list.add(163);
		list.add(201);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
	}
}
