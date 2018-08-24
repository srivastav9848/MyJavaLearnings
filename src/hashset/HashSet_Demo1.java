package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo1 {
public static void main(String[] args) {
	HashSet<String> names=new HashSet<String>();
	names.add("TOm");
	names.add("peter");
	names.add("david");
	names.add("Angelina");
	System.out.println("Size of the hashset :"+names.size());
	
	Iterator<String>it=names.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
