import java.util.Scanner;

public class TestStack {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Stack stk=new Stack(3);
	try {
		stk.push(1);
		stk.push(2);
		stk.push(3);
		System.out.println(stk.pop());
		System.out.println(stk.peek());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
