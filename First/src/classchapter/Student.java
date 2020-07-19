package classchapter;

public class Student {		// public Ŭ������ ���ϸ��� �̸��� ���ƾ� �ϰ� �� ���Ͽ� �� �ϳ��� �� �� �ִ�.

	public static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID = serialNum;
	}
	
	public Student(int id, String name) {		// ������
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		studentID = serialNum;
	}
	
	public void showStudentInfo() {		 // return���� ���� �� void�� ����Ѵ�.
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNum() {
		int i = 0;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
}