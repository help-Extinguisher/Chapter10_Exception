package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

			


public class ExceptionCase {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력받아 나누기 하고
		// 입력받은 숫자와 나누기 결과를 출력하시오
		
		
		
		//두 정수를 사용자로부터 입력받기
		Scanner in = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요");
		double a = in.nextDouble();
		
		System.out.print("두번째 정수를 입력하세요");
		double b = in.nextDouble();
			if (b == 0) {
				System.out.println("오류 : 값은 0으로 나눌수 없습니다");
				return;
			}
		
	
		try {
			
			System.out.println("입력받은 숫자는" + (int) a + "와 " + (int) b + "이며");
			System.out.println("둘을 나눈 값은 " + a/b + "입니다.");
			
			
//		} catch (Exception e) {
//			e.printStackTrace();
			
		} catch (ArithmeticException e) { // <- 산술조건 틀릴때 나오는것임 0으로 나눈다거나
			System.out.println("오류 : 값은 0으로 나눌수 없습니다");
			
		} catch (InputMismatchException e) {
			System.out.println("오류 : 값에는 문자열이 올 수 없습니다");
		
		}
		
	}

}
