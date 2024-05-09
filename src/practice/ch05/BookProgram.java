package practice.ch05;

public class BookProgram {
	
	// 코드 시작
	public static void main(String[] args) {
		
		Book bookBox1 = new Book(); // 객체 생성
		Book bookBox2 = new Book();
		
		bookBox1.title = "플러터 UI실전";
		bookBox1.author = "김근호";
		bookBox1.publishYear = 2022;
		bookBox1.totalPage = 230;
		
		System.out.println(bookBox1.title);
		System.out.println(bookBox1.author);
		System.out.println(bookBox1.publishYear);
		System.out.println(bookBox1.totalPage);
		
		

	} // end of main

} // end of class
