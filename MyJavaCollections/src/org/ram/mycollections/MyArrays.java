package org.ram.mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class MyArrays {
	
	public static void main(String args[]){
		
		List<Integer> myList = new ArrayList<Integer>();
	//	Collection<Integer> mylist1 = new HashSet<Integer>();
	//	Iterable<Integer> mylist2 = new HashSet<Integer>();
    //   Iterable<Integer> mylist3 = new ArrayList<Integer>();

	//This is invalid 	
	//	List<Integer> mylist4 = new HashSet<Integer>();
		
		
		
		
		myList.add(1);
		myList.add(5);
		myList.add(10);
		myList.add(9);
		myList.add(6);
		myList.add(18);
		myList.add(3);
		
		
		
		//Indexed for loop for iteration 
		for(int i=0; i < myList.size(); i++){
		System.out.println("Elment# "+ i + " value " + myList.get(i));
		}
		
		System.out.println();

		//		int k=10;
        //		myList.add(myList.size() - 10);
		myList.remove(0);
		myList.add(0,10);
       //   myList.add(20, 25);
		
		//Enhanced for loop
		for(Integer i:myList){
			System.out.println("Enhaced - Elment value # " + i);
			}
			
		
	}

}
