package template;

import java.util.ArrayList;

public class CarLabTest {

	public static void main(String[] args) {

		ArrayList<CarLab> carList = new ArrayList<CarLab>();
		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(CarLab car : carList) {
			car.run();
			System.out.println("------------");
		}
	}

}
