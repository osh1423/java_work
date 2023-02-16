package ch09;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	
	JButton button;
	// 화면담당
	// LottoRandomNumber 클래스에 받아서 처리해보자
	
	public LottoFrame() {
		initData();
		setlnitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("로또");
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("로또 시작");
	}
	private void setlnitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);
	}
	private void addEventListener() {
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작");
		//((LottoRandomNumber)LottoFrame.getLottoNumber();
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Font f = new Font("궁서체", Font.BOLD,20);
		g.setFont(f);

		
	}
	
}
