package ch10_3_example;

public class Program {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 0;
//		
//		System.out.println(a/b); // 0���� ������ ���� ��(��)�� ������. �׷��� ������
//		
//		System.out.println("���α׷��� ����Ǿ����ϴ�.");
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
		
		System.out.println("���α׷� ����");
		
	}
}
		
class lib {
	public static void write() throws InterruptedException {
		Thread.sleep(1000); // 1�ʵ��� ����
	}

		
}
		

