package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

			


public class ExceptionCase {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է¹޾� ������ �ϰ�
		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�
		
		
		
		//�� ������ ����ڷκ��� �Է¹ޱ�
		Scanner in = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ���");
		double a = in.nextDouble();
		
		System.out.print("�ι�° ������ �Է��ϼ���");
		double b = in.nextDouble();
			if (b == 0) {
				System.out.println("���� : ���� 0���� ������ �����ϴ�");
				return;
			}
		
	
		try {
			
			System.out.println("�Է¹��� ���ڴ�" + (int) a + "�� " + (int) b + "�̸�");
			System.out.println("���� ���� ���� " + a/b + "�Դϴ�.");
			
			
//		} catch (Exception e) {
//			e.printStackTrace();
			
		} catch (ArithmeticException e) { // <- ������� Ʋ���� �����°��� 0���� �����ٰų�
			System.out.println("���� : ���� 0���� ������ �����ϴ�");
			
		} catch (InputMismatchException e) {
			System.out.println("���� : ������ ���ڿ��� �� �� �����ϴ�");
		
		}
		
	}

}
