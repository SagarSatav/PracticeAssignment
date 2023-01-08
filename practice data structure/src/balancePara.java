import java.util.ArrayDeque;
import java.util.Deque;

public class balancePara {

	public static boolean balance(String exp) {
		Deque<Character> stack=new ArrayDeque<Character>();
		 
		for(int i=0;i<exp.length();i++) {
			char x=exp.charAt(i);
			if(x=='(' ||x=='{'||x=='[') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch(x) {
			case ')':
				check=stack.pop();
				if(check=='{' ||  check=='[') {
					return false;
				}
					break;
				case ']':
					check=stack.pop();
					if(check=='(' ||  check=='{') {
						return false;
					}
					break;
					case '}':
						check=stack.pop();
						if(check=='(' ||  check=='[') {
							return false;
						}
						break;
				}
			}
		return (stack.isEmpty());
		}
	
	public static void main(String[] args) {
		String expr = "(()[{}]})";
		if(balancePara.balance(expr)) {
			System.out.println("balance");
		}else {
			System.out.println("unbalance");
		}
	}
	}
