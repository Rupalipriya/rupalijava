package org.learn.one;

public class Calculator {
	char opertaor ( '+','-','*','/');
	void c1(int num1, int num2 ) {
	
	char operator;
	
	switch('c')
    {
        case '+':
        	operator=(num1+num2);
        	System.out.println("addition");

            break;

        case '-':


            break;

        case '*':


            break;

        case '/':


            break;

        /* If user enters any other operator or char apart from
         * +, -, * and /, then display an error message to user
         * 
         */
        default:
            System.out.printf("You have entered wrong operator");
            return;
    }

    System.out.println(num1+" "+operator+" "+num2+": "+output);
}
}

	public static void main(String[] args) {
		
	}

}
