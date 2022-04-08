import java.util.*;


public class part3{
	
	private LinkedList<Integer> myList;
	private int size;
	
	public part3() {
		this.myList = myList;
		size = 0;
	}
	
//brainstorming: I am thinking of using a linkedList that prepends when ever u are adding an element 

//	Challenge: Implement the Stack class from scratch (do not use your language’s standard stack or queue library/package methods). In this challenge, your Stack will only accept Integer values. Implement the following methods:
//		push() → Pushes an integer on top of the stack
//		pop() → Removes what is on the top of the stack, and returns that value to the caller
//		top() → Looks at the top value, and returns it. Does not manipulate the stack
//		isEmpty() → Returns True or False if the stack is Empty or not, respectively
//		size() → Returns an integer value with the count of elements in the stack

	public void push(int x) {
		myList.addFirst(x);
		size++;
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
	
	
	
	//testing 
    public static void main(String[] args) {
         
		
	}
	
	
	
}
