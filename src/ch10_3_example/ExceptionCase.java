package ch10_3_example;

import java.util.Scanner;

	

public class ExceptionCase {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹޾� ������ �ϰ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		
		
		
		//�� ������ ����ڷκ��� �Է¹ޱ�
		Scanner in = new Scanner(System.in);
		
		
		try {
			System.out.println("ù��° ������ �Է��ϼ���");
			int a = in.nextInt();
			
			System.out.println("�ι�° ������ �Է��ϼ���");
			int b = in.nextInt();
			
			System.out.println("�Է¹��� ���ڴ�" + a + "�� " + b + "�̸�");
			System.out.println("���� ���� ���� " + (double) (a/b) + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("������ �߻��߽��ϴ�.");
		}
		
		
		
		
	}

}
