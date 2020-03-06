package com.epam.CustomList.CollectionFramework;
import java.util.Arrays;
public class CustomListImplementation<T> {
	private int listsize=0;
	private static final int DefaultSize=10;
	private Object elements[];
	
	// constructor 
	public CustomListImplementation() {
		elements=new Object[DefaultSize];
	}
	
	
	//insert method
	public void insert(T x) {
		if(listsize==elements.length) {
			increaseCapacity();
		}
		elements[listsize++]=x;
		System.out.println("element inserted successfully...!");
	}
	
	//Get method
	public T get(int i) {
		if(i>= listsize|| i<0) {
			throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
		}
		return (T)elements[i];
	}
	
	// remove method
	public T remove(int i) {
		if(i>= listsize|| i<0) {
			throw new IndexOutOfBoundsException("Index: "+i+", Size "+i);
		}
		Object item=elements[i];
		int numberOfElements=elements.length - (i+1);
		System.arraycopy( elements, i + 1, elements, i, numberOfElements ) ;
		listsize--;
		System.out.println("element removed successfully...!");
		return (T)item;
	}
	
	//size method
	public int size() {
		return listsize;
	}
	
	//print method to print the list
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append('[');
		for(int i=0;i<listsize;i++) {
			sb.append(elements[i].toString());
			if(i<listsize-1) {
				sb.append(',');
			}
		}
		sb.append(']');
		return sb.toString();
	}
	
	private void increaseCapacity() {
		int newSize=elements.length *2;
		elements=Arrays.copyOf(elements, newSize);
		System.out.println("capacity of list increased to "+newSize);
	}
	
}
