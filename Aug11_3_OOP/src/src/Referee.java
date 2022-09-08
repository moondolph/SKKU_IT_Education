
public class Referee {
	
	// �� �θ��� 
	public Me callMe() {
		System.out.println("Referee : Ya! Nawa!");
		System.out.println("Me : �� �� ���� ������");
		return new Me();
	}
	
	// ģ������ �� �䱸
	public int askFriAns(Friend f) {
		int friAns = f.writeFriAns();
		return friAns;
	}
	
	// ������ �� �䱸
	public int askMyAns(Me mm) {
		int myAns = mm.tellMyAns();
		if (myAns < 1 || myAns > 100) {
			System.out.println("��¢�� ��!!!");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMyAns(mm);
	}
	
	// ���� (���⶧����)
	public boolean judge(int answer, int myAnswer) {
		if (answer == myAnswer) {
			System.out.println(". . . !");
		} else if (answer > myAnswer) {
			System.out.println("Up !");
		} else {
			System.out.println("Down !");
		}
		return (answer == myAnswer);
	}
	
	// �õ� Ƚ��
	public void countTry(int turn) {
		System.out.println("=====================");
		System.out.printf("%d��° �õ����� ���� !\n", turn);
		System.out.println("=====================");
	}
	
	public void start(Friend f) {
		Me mm = callMe();
		int answer = askFriAns(f);
		int myAnswer = 0;
		boolean endGame = false;
		for (int turn = 1; true; turn++) {
			myAnswer = askMyAns(mm);
			endGame = judge(answer, myAnswer);
			if (endGame) {
				countTry(turn);
				break;
			}
		}
	}
	
	
	
	
	
	
	
}










