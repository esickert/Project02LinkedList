package packageLinkedList;

import java.util.*;

public class LinkedListCode3 {

	public void twoVariables()	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scanner.nextInt();
		
		Node start, tail;      //using only two variables.
		start = null;
		tail = null; 	       //if num is less that 0 (zero) the if statement will fail and program close with start null.
		
		if (num > 0)	{
		
			start = new Node(num,null);   //create the first node in the linked list.
			tail = start; // both start and tail are equal to the same thing (pointing to the same thing???);
		
			while (true)	{     //always true
				System.out.print("Please enter another number: ");
				num = scanner.nextInt(); //get inout
				if ( num <= 0) break;   //if num is less than 0, break out of while loop.
				tail.setNext(new Node(num, null)); //creates a new node beyond tail. we don't use next here.
				tail = tail.getNext();  //sets tail equal to that new node 
			}
		}
		System.out.println("You're numbers are: ");
		while (start.getNext()!=null) {   // THIS IS WORKING NOW!!!!
			System.out.print(start);
	 		start = start.getNext();		 // THIS IS THE KEY HERE. EACH INTERATION REPLACES ONE WITH THE NEXT NODE.
	 	}
	 	System.out.println("start is " + start);
	 	System.out.println("tail is " + tail);
	 	scanner.close();

	}
	
}
