package com.epam.CustomList.CollectionFramework;
import java.util.*;
public class DriverClass 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	CustomListImplementation<Integer> list =new CustomListImplementation();
        System.out.println("List of options");
        System.out.println("1. Add an element to list");
        System.out.println("2. Remove an element from index in list");
        System.out.println("3. Get element with index");
        System.out.println("4. to know list size");
        System.out.println("5. display elements in list");
        Boolean repeat=true;
        while(repeat) {
        System.out.print("choose your option from option list:");
        int choice=sc.nextInt();
        switch(choice) {
        case 1:
        	System.out.print("Enter number to insert: ");
        	int number=sc.nextInt();
        	list.insert(number);
        	break;
        case 2:
        	System.out.print("enter index/position of an element:");
        	int c=sc.nextInt();
        	list.remove(c);
        	break;
        case 3:
        	System.out.print("enter index/position:");
        	int ch=sc.nextInt();
        	System.out.println("element at index "+ch+" is "+list.get(ch));
        	break;
        case 4:
        	System.out.println("size of list is: "+list.size());
        	break;
        case 5:
        	System.out.println("List: "+list);
        	break;
        default:
        	System.out.println("You have entered wrong choice.");
        	break;
        }
        
        System.out.println("Do you want to repeat again?");
        System.out.println("0.No");
        System.out.println("1.Yes");
        
        System.out.print("choose your option(0/1): ");
        int option=sc.nextInt();
        if(option==0) {
        	repeat=false;
        }
        
        
    }
    }
}
