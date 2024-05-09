package practice;

import java.util.Scanner;

public class Operation8_p {

	public static void main(String[] args) {

		System.out.println(" 입력 받은 두 수 중에 큰 수를 출력하세요 ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(" x의 받은 값은 : " + x );
		int y = sc.nextInt();
		System.out.println(" y 의 받은 값은 : " + y );
		
		System.out.println("--------------");
		
		int max  = x > y ? x : y;
		
		System.out.println(" 두 수 중에 큰 수는 " + max + " 입니다. ");
		
		sc.close();
		
		
	}

}
