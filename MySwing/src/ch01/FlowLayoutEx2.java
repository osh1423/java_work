package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 배치 관리자 연습 - FlowLayout
// components 수평, 수직으로 배치 해주는 녀석
public class FlowLayoutEx2 extends JFrame{
	// 1번 JButton 2개 생성
	// 배치 관리자 FlowLayout 멤버 변수로 선언
	// 화면에 Component를 그려주세요.
	
	// 배열선언
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	
	private FlowLayout flowLayout;
	public FlowLayoutEx2() {
		// 초기화 값 세팅(메서드 역할 분담)
		initData();
		setlnitLayout();
	}
	
	public void initData() {
		setTitle("컴포넌트 띠우기");
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// for문
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);
	}
	
	public void setlnitLayout(){
		setLayout(flowLayout);
		// for문
		add(button1);
		add(button2);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
	
}
