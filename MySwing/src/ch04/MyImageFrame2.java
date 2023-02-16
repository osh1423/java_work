package ch04;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImageFrame2 extends JFrame {

	private ImagePanel imagePanel; // 내부클래스 멤버 변수로 선언

	// 정적-내부클래스

	public MyImageFrame2() {
		initData();
		setlnitLayout();
	}

	private void initData() {
		setTitle("이미지연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setlnitLayout() {
		add(imagePanel);
		setVisible(true);
	}

	static class ImagePanel extends JPanel {
		private Image image1;
		private Image image2;
		private Image image3;
		private Image image4;

		public ImagePanel() {
			image1 = new ImageIcon("image3.png").getImage();
			image2 = new ImageIcon("image4.png").getImage();
			image3 = new ImageIcon("image5.png").getImage();
			image4 = new ImageIcon("image6.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image1, 100, 100, 100, 100, null);
			g.drawImage(image2, 300, 300, 100, 100, null);
			g.drawImage(image3, 100, 300, 100, 100, null);
			g.drawImage(image4, 300, 100, 100, 100, null);
			
		}

	} // end of inner class
} // end of outer class
