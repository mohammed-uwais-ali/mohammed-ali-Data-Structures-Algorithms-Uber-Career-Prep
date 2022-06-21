import java.util.ArrayList;

public class Queues <T>{
	 private ArrayList<T> myList;
	 private int size;
	 
	 public Queues(){
		 size = 0;
		 myList = new ArrayList<T>();
		 
		 
	 } 
	 //iiii first in first out
	 public void enqueue(T temp) { //adding on the right side of linkedList
		 myList.add(temp);
		 size++;
	 }
	 
	 public T dequeue() throws Exception{ //removing on the left side of LinkedList
		
		 if(size == 0) {
			 throw new Exception("Stack empty");
		 }
		 T dequeued = myList.get(0);
		 myList.remove(0);
		 size--;
		 return dequeued;
		 
	 }
	 public T rear() throws Exception{//end of queue would be the last element in our LinkedList
		 if(size == 0) {
			 throw new Exception("Stack empty");
		 }
		 return myList.get(size - 1); 
	 }
	 
	 public T front() throws Exception{
		 if (size == 0) {
			 throw new Exception("Stack empty");
		 }
		 
		 return myList.get(0); //front of the Queue
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
	 
}