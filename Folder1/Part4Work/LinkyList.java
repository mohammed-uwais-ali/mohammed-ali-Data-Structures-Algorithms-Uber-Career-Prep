package Part4Work;
public class LinkyList {
	public Node head;
//	public Node tail; //would need a tail for a palindrome
	public int size;

	public LinkyList() {
		this.head = null;
		this.size = 0;
	}

	// using Node Class to implement LinkedList
	static class Node {
		int data;
		Node next;

		public Node(int dataGiven) {
			this.data = dataGiven;
		}

		// going to use this method for printList
		public String toString() {
			return this.data + " ";
		}
	}

	public void push(Node newNode) {

		if (head == null) { // initially setting up the linkedList
			head = newNode;
			head.next = null; // nothing next
			size++;
		} else { // i i i i
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			} // we stop when we are at an element that has it's next one as null
			currentNode.next = newNode; // what was null becomes the newNode we pushed
			size++;
		}

	}

	public int pop() throws Exception {
		if (head == null) {
			throw new Exception("LinkedList is empty"); // need try and catch block
		} else {
			Node currentNode = head;
			while (currentNode.next.next != null) { // i i i stopping at the node before the end node
				currentNode = currentNode.next;
			}

			Node poppedOne = currentNode.next; // just store
			currentNode.next = null; // removed the last element from LinkedList
			size--;
			return poppedOne.data;
		}

	}

	public void insert(Integer index, Node nodeAdded) throws Exception {// inserting at a particular index
		if(index > size || index < 0){
			throw new Exception("Index out of bound");
		}
		else {
			if(size == 0) {
				head = nodeAdded;
			}
			else {
				int i = 0;
				Node previousNode = head;
				while (i != index - 1) {
					previousNode = previousNode.next;
					i++;
				}
				if(index == size) {
					previousNode.next = nodeAdded;
				}
				else {
					Node nextNode = previousNode.next; // a --> c
					previousNode.next = nodeAdded;
					nodeAdded.next = nextNode; //a --> b --> c new insertion adjusting next pointers
					
				}
			}
		}
	}

	public void remove(Integer index) throws Exception{//removing a single node at the index location
		if(index >= size || size == 0 || index < 0) {
			throw new Exception("Index out of bound");
		}
		else {
			if(size == 1) { //assumes that we already have an index at 0
				head = null;
				size--;
				
			}
			else {
			int i = 0;
			Node previousNode = head;
			while (i != index - 1) {
				previousNode = previousNode.next;
				i++;
			}
            Node NodeNext = previousNode.next.next;
            previousNode.next = NodeNext; //done
            size--;
	        }}
		}

	public Node elementAt(Integer index) throws Exception {
		if (index >= size || size == 0 || index < 0) {
			throw new Exception("Index out of bound");
		} else {
			if (size == 1) { // assumes that we already have an index at 0
				return head;
			}
			int i = 0;
			Node currentNode = head;
			while (i != index) {
				currentNode = currentNode.next;
				i++;
			}
			return currentNode;

		}
	}

	public int size() {
		return size;
	}

	public void printList() {
		Node currentNode = head;
		if (size == 0) {
			System.out.print("null");

		}
		if (size == 1) {
			System.out.print(head + "-> null");
		}

		while (currentNode != null) {
			System.out.print(currentNode + "-> ");
			currentNode = currentNode.next;
		}
		System.out.print("null");

	}

	public static void main(String[] args) {

	}

//	public void insert(int index, Node newNode) {
//		if(index >= size) {
//			//do nothing
//		}
//		
//	}
//	
//	public void remove(int index) {
//		
//	}
//	
//	public Node elementAt(int index) {
//		//traversing through the linkedList by starting from head then using a counter
//		
//	}
//
//    public int size() {
//    	return size;
//    }
//    
//    public void printList() {
//    	
//    }
//    
//    public boolean isPalindrome() {
//    	
//    	
//  
//    	return true;
//    }

}
