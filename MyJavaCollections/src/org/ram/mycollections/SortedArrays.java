package org.ram.mycollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 {
	private int id;
	private String name;
	
	public Person1(int id,String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String toString(){
		return id + " : "+ name;
		
	}
}

class StringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
         
        if (len1 > len2){
        	return 1;
        }else if (len1 < len2){
        	return -1;
        }
		return 0;
	}
}

class ReverseAlphbeticalComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
    //    return s1.compareTo(s2);
	    return -s1.compareTo(s2);
	}
}

public class SortedArrays {

	public static void main(String args[]){

		/////////// Sorting Strings ////////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("mouse");
		animals.add("tiger");
		animals.add("dog");		
		animals.add("cat");
		animals.add("kangaroo");
		
		//////////sort by length of the Sting //////////////
		//Collections.sort(animals, new StringLengthComparator());
		
        //////////sort by Alphabetical order of strings//////////////
		//Collections.sort(animals, new AlphbeticalComparator());
		
		//////////sort by Alphabetical Reverse order of strings//////////////
		Collections.sort(animals, new ReverseAlphbeticalComparator());
		
		for(String animal:animals){
			System.out.println(animal);
		}
		
		System.out.print("\n");
		
    	////////// Sorting Integers ////////////////////
		List<Integer> numbers = new ArrayList<Integer>();
			
	    numbers.add(38);
	    numbers.add(3);
	    numbers.add(12);
	    numbers.add(5);
	    numbers.add(60);
	     
	    //Natural order sorted. 
		//Collections.sort(numbers);
	    
	    //Rever order 
		Collections.sort(numbers, new Comparator<Integer>(){

			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}

			
			
		});
		
		for(Integer number:numbers){
				System.out.println(number);	
		}
		
		System.out.print("\n");
		
		//////sorting the Orbitary Objects ///////
		
		//Sort by ID
		List<Person1> people =  new ArrayList<Person1>();
		
		people.add(new Person1(7,"Mike"));
		people.add(new Person1(5,"John"));
		people.add(new Person1(3,"Pete"));
		people.add(new Person1(1,"Sue"));
		
		Collections.sort(people, new Comparator<Person1>() {

			public int compare(Person1 p1, Person1 p2) {
				if (p1.getId() > p2.getId()){ 
				     return 1;
				} else if (p1.getId() < p2.getId()){
					return -1;
				}
				return 0;
			}

		});
		
		for(Person1 person: people){
			System.out.println(person);
		}

		System.out.print("\n");
		
				
		//Sort by Name
		
		Collections.sort(people, new Comparator<Person1>() {

			public int compare(Person1 p1, Person1 p2) {
				return p1.getName().compareTo(p2.getName());
			}

		});
		
		for(Person1 person: people){
			System.out.println(person);
		}
		
	}	
}
