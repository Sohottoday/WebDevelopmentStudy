package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int rank = sc.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1 : medalColor = '금';
				break;
			case 2 : medalColor = '은';
				break;
			case 3 : medalColor = '동';
				break;
			default : medalColor = '노';
		}
		System.out.println(rank + "등은 " + medalColor + "메달 입니다.");
		sc.close();
		
	}

}
