package structure;

public class IntArrayQueue {
	
	private int[] array;
	private int front; // 큐의 시작 지점
	private int rear; // 큐의 끝 지점
	private int capacity; // 큐의 용량
	private int size; // 요소의 개수
	
	public IntArrayQueue (int capacity) {
		this.capacity = capacity;
		array = new int[this.capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	// 편의 기능 만들어 보기
	// 비었을때
	public boolean isEmpty() {
		return size == 0;
	}
	
	// 가득찼을때
	public boolean isFull() {
		return size == capacity;
	}
	
	// todo - 1 데이터 넣기
	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("큐 메모리 공간이 가득");
		} else {
			rear++;
			array[rear] = item;
			size++;
		}
	}
	
	

} // end of class
