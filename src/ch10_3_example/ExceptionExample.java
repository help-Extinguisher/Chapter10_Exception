package ch10_3_example;

class BizDividByZeroException extends Exception {
	// b�� 0�϶� �����°�
	
}


class BizNegativeNumberException extends Exception {
	// �����϶� �����°�

}


class BizThousandOverException extends Exception  { 
	// 1000������ �����°�
	// extends 'Exception'�� ����µ� Exception�� �ణ Object Ŭ�������� ������ΰ���
	
	
	@Override
	public String toString() {
		return "��츮�� �������̵��� ������� 1000�� �ѽ��ϴ�~";
	}
	
	@Override
	public String getMessage() {
		return "��𸮵� �������̵��� �ٸ޽���~";
	}
	

}



class Calculator { // �Ƹ� new ���ϸ� static�� �ؾ��ϴ°ɰ���
	
	// ���������� a+b���� 1000�� ������ �ȵ� (����)
	// ���������� a+b���� ������ ����
	static int add(int a, int b) throws BizThousandOverException, BizNegativeNumberException  {
		
		int result = a+b;
		if(result > 1000) {
			// new �ؼ� ������
			throw new BizThousandOverException();
		}
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
		
//		System.out.println("���ϱ��� ���� " + (result) + " �Դϴ�");
		return result;
	}
	
	// a-b ���� �����϶� ����
	static int sub (int a, int b) throws BizNegativeNumberException {
		int result = a-b;
		if (result < 0) {
			throw new BizNegativeNumberException();
		}
//		System.out.println("������ ���� " + (result) + " �Դϴ�");
		return result;
	}
	
	static int multi (int a, int b) {
		int result = a*b;
//		System.out.println("���ϱ��� ���� " + (result) + " �Դϴ�");
		return result;
	}
	
	// b�� 0�̸� ����
	static int div (int a, int b) throws BizDividByZeroException {
		if (b == 0) {
			throw new BizDividByZeroException();
		}
		int result = a/b;
//		System.out.println("�������� ���� " + (result) + " �Դϴ�");
		return result;
	}
	
	
}


public class ExceptionExample {
	public static void main(String[] args) {
		


		int a;
		int b; 
			
		try {
			
			System.out.println("�������� ���� " + (Calculator.div(1,1)) + " �Դϴ�");
			System.out.println("���ϱ��� ���� " + (Calculator.add(1, 2000)) + " �Դϴ�");
		
		} catch (BizThousandOverException e) {
//			System.out.println("������� 1000�� �ѽ��ϴ�.");
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			
		} catch (BizNegativeNumberException e) {
			System.out.println("������� �����Դϴ�.");
//			e.printStackTrace(); // ȣ�� ü�迡 ���Ѱ� �����ؼ� ����Ʈ����

		} catch (BizDividByZeroException e) {
			System.out.println("0���� ������ �����ϴ�");
			// TODO Auto-generated catch block
//			e.printStackTrace();

			
			// ������ �ƹ��� �������� ��� ��ġ�� �� (finally)
		} finally {
			System.out.println("�Է°��� Ȯ���غ��ʾ���");
		}
//		System.out.println("������ ���� " + (Calculator.sub(5,3)) + " �Դϴ�");
//		System.out.println("���ϱ��� ���� " + (Calculator.multi(1,3)) + " �Դϴ�");
			
		
		
//		Calculator.add(Calculator.add(1, 2));
//		Calculator.sub(Calculator.sub(5,3));
//		Calculator.multi(Calculator.multi(1,3));
//		Calculator.div(Calculator.div(1,1));
		
		
		System.out.println("���α׷� ����");
		
		
		
		
	}


		

}
