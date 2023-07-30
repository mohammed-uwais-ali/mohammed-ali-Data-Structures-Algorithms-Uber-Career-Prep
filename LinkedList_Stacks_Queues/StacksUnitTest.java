
public class part3Testing{

	
	
public static void main(String[] args) {
         
    //try and catch method is needed to catch exception	
    //stacks testing 
Stacks<Integer> myStack = new Stacks<Integer>(); 
myStack.push(42);
System.out.println("Top of Stack: " + myStack.top());
System.out.println("Size of myStack: " + myStack.size());

try 
{
int popped_value = myStack.pop();
System.out.println("popped value is " + popped_value);
}
catch(Exception e) {
	System.out.println("Stack Empty"); 
}


System.out.println("Now let's see the updated size: " + myStack.size());


Queues<Integer> newQ = new Queues<Integer>();
newQ.enqueue(5);
newQ.enqueue(4);


System.out.println("Size of the queue: " + newQ.size());
///should print 3 tbh
try {
System.out.println("Front of Queue: " + newQ.front());}
catch(Exception e) {
	System.out.println("Queue Empty");

}
//should print 1
try {
System.out.println("Rear of Queue: " + newQ.rear());
//should print 3
}
catch(Exception e){
	System.out.println("Queue Empty");

}

try {
int dequeuedItem = newQ.dequeue();
System.out.println("We just dequeued this item: " + dequeuedItem);

}
catch(Exception e) {
	System.out.println("Queue Empty");
}



}

}

	
	
	
