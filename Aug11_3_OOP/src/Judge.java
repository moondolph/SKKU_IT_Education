import java.util.Scanner;

public class Judge {

	// �� �θ���
	public Me callMe() {
		System.out.println("����: �̸� ������ '��'�� ");
		System.out.println("��: ������ �Խ��ϴ�.");
		return new Me();
	}

	// ģ������ �� �䱸
	public int askFriendAns(Friend f) {
		System.out.println("����: 'ģ��'���� ��ȣ(1~100) 1�� ��� ���̷� �����ϼ���");
		int friAns = f.answer();
		return friAns;
	}

	// ������ �� �䱸
	public int askMeAns(Me mm) {

		System.out.println("����: '��'�� �� ���ϼ���  ");
		int myAns = mm.answer();
		if (myAns < 1 || myAns > 100) {
			System.out.println("��¢�� ��!!!");
		}
		return (myAns >= 1 && myAns <= 100) ? myAns : askMeAns(mm);

	}

	// ����(���⶧����)
	public boolean judge(int answer, int myAnswer) {

		Scanner k = new Scanner(System.in);
		int trial = 0;

		while (true) {
			trial = trial + 1;
			if (answer == myAnswer) {
				System.out.printf("%d��°: ���� !!\n", trial);
				break;
			} else if (answer > myAnswer) {
				System.out.printf("%d��°: UP !!\n", trial);
				System.out.print("\n����: Ʋ�Ⱦ�� �ٽ� ���ϼ���\n");
				System.out.print("�� : ");
				myAnswer = k.nextInt();
			} else {
				System.out.printf("%d��°: down!!\n", trial);
				System.out.print("\n����: Ʋ�Ⱦ�� �ٽ� ���ϼ���\n");
				System.out.print("�� : ");
				myAnswer = k.nextInt();
			}
		}
		System.out.printf("%d��° �õ����� ���� !\n", trial);
		return (answer == myAnswer);
	}

	// �õ� Ƚ��
	public void countTry(int turn) {
		System.out.println("=======================");
System.out.println("�� ���ؽ��!!!");		
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
