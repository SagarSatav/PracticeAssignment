
public class TestCirQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircQueue cq=new CircQueue(3);
		cq.cirenqueue(10);
		cq.cirenqueue(20);
		cq.cirenqueue(30);
//		cq.cirenqueue(40);
		//cq.cirenqueue(50);
		cq.cirdequeue();
		cq.cirdequeue();
//		cq.cirdequeue();
//		cq.cirdequeue();
		cq.cirenqueue(40);
		cq.cirenqueue(50);
		cq.cirdequeue();
		cq.cirdequeue();
	}

}
