package ch10_1_exception_class;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
		Dog dog = (Dog) animal; // ClassCastException �߻�����
		System.out.println(" dog Ÿ������ ��ȯ �Ϸ�");
		// 9���ο��� Cat ��ü�� �Ű������� �־ DogŸ������ ��ȯ�Ҽ����⶧��
		} else {
			System.out.println(" dog Ÿ���� �ƴմϴ�.");
		}
		
	}
}

