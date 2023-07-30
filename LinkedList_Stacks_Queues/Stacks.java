import java.util.ArrayList;

public class Stacks<T>{ //T stands for 
	private ArrayList<T> myList;
	private int size;
	
	public Stacks() {
		size = 0;
		this.myList = new ArrayList<T>();
		
	}
	//last in first out 
//brainstorming: I am thinking of using a linkedList that prepends when ever u are adding an element 
   	
//getMin method I can use another LinkedList to keep track of the most minimum number
//	Challenge: Implement the Stack class from scratch (do not use your language’s standard stack or queue library/package methods). In this challenge, your Stack will only accept Integer values. Implement the following methods:
//		push() → Pushes an integer on top of the stack
//		pop() → Removes what is on the top of the stack, and returns that value to the caller
//		top() → Looks at the top value, and returns it. Does not manipulate the stack
//		isEmpty() → Returns True or False if the stack is Empty or not, respectively
//		size() → Returns an integer value with the count of elements in the stack

	
	
	public void push(T x) {
		//edge case to handle null exception
		if(myList == null) {
			myList.add(x);
			size++;
		}
		else {
		myList.add(0, x);
		size++;}
	}
	
	
	public T pop() throws Exception{
		
		
		if(size <= 0) {
			 throw new Exception("Stack empty");
		}
		
	
		T temp = myList.get(size - 1);
		myList.remove(size-1);
		size--;
		return temp;
	}
	

	public T top() {
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
	
}
