package ch10_3_example;

import java.util.Scanner;

	

public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받아 나누기 하고
		// 입력받은 숫자와 나누기 결과를 출력하시오
		
		
		
		//두 정수를 사용자로부터 입력받기
		Scanner in = new Scanner(System.in);
		
		
		try {
			System.out.println("첫번째 정수를 입력하세요");
			int a = in.nextInt();
			
			System.out.println("두번째 정수를 입력하세요");
			int b = in.nextInt();
			
			System.out.println("입력받은 숫자는" + a + "와 " + b + "이며");
			System.out.println("둘을 나눈 값은 " + (double) (a/b) + "입니다.");
		} catch (ArithmeticException e) {
			System.out.println("오류가 발생했습니다.");
		}
		
		
		
		
	}

}
