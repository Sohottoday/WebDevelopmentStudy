package classchapter;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();	//100번 불러도 똑같은 값을 반환한다.
		
		System.out.println(company1);
		System.out.println(company2);
		
		// singleton Pattern static 이 적용된 클래스
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}

}
