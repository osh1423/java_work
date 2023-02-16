package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame2 extends JFrame implements Moveable {
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame2() {
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
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});
	}

	@Override
	public void right() {
		int x = labelTextX += 50;
		int y = labelTextY;
	
		
	}

	@Override
	public void left() {
		int x = labelTextX -= 50;
		int y = labelTextY;
		
	}

	@Override
	public void up() {
		int x = labelTextX ;
		int y = labelTextY+= 50;
		
	}

	@Override
	public void down() {
		int x = labelTextX ;
		int y = labelTextY-= 50;
		
	}
}
