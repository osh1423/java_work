package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트들을 배치해 보자
public class NoLayoutEx1 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	public NoLayoutEx1() {
		initDate();
		setlnitLayout();
	}

	private void initDate() {
		setTitle("좌표기반 연습");
		setSize(1_000, 1_000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button1.setSize(300, 300);
		button2 = new JButton("button2");
		button2.setSize(300, 300);
		button3 = new JButton("button3");
		button3.setSize(150, 150);
		button4 = new JButton("button4");
		button4.setSize(150, 150);
	}

	private void setlnitLayout() {
		setLayout(null); // 좌표 기반으로 컴포넌트들을 배치 해야한다.
		// 좌표기반을 셋팅을 하면 각 컴포넌트에 크기를 지정해 주어야한다. 기본값은 0이다
		button1.setLocation(100, 100);
		add(button1);
		button2.setLocation(400, 400);
		add(button2);
		button3.setLocation(450, 200);
		add(button3);
		button4.setLocation(185, 450);
		add(button4);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NoLayoutEx1();
	}
}
