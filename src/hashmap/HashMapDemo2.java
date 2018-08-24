package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		//creating employee map
		HashMap<Integer,Emp> empmap=new HashMap<Integer, Emp>();
		
		//creating employes
		Emp emp1=new Emp(101,"Tom","Developer",12000);
		Emp emp2=new Emp(102,"Peter","HR",10000);
		Emp emp3=new Emp(103,"Kavya","Business Analyst",14000);
		Emp emp4=new Emp(104,"Vastav","Manager",20000);
		
		//adding employees to the map
		empmap.put(1, emp1);
		empmap.put(2, emp2);
		empmap.put(3, emp3);
		empmap.put(4, emp4);
		
		
		//traversing the map
		for(Map.Entry<Integer, Emp> map:empmap.entrySet())
		{
			int key=map.getKey();
			Emp e=map.getValue();
			System.out.println(key+" Details are:");
			System.out.println(e.id +"-----"+e.name+"-----"+e.role+"-----"+e.salary);
		}
		
	}
}
