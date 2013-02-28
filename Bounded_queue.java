
public class Bounded_queue {
	
	private int size=0;				//start of queue with size 0
	private int head=0;				//head and tail
	private int tail=0;				//start off with 0
	private int[] array;
	
	public Bounded_queue(int size1){				//constructor
		array = new int[size1];
	}
	
	public void enqueue(int n){					//Enqueue
		if (size == array.length){				//Checking if Queue is full
			System.out.println("Queue is full");
		}
		else{									//If Queue is not full
			array[tail] = n;
			tail = tail + 1;
			size++;
		}
	}
	
	public int dequeue() throws Exception{			
		if (size==0){					       //If Queue is empty, throw exception
			throw new Exception("Queue is empty");
		}
		int local = array[head];
		head = head +1;
		size--;
		return local;
	}
	//Testing the queue 
	//Makes a queue of size 5, adds elements: 1,2,3,4,5.. Tries to add 6th element unsuccessfully. Dequeues the 5 elements one by one. The 6th call to dequeue, leads to the program throwing an exception  
	//Output looks something like this 
/*	Queue is full			
	1
	2
	3
	4
	5
	java.lang.Exception: Queue is empty
	*/

	public static void main(String[] argv){
		Bounded_queue test = new Bounded_queue(5);
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		test.enqueue(5);
		test.enqueue(6);
//		test.enqueue(1);
try{
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
}
catch (Exception e){
		System.out.println(e);
}
	}
}

