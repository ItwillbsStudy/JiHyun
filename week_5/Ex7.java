package week_5;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * <공 던지기>
		 * 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 
		 * 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 
		 * 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 
		 * 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 제한사항
		 * 2 < numbers의 길이 < 100
		 * 0 < k < 1,000
		 * numbers의 첫 번째와 마지막 번호는 실제로 바로 옆에 있습니다.
		 * numbers는 1부터 시작하며 번호는 순서대로 올라갑니다.
		 * 
		 * 입출력 예
		 * numbers				k	result
		 * [1, 2, 3, 4]			2	3
		 * [1, 2, 3, 4, 5, 6]	5	3
		 * [1, 2, 3]			3	2
		 * 
		 * */
		
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int k = 5;
		int answer = 0;
		
		int[] cloneNumbers = new int[100];
		int index = 0;
		for(int i=0; i<cloneNumbers.length; i++) {
			if(i % numbers.length == 0) {
				index=0;
			}

			cloneNumbers[i] = numbers[index++];

		}

		for(int i=0; i<k; i++) {
			answer = cloneNumbers[i*2];
			break;
		}

		System.out.println(answer);

		
	}	// 메인메서드 끝
	
	public int solution(int[] numbers, int k) {
		int answer = 0;
		return answer;
	}

}	// 클래스 끝
