import java.util.ArrayList;

public class ArryListPos {

	public static void main(String[] args) 
	{
		ArrayList<String> c1= new ArrayList<String>(15);
        c1.add("siva");
        c1.add("kumar");
        c1.add("balu");
        c1.add("nani");
        c1.add("nithin");
        System.out.println(c1);
        int n=c1.size();
        for(int i=0;i<n;i++)
        {
        	System.out.println(c1.get(i));
        }

	}

}
