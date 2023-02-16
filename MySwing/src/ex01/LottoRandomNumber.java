package ex01;

import java.util.Arrays;
import java.util.Random;

// 기능구현
// 랜덤번호 발생하는 클래스 1~45
// get,set
// 6개 번호를 리턴하는 기능, 정렬까지


public class LottoRandomNumber {
	final int LOTTO_NUMBER_SIXE = 6;
	// 6개 난수 발생 배열 리턴기능
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIXE];
		Random random = new Random();
		for(int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45)+1;
			// 중복검증
			// i = 0 --> inner for x -- > i = 0 
			// 
			// 두번째 for 문 수행시 10 , 20
			// j == 0 , i == 1 --> 1번 for실행
			// lottoWinNum[0] -> 10
			// lottoWinNum[1] -> 20
			for(int j = 0; j < i; j++) {
				// 현재 i = 1, 현재 j = 0
				// lottoWinNum[1] == 20
				// lottoWinNum[0] == 10
				if(lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); // 오름차순
		
		return lottoWinNum;
	}

}
