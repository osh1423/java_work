package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MyKeyEvent2 extends JFrame {

	private JTextArea area;

	public MyKeyEvent2() {
		initData();
		setlnitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절불가 설정 명령어
		area = new JTextArea();

	}

	public void setlnitLayout() {
		add(area);
		setVisible(true);
	}

	public void addEventListener() {
		// 익명 클래스
		// 익명 구현 클래스 !!
		// 인터페이스 + 추상 클래스를 구현 클래스로 만들 수 있다.
		KeyListener keyListener;
		// 인터페이스를 기본적으로 new 할수 없다.
		// 하지만 인터페이스를 구현클래스로 변형해서 사용 할 수 있다.
		
		area.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}


	

}
