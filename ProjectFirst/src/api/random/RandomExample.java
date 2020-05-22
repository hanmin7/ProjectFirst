package api.random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택번호
		int[]selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨번호
		int[]winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨 번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.parallelSort(selectNumber);
		Arrays.parallelSort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}// new Random(종자값) select, winning num 두 종자값에 같은값 넣으면 트루 => 당첨!
	}
}
