package ch06;

import java.awt.BorderLayout;
import java.awt.Color;import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange2 extends JFrame implements ActionListener {

	private JPanel panel1;
	private JPanel panel2;
	private FlowLayout flowLayout;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public ColorChange2() {
		initData();
		setlnitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		panel2 = new JPanel();
		
		button1 = new JButton("click1");
		button2 = new JButton("click2");
		button3 = new JButton("click3");
		button4 = new JButton("click4");
		button5 = new JButton("click5");
	}

	private void setlnitLayout() {
		// Frame -> borderLayout
		add(panel1,BorderLayout.CENTER);
		add(panel2,BorderLayout.SOUTH);
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panel2.setBackground(Color.yellow);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		setVisible(true);
	}

	private void addEventListener() {
		// this -> ColorChange --> ActionListener 타입으로 바라볼 수 있다.
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		
	}

	// 테스트 코드
	public static void main(String[] args) {
		new ColorChange2();
	} // end of main

	// 약속되어진 메서드
	// 이벤트가 일어나면 운영체제가 actionPerformed 메서드를 호출 시켜준다.
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() --> Object
		// 다운캐스팅 버튼으로 코드 작성
		JButton targetButton = (JButton) e.getSource();
		// targetButton.setText("눌러진버튼입니다.");
		// System.out.println(targetButton.getText());

//		System.out.println(e.getSource());
//		if(e.getSource() == this.button1) {
//			panel.setBackground(Color.gray);
//		}else {
//			panel.setBackground(Color.yellow);
//		}

		// 문제 1 문자열을 비교해서 색상 변경 시키는 코드를 작성해 주세요.
		if (targetButton.getText().equals(this.button1.getText())){
			panel2.setBackground(Color.gray);
		} else if(targetButton.getText().equals(this.button2.getText())){
			panel2.setBackground(Color.yellow);
		} else if(targetButton.getText().equals(this.button3.getText())) {
			panel2.setBackground(Color.blue);
		}else if(targetButton.getText().equals(this.button4.getText())) {
			panel2.setBackground(Color.BLACK);
		}else {
			panel2.setBackground(Color.orange);
		}
	}
} // end of class
