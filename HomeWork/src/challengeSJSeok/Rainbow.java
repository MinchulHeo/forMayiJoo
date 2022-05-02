package challengeSJSeok;

import java.util.Scanner;

public class Rainbow {
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		getColorRainbow(num);
		
		sc.close();
	}
	
	private void getColorRainbow(int number) {
		
		final String[] color = {"Red", "Orange","Yellow","Green","Blue","Navy","Purple"};
		
		if(number > 7)
			System.out.println("1부터 7사이의 정수가 아닙니다");
		
		System.out.println("=>" + color[number-1]);
	}

}
