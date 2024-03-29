package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame extends JFrame implements ActionListener {
	// 이벤트 리스너에 대한 개념을 알자 
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	public ColorChangeFrame() {
		initData();
		setInitLayut();
		addEventListener();
	}
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		button3 = new JButton("click 3");
	}
	private void setInitLayut() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);
	}
	private void addEventListener() {
		// ColorChangeFrame은 다형성이 적용되어
		// ActionListener 타입으로도 바라 볼 수 있다.
		// 이벤트 리스너 등록
		button1.addActionListener(this);
		
		button2.addActionListener(this);
		
		button3.addActionListener(this);
	}
	// 코드테스트
	public static void main(String[] args) {
		new ColorChangeFrame();
	}
	// actionPerformed 호출 되어짐
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 메소드 호출 됨");
		System.out.println(e.toString());
		this.setBackground(Color.blue);
	}  
} //end of class