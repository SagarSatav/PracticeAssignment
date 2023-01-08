
public class CircQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int count;
	private int size;

	public CircQueue(int size) {

		arr=new int[size];
		front = -1;
		rear = -1;
		count = 0;
	}
	
	public boolean isFull() {
		if(count==arr.length) {
			return true;
		}else
			return false;
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void cirenqueue(int data) {
		if(isFull() == false) {
			rear=(rear+1)%arr.length;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
			count++;
			System.out.println("enqueue :"+data +" front :"+front +" rear :"+rear);
		}
		else {
			System.out.println("queue is full..!");
		}
		
	}
	
	public void cirdequeue() {
		if(isEmpty()== false) {
			int temp=arr[front];
			front=(front+1)%arr.length;
			count=count-1;
			System.out.println("dequeue :"+temp+ " front :"+front +" rear :"+rear);
			
		}
		else {
			System.out.println("queue is empty");
			
		}
	}
	
	
	
	
	
}
