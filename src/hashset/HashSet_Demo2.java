package hashset;

import java.util.HashSet;

import hashset.Emp;

public class HashSet_Demo2 {
	public static void main(String[] args) {
		
HashSet<Emp> set=new HashSet<Emp>();

Emp e1=new Emp(101,"Vastav","QA",5000);
Emp e2=new Emp(102,"Ramya","Consultant",12000);
Emp e3=new Emp(103,"Charan","Analyst",9000);
Emp e4=new Emp(104,"Tanmayi","Developer",7000);

set.add(e1);
set.add(e2);
set.add(e3);
set.add(e4);

for(Emp emp:set)
{
	System.out.println(emp.id+"---"+emp.name+"---"+emp.role+"---"+emp.salary);
}
}
}