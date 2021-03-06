package collection;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		Member memberPark2 = new Member(300, "Park");		// String과 달리 논리적으로 같다는 구현이 되어있지 않으면 중복으로 인한 합침이 발생하지 않는다.
		// equals와 HashCode 를 오버라이드하여 수정할 수 있다.
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		System.out.println("----------------");
		manager.removeMember(100);
		
		manager.showAllMember();
		
	}

}
