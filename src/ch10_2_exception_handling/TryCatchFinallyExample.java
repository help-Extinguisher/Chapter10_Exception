package ch10_2_exception_handling;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}
