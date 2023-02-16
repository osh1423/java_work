package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame extends JFrame {
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame() {
		initData();
		setlnitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		// 초기값 세팅
		labelTextX = 300;
		labelTextY = 350;

		labelText = new JLabel("Hello World");
		labelText.setSize(100, 100);
	}

	private void setlnitLayout() {
		setLayout(null);
		labelText.setLocation(labelTextX, labelTextY);
		add(labelText);
		setVisible(true);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점에 x, y 좌표값을 확인
//			int currentX = labelText.getX();
//			int currentY = labelText.getY();

				int x = labelTextX;
				int y = labelTextY;
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					labelText.setLocation(labelTextX+=50, labelTextY);
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					labelText.setLocation(labelTextX, labelTextY-=50);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					labelText.setLocation(labelTextX, labelTextY+=50);
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					labelText.setLocation(labelTextX-=50, labelTextY);
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}
}
