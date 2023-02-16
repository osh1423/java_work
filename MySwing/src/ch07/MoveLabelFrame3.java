package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveLabelFrame3 extends JFrame implements Moveable {
	private JLabel label;
	private int labelimagesX;
	private int labelimagesY;

	public MoveLabelFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(1_000, 1_000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가 설정
		label = new JLabel(new ImageIcon("images/image6.png"));
		label.setSize(200, 200);
	}

	private void setInitLayout() {
		setLayout(null);
		label.setLocation(300, 350);
		labelimagesX = 300;
		labelimagesY = 350;
		add(label);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
		
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}
			}
		});
	}

	@Override
	public void left() {
		int x = labelimagesX -= 50;
		int y = labelimagesY;
		if(x <= 0) {
			x = labelimagesX = 0;
		}
		label.setLocation(x, y);
	}

	@Override
	public void right() {
		int x = labelimagesX += 50;
		int y = labelimagesY;
		if(x > 800) {
			x = labelimagesX = 800;
		}
		label.setLocation(x, y);
	}

	@Override
	public void up() {
		int x = labelimagesX;
		int y = labelimagesY -= 50;
		if(y <= 0) {
			y = labelimagesY = 0;
		}
		label.setLocation(x, y);
	}

	@Override
	public void down() {
		int x = labelimagesX;
		int y = labelimagesY += 50;
		if(y >= 800) {
			y = labelimagesY = 800;
		}
		label.setLocation(x, y);
	}
}