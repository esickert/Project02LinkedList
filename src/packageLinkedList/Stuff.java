package packageLinkedList;

public class Stuff {

	public static void toSleep(int num)	{
	
	try {
    	Thread.sleep(num);                 //1000 milliseconds is one second.
} 	catch(InterruptedException ex) {
    	Thread.currentThread().interrupt();
}
	

	}

}
