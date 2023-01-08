package postfix;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixtoPostfix {

	public static int prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		
		case '*':
		case '/':
			return 2;
		case'^':
			return 3;
			
		}
		return -1;
	}
	
	public static String infixTopostfix(String exp) {
		String result=new String("");
		
		Deque<Character> stack=new ArrayDeque<Character>();
		
		for(int i=0;i<exp.length();i++) {
			char c=exp.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result+=c;
			}
			
			else if(c=='(') {
				stack.push(c);
			}
			else if(c==')') {
				while(!stack.isEmpty()&& stack.peek()!='(') {
					result+=stack.peek();
					stack.pop();
				}
				
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && prec(c)<=prec(stack.peek())) {
					result+=stack.peek();
					stack.pop();
				}
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			if(stack.peek()=='(') 
				return "invalid expression";
				
	
			result+=stack.peek();
			stack.pop();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
