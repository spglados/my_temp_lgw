package swing.ch06;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiniGame1 extends JFrame{
	
	int a = 100;
	int b = 100;
	
	private JLabel jPlayer;
	
	public MiniGame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jPlayer = new JLabel("플레이어1");
		jPlayer.setSize(200, 100);
	}
	
	private void setInitLayout() {
		// 좌표 기반으로 배치관리자 변경
		// 좌표 기반일때 setLocation, setSize 위치랑 크기 설정 해야 나옴
		setLayout(null);
		add(jPlayer);
		setVisible(true);
	}
	
	public void setLocation(int x, int y) {	
		jPlayer.setLocation(a, b);	
    }
	
	private void addEventListener() {
		// jPlayer 객체에게서만 keyListener 동작을 시키고자 한다면
		// 익명 구현클래스로 KeyListener 인터페이스를 재 정의 할 수 있다
		// jPlayer.addKeyListener(this);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					b =- 10;
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				}
				
				jPlayer.setLocation(a, b);
			}
		});
		
	}
	
	// 코드 테스트
	public static void main(String[] args) {
		new MiniGame1();
	}

} // end of class
