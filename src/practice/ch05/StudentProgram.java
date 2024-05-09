package practice.ch05;

public class StudentProgram {
	
	// 코드의 시작점(메인함수)
	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.name = "홍길동";
		System.out.println(student1.name);
		student2.name = "이순신";
		System.out.println(student2.name);
		
		System.out.println(student1);
		System.out.println(student2);
		
		
	}

}
