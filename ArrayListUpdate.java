import java.util.*;
public class ArrayListUpdate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Siva");
		list.add("Kumar");
		list.add("Nithin");
		System.out.println(list);
		list.set(1, "karthik");
		System.out.println(list);	
	}
}