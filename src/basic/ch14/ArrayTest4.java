package basic.ch14;

public class ArrayTest4 {

	public static void main(String[] args) {

		String[] arrayStr = new String[26];

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";

		arrayStr[25] = "Y";

		System.out.println(arrayStr[4]); // --> null
		// 배열안에 요소의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력
		// 반복문 활용
		int eCount = 0;
		for (int i = 0; i < arrayStr.length; i++) {
			// 만약 null 값이 아니라면
			if(arrayStr[i] != null) {
				eCount++;
				System.out.println(arrayStr[i]);
			}
			// 횟수를 올려보자 
		}
		System.out.println("eCount " + eCount );

	} // end of main

} // end of class