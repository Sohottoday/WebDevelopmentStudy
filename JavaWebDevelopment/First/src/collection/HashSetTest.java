package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("강감찬");
		set.add("이성계");
		set.add("이순신");
		
		System.out.println(set);		// HashSet은 순서대로 출력되지는 않고 중복값이 있다면 겹쳐진다.
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
		
		
	}

}
