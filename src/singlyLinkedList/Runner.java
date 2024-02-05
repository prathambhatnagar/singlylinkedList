package singlyLinkedList;

public class Runner {
	public static void main(String[] args) {
		singlyLinkedList list = new singlyLinkedList();
//		list.add(0,1);
//		list.add(0,2);
//		list.add(0,3);
//		list.add(0,4);
//		list.add(0,5);
//		list.printAll();
		
		
		stack  stc = new stack();
		for(int i = 0 ; i <10 ;i++){
			stc.push(i);
		}
		
		
		for(int i = 0 ; i <10 ;i++){
			list.add(stc.pop());
		}
		
		System.out.print(list);
		
	}
}
