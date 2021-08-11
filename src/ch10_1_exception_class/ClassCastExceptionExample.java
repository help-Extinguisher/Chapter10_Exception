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
		Dog dog = (Dog) animal; // ClassCastException 발생가능
		System.out.println(" dog 타입으로 변환 완료");
		// 9라인에서 Cat 객체를 매개값으로 주어서 Dog타입으로 변환할수없기때문
		} else {
			System.out.println(" dog 타입이 아닙니다.");
		}
		
	}
}

