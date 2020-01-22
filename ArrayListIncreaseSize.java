import java.util.ArrayList;

public class ArrayListIncreaseSize {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>(15);
        c1.add("siva");
        c1.add("kumar");
        c1.add("balu");
        c1.add("nani");
        c1.add("nithin");
        System.out.println(c1);
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        c1.add("e");
        System.out.println(c1);
        
	}

}
