package org.ram.mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
		private String name;
	
		public Person2(String name){
			this.name = name;
		}
	    public String toString(){
	    	return name;
	    }
	    
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person2 other = (Person2) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		public int compareTo(Person2 person) {
           
			//return name.compareTo(person.name);
			//return -name.compareTo(person.name);
			int len1 =  name.length();
			int len2 =  person.name.length();
			
			if (len1 > len2){
				return 1;				
			} else if (len1 < len2){
				return -1;
			} else {
//				return 0;
				return name.compareTo(person.name);
			}
		}
	    
}

public class NaturalOrderListsSets {

	public static void main(String args[]){
		List<Person2> list =  new ArrayList<Person2>();
		Set<Person2>    set = new TreeSet<Person2>();
		
		addElements(list);
		addElements(set);
		
    	Collections.sort(list);
		
		showElements(list);
		System.out.println("\n");
		showElements(set);
	}
	
	public static void addElements(Collection<Person2> col){
		col.add(new Person2("John"));
		col.add(new Person2("Cloe"));
		col.add(new Person2("Sue"));
		col.add(new Person2("Mikel"));
		col.add(new Person2("Peterson"));		
		
	}
	
	public static void showElements(Collection<Person2> col){
		for(Person2 element: col){
			System.out.println(element);
		}
	}
}
