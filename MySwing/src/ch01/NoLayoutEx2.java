package ch01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx2 extends JFrame{
	// String direction = {};
	//JButton[] buttons = new JButton[2];
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	
	public NoLayoutEx2() {
		initDate();
		setlnitLayout();
	}

	private void initDate() {
		setTitle("좌표 연습하기");
		setSize(1_000, 1_000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button1.setSize(100, 100);
		button2 = new JButton("button2");
		button2.setSize(200, 200);
		button3 = new JButton("button3");
		button3.setSize(150, 50);
		button4 = new JButton("button4");
		button4.setSize(100, 50);
	}

	private void setlnitLayout() {
		setLayout(null);
		button1.setLocation(100, 100);
		add(button1);
		button2.setLocation(500,500);
		add(button2);
		button3.setLocation(0,0);
		add(button3);
		button4.setLocation(150,50);
		add(button4);
		setVisible(true);
	}
public static void main(String[] args) {
	new NoLayoutEx2();
}
}
