package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int num1, num2, intNum;
		float result;
		String op;
		
		Scanner s = new Scanner(System.in);

		System.out.print("연산식: ");
		num1 = s.nextInt();
		op = s.next();
		num2 = s.nextInt();

		if (op.equals("+")) {
			result = Calculator.add(num1, num2);
		} 
		else if (op.equals("-")) {
			result = Calculator.sub(num1, num2);
		} 
		else if (op.equals("*")) {
			result = Calculator.mul(num1, num2);
		} 
		else if (op.equals("/")) {
			result = Calculator.div(num1, num2);
		} 
		else {
			result = 0;
		}
		
		System.out.println("결과: " + result);

		System.out.print("정수입력: ");
		intNum = s.nextInt();
		System.out.print("16진수: ");
		Calculator.hexadecimalNumber(intNum);
		
	}
}
