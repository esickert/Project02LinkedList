package packageLinkedList;

//import java.util.*;

public class LinkedListClass {
    public static void main(String[] args)	{
	    	
//	Node next;
	
//    Node erich = new Node();
   	Node three = new Node(678,null);
   	Node two = new Node(345,three);
    Node one = new Node(123,two);
    
//	 erich.setItem(666);
//	 erich.setNext(null);
	 
//	 System.out.println(erich.getItem());
//	 System.out.println(erich.getNext());
	 
	 one.setNext(two);
	 two.setNext(three);
	 three.setNext(null);
//**************************************************************************
	 
/**
 *  OKAY THIS IS WEIRD BUT IT DOES WORK. NEED TO FIGURE THIS OUT. 
 */
	 while (one.getNext()!=null) {   // THIS IS WORKING NOW!!!!
		System.out.println(one.getItem());
	 	one = one.getNext();		 // THIS IS THE KEY HERE. EACH INTERATION REPLACES ONE WITH THE NEXT NODE.
	 }
	 System.out.println(one.getItem());
	 
//**************************************************************************	    	
	    	
	    }
}
	    