package collection;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member2>();
		// treeSet = new TreeSet<Member2>(new Member());		Comparator �� ���� ��� new Member()�� �����ؾ� �ϱ� ������ �� ����� �Ѵ�.
	}
	
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID){
		
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			if(member.getMemberID() == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "��ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member2 member : treeSet) {
			System.out.println(member);
		}
	}
	
}