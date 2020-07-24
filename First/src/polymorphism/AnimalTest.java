package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �������Դϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAni = new Human();
		Animal tAni = new Tiger();
		Animal eAni = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAni);
		test.moveAnimal(tAni);
		test.moveAnimal(eAni);
		
		Human human = (Human)hAni;
		human.readBooks();   		// readBooks�� Human���� �����ϹǷ� (Human)hAni �� �ٿ�ĳ���� �� ����Ѵ�.
		
		if(hAni instanceof Human) {			// �޼��尡 �´ٸ� �̶� �ǹ� 
			Human human2 = (Human)hAni;
			human.readBooks();
		}
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAni);
		animalList.add(tAni);
		animalList.add(eAni);
		
		for(Animal animal : animalList) {
			animal.move();		// �θ� Ŭ������ animal �ȿ� move�� �����ϹǷ� ��� �����ϴ�
		}
		
		AnimalTest test2 = new AnimalTest();
		test2.testDownCasting(animalList);
		
	}
	
	public void moveAnimal(Animal animal) {			// Animal animal �� �κ��� ������, �ϳ��� �ڵ尡 �ٸ� ������ ��, ���� �޼��带 �� ������� �ڵ尡 �����
		animal.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i<list.size(); i++) {
			Animal ani = list.get(i);
			
			if(ani instanceof Human) {
				Human human = (Human)ani;
				human.readBooks();
			} else if(ani instanceof Eagle){
				Eagle eagle = (Eagle)ani;
				eagle.flying();
			} else if(ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
			} else {
				System.out.println("error");
			}
			
		}
	}

}