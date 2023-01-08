import java.util.Stack;



public class Linklistpr {
		private Node head;

		public Node getHead() {
			return head;
		}

		public void setHead(Node head) {
			this.head = head;
		}

		public Linklistpr() {
			head=null;
		}
		
		
		@SuppressWarnings("unused")
		public boolean add(int data) {
			Node newNode=new Node(data);
			
			if(newNode==null) {
				return false;
			}
			//first position
			if(head==null) {
				head=newNode;
				return true;
				
			}
			Node last=head;
			while(last.getNext()!=null) {
				last=last.getNext();
			}
			last.setNext(newNode);
			return true;
			
		}
		 public void display() {
			 Node last=head;
			 while(last!=null) {
				 System.out.print(last.getData()+" ");
				 last=last.getNext();
			 }
			 System.out.println();
		 }
		
		 public boolean add(int data,int position) {
			 Node newNode=new Node(data);
			 if(position<=0 || head==null && position>1) {
				 return false;
			 }
			 if(newNode==null) {
				return false; 
			 }
		
			 if(position==1) {
				 newNode.setNext(head);
				 head=newNode;
				 return true;
			 }
			  Node prev=head;
			  for(int i=1;i<position-1;i++) {
				 prev=prev.getNext();
				  if(prev==null) {
					  return false;
				  }
			  }
			  newNode.setNext(prev.getNext());
			  prev.setNext(newNode);
			  return true;
		
		 }	
		 
		 public boolean remove(int position) { //remove by position
			 if(position<=0 || head==null) {
				 return false;
			 }
			 if(position==1) {
				 head=head.getNext();
				 return true;
			 }
			 Node prev=head;
			 for(int i=1;i<position-1;i++) {
				 prev=prev.getNext();
				 if(prev.getNext()==null) {
					 return false;
				 }
				
			 }
			 Node del=prev.getNext();
			 prev.setNext(del.getNext());
			 return true;
		 }
		 
		 public boolean remove1(int data) {//remove by value
			 if(head==null) {
				 return false;
			 }
			 if(head.getData()==data) {
				 head=head.getNext();
				 return true;
			 }
			 Node prev=head; Node del=head;
			 while(del.getData()!=data) {
				 prev=del;
				 del=del.getNext();
				 if(del==null) {
					 return false;
				 }
				
			 }
			 prev.setNext(del.getNext());
			 return true;
		 }
		 
		 public void reverse() {
			 if(head==null || head.getNext()==null) {
				 return ;
			 }
			 Node n1=head; Node n2=head.getNext(); Node n3;
			 while(n2!=null){
			 n3=n2.getNext();
			 n2.setNext(n1);
			 n1=n2;
			 n2=n3;
		 }
		 head.setNext(null);;
		 head=n1;
		 }
		 
	 
		 
		 public boolean palimdrome(Node head) {
			 Stack<Integer>mystack=new Stack<Integer>();
			 Node temp=head;
			 boolean status=false;
			 while(temp!=null) {
				 mystack.push(temp.getData());
				 temp=temp.getNext();
			 }
			 temp=head;
			 while(temp!=null) {
				 int ele=mystack.pop();
				 if(temp.getData()==ele) {
					 status=true;
					 temp=temp.getNext();
				 }else {
					 status=false;
					 break;
				 }
			 }
			 return status;
		 }
		 
		 
		 
		 
		 
		 
		 	
}
