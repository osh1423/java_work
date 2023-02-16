package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyKeyFrame extends JFrame implements KeyListener {

	private JTextArea area;
	
	public MyKeyFrame() {
	
	}
	
	public void initData() {
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		area = new JTextArea();
	}
	public void setlnitLayout() {
		add(area);
		setVisible(true);
	}
	
	public void addEventListener() {
		KeyListener keyListener;
		area.addKeyListener(this);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	// 1. implements구현처리
	// 2. 익명클래스
}
