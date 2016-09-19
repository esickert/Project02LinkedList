package packageLinkedList;

import java.util.*;

public class LinkedListClass extends Stuff {
    public static void main(String[] args)	{
	    	

   	Node three = new Node(678,null);
   	Node two = new Node(345,three);
    Node one = new Node(123,two);
    
	 one.setNext(two);
	 two.setNext(three);
	 three.setNext(null);
// *  OKAY THIS IS WEIRD BUT IT DOES WORK. NEED TO FIGURE THIS OUT. 

	 while (one.getNext()!=null) {   // THIS IS WORKING NOW!!!!
		System.out.println(one.getItem());
	 	one = one.getNext();		 // THIS IS THE KEY HERE. EACH INTERATION REPLACES ONE WITH THE NEXT NODE.
	 }
	 System.out.println(one.getItem());
	 toSleep(5000);
	 System.out.println("That ends that stuff!!\n");
	 
//**************************************************************************	

	LinkedListCode2 sample2 = new LinkedListCode2();
//	sample2.threeVariables();
	
	LinkedListCode3 sample3 = new LinkedListCode3();
	sample3.twoVariables();
			   	
	    	
}
}
	    