import java.util.*;


public class part3{
	
	
	
	
	
	public static class Stacks{ //everything static so that it can be accessed
	private ArrayList<Integer> myList;
	private int size;
	
	public Stacks() {
		size = 0;
		
	}
	
//brainstorming: I am thinking of using a linkedList that prepends when ever u are adding an element 
   	
//getMin method I can use another LinkedList to keep track of the most minimum number
//	Challenge: Implement the Stack class from scratch (do not use your language’s standard stack or queue library/package methods). In this challenge, your Stack will only accept Integer values. Implement the following methods:
//		push() → Pushes an integer on top of the stack
//		pop() → Removes what is on the top of the stack, and returns that value to the caller
//		top() → Looks at the top value, and returns it. Does not manipulate the stack
//		isEmpty() → Returns True or False if the stack is Empty or not, respectively
//		size() → Returns an integer value with the count of elements in the stack

	
	
	public void push(int x) {
		//edge case to handle null exception
		if(myList == null) {
			myList.add(x);
			size++;
		}
		else {
		myList.add(0, x);
		size++;}
	}
	
	
	public int pop() {
		if(size <= 0) {
			return -1;
		}
		
	
		int temp = myList.get(0);
		myList.remove(0);
		size--;
		return temp;
	}
	

	public int top() {
		return myList.get(0);
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		    return false;
		
		    
	}
	
	public int size() {
		return size;
	}
	
public static void main(String[] args) {
         
    	
    	//stacks testing 
		part3.Stacks myStack = new part3.Stacks(); 
		myStack.push(42);
		System.out.println("Top of Stack: " + myStack.top());
		System.out.println("Size of myStack: " + myStack.size());
		int popped_value = myStack.pop();
		System.out.println("popped value is " + popped_value);
		System.out.println("Now let's see the updated size: " + myStack.size);}
	}

	
	public static class Queues{
	 private ArrayList<Integer> myList;
	 private int size;
	 
	 public Queues() {
		 size = 0;
	 }
	 
	 public void enqueue(int x) { //adding on the right side of linkedList
		 myList.add(x);
		 size++;
	 }
	 
	 public int dequeue() { //removing on the left side of LinkedList
		
		 if(size == 0) {
			 System.out.println("there is no items to be removed");
			 return -1111111;
		 }
		 int dequeued = myList.get(0);
		 myList.remove(0);
		 size--;
		 return dequeued;
		 
	 }
	 public int rear() {//end of queue would be the first element in our LinkedList
		 if(size == 0) {
			 System.out.println("THERE is no element in the queue oops");
			 return -1111111;
		 }
		 return myList.get(size - 1); 
	 }
	 
	 public int front() {
		 if (size == 0) {
			 System.out.println("There is no element in the queue oops");
			 return -11111;
		 }
		 
		 return myList.get(0);
	 }
		
	 public int size() {
		 return this.size;
	 }
	 
	 public boolean isEmpty() {
		 if(size <= 0) {
			 return true;
		 }
		 return false;
	 }
	 
	
	 public static void main(String[] args) {
		 
		 
		//Queues Testing 
		 part3.Queues myQueue = new part3.Queues();
		 myQueue.enqueue(1);
		 myQueue.enqueue(2);
		 myQueue.enqueue(3);
		 System.out.println("Size of the queue: " + myQueue.size());
		 ///should print 3 tbh
		 
		 System.out.println("Front of Queue: " + myQueue.front());
		 //should print 1
		 
		 System.out.println("Rear of Queue: " + myQueue.rear());
		 //should print 3
		 
		 int dequeuedItem = myQueue.dequeue();
		 System.out.println("We just dequeued this item: " + dequeuedItem);
		 //should print 1
		 
		 
		 
		 
	 }
	 
	}
	
	
	
	
	//testing for both Stacks and Queues Classes which will be in our main class
    public static void main(String[] args) {
         
    	
//    	//stacks testing 
//		part3.Stacks myStack = new part3.Stacks(); 
//		myStack.push(42);
//		System.out.println("Top of Stack: " + myStack.top());
//		System.out.println("Size of myStack: " + myStack.size());
//		int popped_value = myStack.pop();
//		System.out.println("popped value is " + popped_value);
//		System.out.println("Now let's see the updated size: " + myStack.size);
//		
//		//Queues Testing 
//		 part3.Queues myQueue = new part3.Queues();
//		 myQueue.enqueue(1);
//		 myQueue.enqueue(2);
//		 myQueue.enqueue(3);
//		 System.out.println("Size of the queue: " + myQueue.size());
//		 ///should print 3 tbh
//		 
//		 System.out.println("Front of Queue: " + myQueue.front());
//		 //should print 1
//		 
//		 System.out.println("Rear of Queue: " + myQueue.rear());
//		 //should print 3
//		 
//		 int dequeuedItem = myQueue.dequeue();
//		 System.out.println("We just dequeued this item: " + dequeuedItem);
//		 //should print 1
		
		
		
	}
	
	//done with stacks class
	
	
	
	
}
