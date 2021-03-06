package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 비행중입니다.");
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
		human.readBooks();   		// readBooks는 Human에만 존재하므로 (Human)hAni 로 다운캐스팅 후 사용한다.
		
		if(hAni instanceof Human) {			// 메서드가 맞다면 이란 의미 
			Human human2 = (Human)hAni;
			human.readBooks();
		}
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAni);
		animalList.add(tAni);
		animalList.add(eAni);
		
		for(Animal animal : animalList) {
			animal.move();		// 부모 클래스인 animal 안에 move가 존재하므로 사용 가능하다
		}
		
		AnimalTest test2 = new AnimalTest();
		test2.testDownCasting(animalList);
		
	}
	
	public void moveAnimal(Animal animal) {			// Animal animal 이 부분이 다형성, 하나의 코드가 다른 실행이 됨, 각각 메서드를 다 만드려면 코드가 길어짐
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
