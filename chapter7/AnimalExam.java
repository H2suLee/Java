package chapter7;

public class AnimalExam {

	public static void main(String[] args) {
		Animal animal = new Dog(); // 자동 타입 변환
		animal.breathe();
		animal.sound(); // 재정의 메소드 호출
		Animal animal2 = new Cat(); // 자동 타입 변환
		animal2.sound(); // 재정의 메소드 호출
		animal2.breathe();
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(animal);
		
		

	}

	public static void animalSound(Animal animal) {
		animal.sound(); // 재정의된 메소드 호출

	}
}
