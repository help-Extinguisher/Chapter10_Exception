package ch10_3_example;

class BizDividByZeroException extends Exception {
	// b가 0일때 던지는거
	
}


class BizNegativeNumberException extends Exception {
	// 음수일때 던지는거

}


class BizThousandOverException extends Exception  { 
	// 1000넘을때 던지는거
	// extends 'Exception'가 생기는데 Exception는 약간 Object 클래스같이 조상격인거임
	
	
	@Override
	public String toString() {
		return "띵띠리딩 오버라이딩된 결과값이 1000이 넘습니다~";
	}
	
	@Override
	public String getMessage() {
		return "띵디리딩 오버라이딩된 겟메시지~";
	}
	

}



class Calculator { // 아마 new 안하면 static을 해야하는걸거임
	
	// 업무적으로 a+b값은 1000을 넘으면 안됨 (에러)
	// 업무적으로 a+b값은 음수면 에러
	static int add(int a, int b) throws BizThousandOverException, BizNegativeNumberException  {
		
		int result = a+b;
		if(result > 1000) {
			// new 해서 던지기
			throw new BizThousandOverException();
		}
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
		
//		System.out.println("더하기의 값은 " + (result) + " 입니다");
		return result;
	}
	
	// a-b 값이 음수일때 에러
	static int sub (int a, int b) throws BizNegativeNumberException {
		int result = a-b;
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
//		System.out.println("빼기의 값은 " + (result) + " 입니다");
		return result;
	}
	
	static int multi (int a, int b) {
		int result = a*b;
//		System.out.println("곱하기의 값은 " + (result) + " 입니다");
		return result;
	}
	
	// b가 0이면 에러
	static int div (int a, int b) throws BizDividByZeroException {
		if (b == 0) {
			throw new BizDividByZeroException();
		}
		int result = a/b;
//		System.out.println("나누기의 값은 " + (result) + " 입니다");
		return result;
	}
	
	
}


public class ExceptionExample {
	public static void main(String[] args) {
		


		int a;
		int b; 
			
		try {
			
			System.out.println("나누기의 값은 " + (Calculator.div(1,1)) + " 입니다");
			System.out.println("더하기의 값은 " + (Calculator.add(1, 2000)) + " 입니다");
		
		} catch (BizThousandOverException e) {
//			System.out.println("결과값이 1000이 넘습니다.");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		} catch (BizNegativeNumberException e) {
			System.out.println("결과값이 음수입니다.");
//			e.printStackTrace(); // 호출 체계에 대한걸 추적해서 프린트해줌

		} catch (BizDividByZeroException e) {
			System.out.println("0으로 나눌수 없읍니다");
			// TODO Auto-generated catch block
//			e.printStackTrace();

			
			// 무족껀 아묻따 마지막에 모두 거치는 곳 (finally)
		} finally {
			System.out.println("입력값을 확인해보십씨요");
		}
//		System.out.println("빼기의 값은 " + (Calculator.sub(5,3)) + " 입니다");
//		System.out.println("곱하기의 값은 " + (Calculator.multi(1,3)) + " 입니다");
			
		
		
//		Calculator.add(Calculator.add(1, 2));
//		Calculator.sub(Calculator.sub(5,3));
//		Calculator.multi(Calculator.multi(1,3));
//		Calculator.div(Calculator.div(1,1));
		
		
		System.out.println("프로그램 종료");
		
		
		
		
	}


		

}
