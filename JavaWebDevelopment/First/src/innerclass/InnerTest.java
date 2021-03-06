package innerclass;


class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {		// 인스턴스 이너클래스
		int iNum = 100;
		//static int sInNum = 200;			// 인스턴스 이너클래스같은 경우에는 outclass 생성 이후에 생성이 되므로 static 변수를 안에서 사용할 수 없다.
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
	}
	
	public void usingInner() {
		inClass.inTest();		// outclass.~~ 하면 private으로 인해 사용할 속성이 몇 없으므로 사용할 수 있도록 설정해 준다.
	}
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println();
			System.out.println(sNum);
		}
		
		static void sTest() {		// static 클래스 안에서는 static 변수, static 메서드 모두 설정 가능하다.
			//System.out.println(inNum);		//static은 생성과 관계없이 부를 수 있는 메서드이므로 static 클래스 내부 변수를 사용할 수 없다.
			System.out.println();
			System.out.println(sNum);
		}
	}
}



public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}

}
