import java.util.Scanner;

public class Judge {

	// 나 부르기
	public Me callMe() {
		System.out.println("심판: 이리 오세요 '나'님 ");
		System.out.println("나: 예ㅋㅋ 왔습니다.");
		return new Me();
	}

	// 친구에게 답 요구
	public int askFriendAns(Friend f) {
		System.out.println("심판: '친구'님은 번호(1~100) 1개 골라서 종이로 제출하세요");
		int friAns = f.answer();
		return friAns;
	}

	// 나에게 답 요구
	public int askMeAns(Me mm) {

		System.out.println("심판: '나'님 답 말하세요  ");
		int myAns = mm.answer();
		if (myAns < 1 || myAns > 100) {
			System.out.println("꾸짖을 갈!!!");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMeAns(mm);

	}

	// 판정(맞출때까지)
	public boolean judge(int answer, int myAnswer) {

		Scanner k = new Scanner(System.in);
		int trial = 0;

		while (true) {
			trial = trial + 1;
			if (answer == myAnswer) {
				System.out.printf("%d번째: 성공 !!\n", trial);
				break;
			} else if (answer > myAnswer) {
				System.out.printf("%d번째: UP !!\n", trial);
				System.out.print("\n심판: 틀렸어요 다시 말하세요\n");
				System.out.print("답 : ");
				myAnswer = k.nextInt();
			} else {
				System.out.printf("%d번째: down!!\n", trial);
				System.out.print("\n심판: 틀렸어요 다시 말하세요\n");
				System.out.print("답 : ");
				myAnswer = k.nextInt();
			}
		}
		System.out.printf("%d번째 시도만에 정답 !\n", trial);
		return (answer == myAnswer);
	}

	// 시도 횟수
	public void countTry(int turn) {
		System.out.println("=======================");
System.out.println("참 잘해썽요!!!");		
		System.out.println("=======================");
	}

	public void start(Friend f) {
		Me mm = callMe();
		int answer = askFriendAns(f);
		int myAnswer = 0;
		boolean endGame = false;
		for (int turn = 1; true; turn++) {
			myAnswer = askMeAns(mm);
			endGame = judge(answer, myAnswer);
			if (endGame) {
				countTry(turn);
				break;

			}
		}

	}

}
