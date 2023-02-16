package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

	// 내부 클래스를 활용해서
	// JPanel 를 상속받고 paint 메서드로 집 그림을 그려주세요.
	// 카페에 코드 결과사진 올리세요.
	class MyDrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			// 집
			g.drawLine(200, 400, 400, 200);
			g.drawLine(400, 200, 600, 400);
			g.drawRect(200, 400, 400, 300);
			// 땅긋기
			g.drawLine(0, 700, 800, 700);
			// 눈사람
			g.drawOval(100, 600, 45, 50);
			g.drawOval(100, 650, 60, 50);
			g.drawLine(80, 630, 110, 660);
			g.drawLine(150, 660, 180, 630);
			// 문
			g.drawRect(300, 600, 100, 100);
			g.drawOval(370, 650, 20, 20);
			// 눈
			g.drawString(" ✤", 200, 200);
			g.drawString(" ✤", 300, 200);
			g.drawString(" ✤", 100, 100);
			g.drawString(" ✤", 150, 500);
			g.drawString(" ✤", 600, 200);
			g.drawString(" ✤", 650, 500);
			g.drawString(" ✤", 300, 150);
			g.drawString(" ✤", 500, 160);
			g.drawString(" ✤", 700, 160);

		}
	}

	public MyFrame2() {
		initData();
		setlnitLayout();
	}

	private void initData() {
		setTitle("집그리기");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setlnitLayout() {
		add(drawPanel);
		setVisible(true);
	}
}
