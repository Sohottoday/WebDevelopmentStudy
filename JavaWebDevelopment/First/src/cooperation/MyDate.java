package cooperation;

public class MyDate {

	private int day;
	private int month;
	private int year;
	private boolean isVaild = true;
	
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);

	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
				if(day <0 || day > 31) {
					isVaild = false;				
				} else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if(day<0 || day > 30) {
					isVaild = false;
				} else {
					this.day = day;
				}
				break;
			case 2:
				if((year % 4) == 0) {
					if(day<0 || day>29) {
						isVaild = false;
					} else {
						this.day = day;
					}	
				} else {
					if(day<0 || day>28) {
						isVaild = false;
					} else {
						this.day = day;
					}
				}
				break;
			default : isVaild = false;			// �̺κп� ���� ��� ��ȿ���� �ʴٰ� �ϰų� ��� ��ȿ�ϴٰ� �ߴµ� �������� �𸣰ڴ� �Ф�
			}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month>12 || month<1) {
			isVaild = false;
		} else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

	
	public String isValid() {
		if(isVaild) {
			return "��ȿ�� ��¥�Դϴ�.";
		} else {
			return "��ȿ���� ���� ��¥�Դϴ�.";	
		}
	}
	
}