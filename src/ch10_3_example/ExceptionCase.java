package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

	

public class ExceptionCase {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹޾� ������ �ϰ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		
		
		
		//�� ������ ����ڷκ��� �Է¹ޱ�
		Scanner in = new Scanner(System.in);
		
		
		try {
			System.out.println("ù��° ������ �Է��ϼ���");
			double a = in.nextInt();
			
			System.out.println("�ι�° ������ �Է��ϼ���");
			double b = in.nextInt();
			
			System.out.println("�Է¹��� ���ڴ�" + (int) a + "�� " + (int) b + "�̸�");
			System.out.println("���� ���� ���� " + (double) (a/b) + "�Դϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("���� : ���� 0���� ������ �����ϴ�");
		} catch (InputMismatchException e) {
			System.out.println("���� : ������ ���ڿ��� �� �� �����ϴ�");

		
		
		}
		
	}

}
