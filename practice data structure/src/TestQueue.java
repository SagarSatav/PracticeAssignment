
public class TestQueue {

	public static void main(String[] args) {
		Queue q=new Queue(3);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
//		q.dequeue();
		System.out.println("dequeue :"+q.dequeue() );
		System.out.println("dequeue :"+q.dequeue() );
		System.out.println("dequeue :"+q.dequeue() );
		System.out.println("dequeue :"+q.dequeue() );
	}

}
