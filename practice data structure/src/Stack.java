
public class Stack {
	private int[] arr;
	private int top,size;
	

	public Stack(int size) {
	
		arr =new int[size]; 
		top=-1;
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else
		return false;
	}
	
	public boolean isfull() {
		if(top==(arr.length-1)) {
			return true;
		}
		else
				return false;
		}
	
	public void push(int data) throws Exception {
		if(isfull()==false) {
			top=top+1;
			arr[top]=data;
			System.out.println(arr[top]);
		}
		else
			throw new Exception("stack is full");
	}
	
	public int pop() throws Exception {
		if(isEmpty()==false) {
			int temp=arr[top];
			top=top-1;
			return temp;
		}
		else
			throw new Exception("stack is empty");
	}
	
	public int peek() throws Exception {
		if(isEmpty()==false) {
			int temp=arr[top];
			return temp;
		}
		else
			throw new Exception("stack is empty");
	}
	
	}
	


