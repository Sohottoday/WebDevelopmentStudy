package lambda;

@FunctionalInterface		// 람다식을 위한 함수혀 인터페이스라 선언
public interface MyMaxNumber {
	int getMaxNumber(int x, int Y);			// 함수영 인터페이스는 메서드를 2개 이상 선언할 수 없다.
}
