package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex extends JFrame{

	Ex2 draw;
	class Ex2 extends JPanel{
		@Override
		public void paint(Graphics g) {
			super.paint(g);
		}
	}
	public Ex() {
		initData();
		setlnitLayout();
	}
	private void initData() {
		setTitle("연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		draw = new Ex2(); 
	}
	private void setlnitLayout() {
		add(draw);
		setVisible(true);
	}
}
