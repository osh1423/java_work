package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 멤버 변수를 선언할 수 잇는가
	// 배열을 활용할 수 있는가
	// 생성자 +메서드 호출
	// for 문 활용할수 있는가
	// GUI 프로그램익숙해지기

	private JButton[] button = new JButton[8];

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;
//	private JButton button6;
//	private JButton button7;
//	private JButton button8;

	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		// 초기화 값 세팅(메서드 역할 분담)
		initData();
		setlnitLayout();
	}

	public void initData() {
		setTitle("컴포넌트 띠우기");
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for문
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼" + i);
		}
//		button1 = new JButton("버튼1");
//		button2 = new JButton("버튼2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);
	}

	public void setlnitLayout() {
		setLayout(flowLayout);
		// for문
		for(int i =0; i< button.length;i++) {
			add(button[i]);
		}
//		add(button1);
//		add(button2);
	}

	public static void main(String[] args) {
		new FlowLayoutEx3();
	}

}
