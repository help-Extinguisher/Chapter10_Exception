package ch10_3_example;

public class Program {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 0;
//		
//		System.out.println(a/b); // 0으로 나누면 뭔가 해(값)이 많은듯. 그래서 에러남
//		
//		System.out.println("프로그램이 종료되었습니다.");
//
//		/**
//		 * 	
//		 * 
//		 * 
//		 * 
//		 * 
//		 */
	
		try {
			lib.write();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}
}
		
class lib {
	public static void write() throws InterruptedException {
		Thread.sleep(1000); // 1초동안 슬립
	}

		
}
		

