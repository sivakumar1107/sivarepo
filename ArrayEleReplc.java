import java.util.ArrayList;

public class ArrayEleReplc {

	public static void main(String[] args)
	{
		ArrayList<String> c1= new ArrayList<String>(15);
        c1.add("siva");
        c1.add("kumar");
        c1.add("balu");
        c1.add("nani");
        c1.add("nithin");
        System.out.println(c1);
        c1.set(1,"Karthik");
        System.out.println(c1);

	}

}
