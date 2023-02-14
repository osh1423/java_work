//package ch01;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class NoLayoutEx2 extends JFrame {
//
//	JButton[] buttons = new JButton[4];
//
////	private JButton button1;
////	private JButton button2;
////	private JButton button3;
////	private JButton button4;
//
//	public NoLayoutEx2() {
//		initDate();
//		setlnitLayout();
//	}
//
//	private void initDate() {
//		setTitle("좌표 연습하기");
//		setSize(1_000, 1_000);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton("buttons" + i);
//			buttons[i].setSize(150, 100);
//		}
//
//	}
//
//	private void setlnitLayout() {
//		setLayout(null);
//		for (int i = 0; i<buttons.length; i++) {
//			
//		}
//		button1.setLocation(0, 0);
//		add(button1);
//		button2.setLocation(150,100);
//		add(button2);
//		button3.setLocation(300,200);
//		add(button3);
//		button4.setLocation(450,300);
//		add(button4);
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		new NoLayoutEx2();
//	}
//}
