
public class Queue {
	private int[] arr;
	private int front;
	private int rear;
	private int size;

	public Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if((front==-1 )|| (front>rear)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear==(arr.length-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue(int data) {
		if(isFull()==false) {
			rear=rear+1;
			arr[rear]=data;
			if(front==-1) {
				front=0;
			}
			System.out.println("enqueue "+data+" front :"+front+" rear :"+rear);
			
		}
		else {
			System.out.println("queue is full");
		}
	}
	
	public int dequeue() {
		if(isEmpty()== false) {
		int temp=arr[front];
		front=front+1;
		return temp;
		}
		else {
			System.out.println("queue is empty");
			return -999;
		}
	}
	
	
	
	
	
	
}
