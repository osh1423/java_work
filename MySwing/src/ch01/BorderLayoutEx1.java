package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx1 extends JFrame{
	// BorderLayout <-- 컴포턴트들을 동 서 남 북 센터
	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");
	
	public BorderLayoutEx1() {
		initDate();
		setlnitLayout();
	}
	private void initDate() {
		setTitle("borderlayout 연습");
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void setlnitLayout() {
		// setLayout(new BorderLayout);
		// borderLayout, 매개 변수값 하나를 더 추가 시킬 수 있다. (방향 지정 가능)
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		setVisible(true);
	}
	// 코드테스트
	public static void main(String[] args) {
		new BorderLayoutEx1();
	}
}
