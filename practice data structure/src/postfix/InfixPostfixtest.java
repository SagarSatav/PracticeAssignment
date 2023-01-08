package postfix;

public class InfixPostfixtest {

	public static void main(String[] args) {
	
	InfixtoPostfix ip=new InfixtoPostfix();

	String exp="a+b*(c^d-e)^(f+g*h)-i";
	System.out.println(ip.infixTopostfix(exp));
	}

}
