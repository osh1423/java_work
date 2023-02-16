package ex01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {

	JButton button;
	LottoRandomNumber lottoRandomNumber;
	boolean isStart = false;
	// 화면담당
	// LottoRandomNumber 클래스에 받아서 처리해보자

	public LottoFrame() {
		initData();
		setlnitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("로또");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("game start");
		lottoRandomNumber = new LottoRandomNumber();
	}

	private void setlnitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// LottoRandomNumber lottoRandomNumber; 여기에 써도 됨.
		// lottoRandomNumber = new LottoRandomNumber();
		// 그림을 그릴때 구분, 처음 버튼
		if (isStart == false) {
			g.drawString("게임을 실행해 주세요", 150, 150);
			return;
		}
		int[] getNumbers = lottoRandomNumber.createNumber();
		g.drawString(getNumbers[0] + "", 50, 150);
		g.drawString(getNumbers[1] + "", 150, 150);
		g.drawString(getNumbers[2] + "", 250, 150);
		g.drawString(getNumbers[3] + "", 350, 150);
		g.drawString(getNumbers[4] + "", 450, 150);
		g.drawString(getNumbers[5] + "", 550, 150);
	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 그림을 다시 그려라
				isStart = true;
				repaint();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
