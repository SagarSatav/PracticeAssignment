
public class TestLINK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linklistpr li=new Linklistpr();
		li.add(10);
		li.display();
		li.add(20);
		li.display();
		li.add(10);
		li.display();
//		li.add(30);
//		li.display();
		li.add(40, 1);
		li.display();
//		li.add(50, 3);
//		li.display();
//		li.remove(2);
//		li.display();
//		li.remove(3);
//		li.display();
//		li.remove1(50);
//		li.display();
//		li.remove1(40);
//		li.display();
		li.reverse();
		li.display();

		if(li.palimdrome(li.getHead())) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
