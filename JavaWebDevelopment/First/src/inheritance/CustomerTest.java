package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer custLee = new Customer();
		custLee.setCustomerName("이순신");
		custLee.setCustomerID(10010);
		custLee.bonusPoint = 1000;
		System.out.println(custLee.showCustomerInfo());
		
		VIPCustomer custKim = new VIPCustomer();
		custKim.setCustomerName("김진우");
		custKim.setCustomerID(10020);
		custKim.bonusPoint = 10000;
		System.out.println(custKim.showCustomerInfo());
		
		custLee = custKim;		// custLee는 Customer의 상위 클래스이고 custKim 은 VIPCustomer의 하위 클래스이므로 이러한 방식이 가능하다.
		// Customer vc = new VIPCustomer();		업캐스팅
		
	}

}
