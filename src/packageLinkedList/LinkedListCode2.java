package packageLinkedList;

import java.util.*;

public class LinkedListCode2 {

	public void threeVariables()	{
	
	Scanner scanner = new Scanner(System.in);
	Node start, tail, next = null;                // declare three variable of type Node.
	
	start = null;
	System.out.print("Please enter a number: ");
	int num = scanner.nextInt();
//	System.out.print("The number is " + num);
	
	if (num > 0) 
		start = new Node(num,null);   //create first node
		tail = start;  //setting tail to start values
		// get more numbers
		while (true)	{
			System.out.print("Please enter another number: ");
			num = scanner.nextInt(); 
			if (num <= 0)	break;       //as long as num not equal to 0, get number
			next = new Node(num, null);  //create a new node and set next to it.
			tail.setNext(next);  //set tail to point to the new last node
			tail = next;
		}
	System.out.println("You're numbers are: ");
	while (start.getNext()!=null) {   // THIS IS WORKING NOW!!!!
		System.out.print(start);
	 	start = start.getNext();		 // THIS IS THE KEY HERE. EACH INTERATION REPLACES ONE WITH THE NEXT NODE.
	 }
	 System.out.println(tail);
	 scanner.close();
	
	
	}
	

}
