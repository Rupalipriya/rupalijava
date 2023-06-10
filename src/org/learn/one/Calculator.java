package org.learn.one;

/*
 * Java Program to make a Simple Calculator using Switch Case.
 * m1(int a,int b,char ch) {
switch(ch)
case '+'
a+b
case -
a-b
case 
}
main(){
m1(3,6,*)
done 
 */
public class Calculator {
	void cal(int a, int b, char ch) {
		switch (ch) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		case '%':
			System.out.println(a % b);
			break;
		}

	}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.cal(2, 3, '*');
	}

}