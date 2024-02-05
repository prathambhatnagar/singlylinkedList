package singlyLinkedList;

public class singlyLinkedList {
	
	public Node head=null;
	public Node tail=null;
	public int size=0;

	
	public String toString() {
		
		Node traverseNode = head;
		String str = "[ ";
		while(traverseNode != null) {
			str = str+traverseNode.value;
			if(traverseNode.nextNode != null) {
				str += ", ";
				}
//			else {str +="\n";}
			traverseNode = traverseNode.nextNode;
		}
		
		return str+=" ]\n";
	}
	singlyLinkedList(){}
	
	singlyLinkedList(int value){
		createList(value);
	}
	
	  void createList(int value) {
		if (head == null) {
			Node node = new Node(value);
			node.nextNode = null;
			head =tail = node;
			size =1;
//			System.out.println("Value : "+value+" Size : "+ size );
			}
		else {
			System.out.println("List already exists");
			}
	 	}
	  
	 //	<----------------- TRAVERSE VALUE USING INDEX ----------------->
	 int valueAt(int index) {
		 if(head ==null) {
			 System.out.println("List is empty");
			 return -1;
		 }

		 else if(index>size-1 || index<0) {
			 System.out.print(" IndexOutOfBound : "+index);
			 return -1;
		 }
		 
		  else if(index == 0) {
			 return head.value;
		 }
		 
		  else if(index==size-1) {
			 return tail.value;
		 }
		 
		  else {
			 Node traverseNode =head;
			 int counter = 0 ;
			 while(traverseNode != null ) {
				 if(index == counter) {
					 return traverseNode.value;
				 }
				 counter++;
				 traverseNode = traverseNode.nextNode;
			 }
			 System.out.print("Value Not Found");
			 return -1;
		  }
	 }
	 
	 //	<----------------- REPLACE VALUE----------------->
	 
	 int indexOf(int value) {
		 if(head.value == value) {
		 	return 1;
		 }
		 else if(tail.value == value) {
			 return size-1;
		 	}
		 else {
			 Node traverseNode = head;
			 int counter = 0;
			 
			 while(traverseNode != null) {
				if(traverseNode.value == value) {
					return counter;
				 	}
				counter++;
				traverseNode = traverseNode.nextNode;
			 }
			 System.out.print("Value Not Found ;");
			 return -1;
		 }
	 }
	 
	 //	<----------------- REPLACE VALUE----------------->

	 void replace(int index, int value){
		 if (head== null) {
			 System.out.print("List is empty");
		 }
		 else if (index>size-1) {
				System.out.println("index : "+index+" IndexOutOfBound");
		 }
		 
		 else if(index == 0) {
			 head.value= value;
			 
		 }
		 
		 else if(index==size-1) {
			 tail.value= value;
		 }
		 else {
			 Node traverseNode  = head;
			 for(int  i = 0 ;i <index;i++ ) {// 
				 traverseNode= traverseNode.nextNode;
			 }			 
			 traverseNode.value = value;
			 
		 }
	 }	 
	 
	 //	<----------------- PRINT LINKEDLIST ----------------->
	 void show() {
		Node traverse = head;
		System.out.println();
		while(traverse !=null) {
			System.out.print(traverse.value +" -> "  );
			traverse  = traverse.nextNode;
		}
		
	}
	 //	----------------- ADD AT SPECIFIC INDEX OF LIST ----------------->
	 
	 void add(int index,int value) {

		 //	--------- IF LIST EMPTY CREATE LIST --------->
		
		 if(head == null){
			 createList(value);
			 return;
		 }
		
		 //	--------- ADDING ELEMENT AT END OF THE LIST --------->
		 
		 else if(index>=size){ // FUCK YOU -1
			 add(value);
			 return;

			 
		 }	

		 //	--------- ADDING ELEMENT AT THE BEGINNING OF THE LIST --------->
		 
		 if(index== 0) {
			 Node node = new Node(value);	 
			 node.nextNode = head;
			 head = node;
			 size++;
//			 System.out.println("Value : "+value+" Size : "+ size );

			 return;
		 }
		 
		 //	--------- ADDING ELEMENT IN BETWEEN THE LIST --------->
		 
		 else {
			 Node node = new Node(value);
			 Node traverseNode = head;
			 
			 for(int i = 0 ; i<index-1;i++){
				traverseNode = traverseNode.nextNode;
			 }
			 
			 node.nextNode =traverseNode.nextNode;
			 traverseNode.nextNode = node;
			 size++;
			 
//			 System.out.println("Value : "+value+" Size : "+ size );

			 return;
			 
		 }
		 
	 }
	 
	 	//	<----------------- ADD WITHOUT INDEX AT END OF LIST ----------------->
	
	void add(int value) {
		if (head == null) {
			createList(value);
		}
		
		else{
			Node node = new Node(value);
			node.nextNode = null;
			tail.nextNode = node;
			tail = node;
			size++;
//			System.out.println("Value : "+value+" Size : "+ size );
			}
		}
	

		//	<----------------- REMOVING ELEMENT FROM THE LIST ----------------->

	void remove(int index){
	
		if (head == null) {
			System.out.println("List is empty");
			}
		
		else if (index>size-1 || index<0) {
			System.out.println("index : "+index+" IndexOutOfBound");
		}

		//	<----------------- REMOVE ELEMENT FROM BEGINNING OF LIST ----------------->
		
		else if (index==0) {
			Node tempNode;
			tempNode  = head;
			head = tempNode.nextNode;
			size--;
			
		}

		//	<----------------- REMOVE ELEMENT FROM END OF LIST ----------------->
		
		else if(index>=size-1) {
			Node traverseNode = head ;
			int counter = 0;
			
			while(traverseNode != null) {
				if(counter == size-2) {					
					traverseNode.nextNode = null;
					tail = traverseNode;
					}
				counter++;
				traverseNode = traverseNode.nextNode;
				}
			size--;
			}
		//	<----------------- REMOVE ELEMENT FROM END OF LIST ----------------->
		else {
			Node traverseNode = head;
			Node tempNode;
			int counter = 0;
			
			
			while(traverseNode != null) {
				if(counter ==index-1) {
					tempNode= traverseNode.nextNode;
					traverseNode.nextNode = tempNode.nextNode;
					}
				traverseNode = traverseNode.nextNode;
				counter++;
			}
		}
	}
	
	//	<----------------- PRINT SIZE OF THE LIST ----------------->

	int getSize() {
		System.out.println("\n"+size);
		return size;
	}
	//	<----------------- PRINT SIZE OF THE LIST ----------------->

	void printAll() {
        Node traversing_node = head;
        int counter = 0;
        while (traversing_node != null) {
            System.out.println(counter++ + " " + traversing_node.value);
            traversing_node = traversing_node.nextNode;
        }
        System.out.println("size of list " + size);
    }
}