package org.ram.mycollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySets {

	public static void main(String args[]){

		//HashSet doesn't retain the order
		//Set<String> set1 = new HashSet<String>();
		
		//Linked HashSet retain the order
		//Set<String> set1 = new LinkedHashSet<String>();

		//TreeSet will arrage in natural order
		Set<String> set1 = new TreeSet<String>();

		if(set1.isEmpty()){
			
			System.out.println("Now the set is Empty");
		}		
		set1.add("dog");
		set1.add("cat");
		set1.add("bear");
		set1.add("tiger");
		set1.add("pig");
		set1.add("chicken");
		set1.add("cow");
		
		//adding duplicate item 
		
		set1.add("cow");
		
		System.out.println(set1);
		
		///////iteraton///////////
		for(String element:set1){
			System.out.println(element);
		}
		
		// Does set contain a item?
		
		if(set1.contains("lion")) {
			System.out.println("Lion is not in the set");
		}
		
		if(set1.contains("cat")) {
			System.out.println("This set contains CAT/cat");
		}
		
		

		// Set2 contains some commone elemments from set1 and some new elementes
		Set<String> set2 =  new TreeSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("crow");
		set2.add("Eag le");
		set2.add("Parrot");
		set2.add("Hen");

		///////Intersecton//////////
		
		Set<String> intersection = new HashSet<String>(set1);
		
		//System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println(intersection);
		
		
	    ///////difference //////////
		
	    Set<String> difference = new HashSet<String>(set1);
			
		//Match against the set2 values and removes the maching ones from set1	
		difference.removeAll(set2);
			
		System.out.println(difference);
		
	}
}


