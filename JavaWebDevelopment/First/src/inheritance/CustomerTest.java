package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer custLee = new Customer();
		custLee.setCustomerName("�̼���");
		custLee.setCustomerID(10010);
		custLee.bonusPoint = 1000;
		System.out.println(custLee.showCustomerInfo());
		
		VIPCustomer custKim = new VIPCustomer();
		custKim.setCustomerName("������");
		custKim.setCustomerID(10020);
		custKim.bonusPoint = 10000;
		System.out.println(custKim.showCustomerInfo());
		
		custLee = custKim;		// custLee�� Customer�� ���� Ŭ�����̰� custKim �� VIPCustomer�� ���� Ŭ�����̹Ƿ� �̷��� ����� �����ϴ�.
		// Customer vc = new VIPCustomer();		��ĳ����
		
	}

}