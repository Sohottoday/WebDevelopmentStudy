package objectex;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	//재정의 override
	@Override
	public boolean equals(Object obj) {
		// object로 넘어오기 때문에 다운캐스팅 해줘야 한다.
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNum == std.studentNum);
		}
		return false; 
	}

	// hashCode override
	@Override
	public int hashCode() {
		return studentNum;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "이순신");
		
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin));	// 논리적으로 같다는 것을 증명하기 위해 재정의 해줘야 한다.
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		System.out.println(Shin.hashCode());
		
		Integer i1 = 100;
		Integer i2 = 100;
		
		System.out.println(i1.equals(i2));
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}

}
