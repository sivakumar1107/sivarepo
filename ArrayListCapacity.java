import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("siva");
        c1.add("kumar");
        c1.add("balu");
        c1.add("nani");
        c1.add("nithi");
        System.out.println(c1);
        c1.trimToSize();
        System.out.println(c1);
	}
}
