package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {

		GenericPrinter<Powder> powd = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powd.setMaterial(powder);
		System.out.println(powd);
		
		GenericPrinter<Plastic> pla = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		pla.setMaterial(plastic);
		System.out.println(pla);
		
		// GenericPrinter<Water> wat = new GenericPrinter<Water>();			//Water�� Material�� ���Ե��� �����Ƿ� ��� �Ұ�
		
		powd.printing();
		pla.printing();
		
		GenericPrinter printer = new GenericPrinter();		// �Ⱦ����� �ֱ�� �ִ�.
	}

}