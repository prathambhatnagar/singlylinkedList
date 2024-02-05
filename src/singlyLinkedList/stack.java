package singlyLinkedList;

public class stack {
	singlyLinkedList list;

	stack(){
		list = new singlyLinkedList();
	}
	
	void push(int value){
		list.add(0,value);
	}
	
	
	int pop() {
		int temp = list.head.value;
		list.remove(0);
		System.out.println(temp);
		return temp;
		
	}

	int peek() {
		if(list.head ==null) {
			System.out.print(" Stack is empty : ");
			return -1;
		}
		else {
			return list.valueAt(0);
		}
	}
	
	boolean isEmpty() {
		if(list.head ==null) {
			System.out.print(" Stack is empty : ");
			return true;
		}
		else 
			return false;
	}
	
	boolean isFull() {
		if(list.head ==null) {
			return false;
			}
		else 
			return true;
	}
}
