package practice;

public class WhileTest_2_p {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println("---------------------");

		boolean flag1 = true;
		boolean flag2 = true;
		int start = 1;
		int end = 10;
		int sum = 0;

		while (flag1) {
			System.out.print(start);
			if (start == end) {
				flag1 = false;
			} else {
				start++;
				System.out.print(" + ");
			} // end of if
		} // end of while

		start = 0;
		
		while (flag2) {
			if (start == end) {
				flag2 = false;
			} // end of if
			sum = sum + start;
			start++;
		} // end of while
		System.out.println(" = " + sum);
	} // end of main

} // end of class
