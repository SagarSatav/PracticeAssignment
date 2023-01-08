package postfix;

public class postTest {
	 public static void main(String[] args)
	   {
	       String exp = "a+b*(c^d-e)^(f+g*h)-i";
	      Test t=new Test();
	         // Function call
	     //  System.out.println(infixToPostfix(exp));
	      System.out.println(t.infixToPostfix(exp));
	   }

}
//abcd^e-fgh*+^*+i-