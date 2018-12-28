package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if(expression.equals("quit"))
			{
				break;
			}

			/*  코드를 완성 합니다 */
			String[] operation = expression.split(" ");
			int num1 = Integer.parseInt(operation[0]);
			String sign = operation[1];
			int num2 = Integer.parseInt(operation[2]);
			
			switch (sign) {
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);
				System.out.println(">> " + add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				System.out.println(">> " + sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				System.out.println(">> " + mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				System.out.println(">> " + div.calculate());
				break;

			default:
				System.out.println("연산자가 잘못되었습니다. 다시 입력하세요.");
				break;
			}
			
		}
		
		scanner.close();
	}
}
