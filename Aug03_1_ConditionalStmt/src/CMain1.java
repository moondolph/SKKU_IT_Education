import java.util.Scanner;

public class CMain1 {
	// ���� ���� ������ �Է��ؼ� �޾ƿ��� �Լ�

	public static int getKorean() {
		System.out.print("���� ����: ");
		Scanner k = new Scanner(System.in);
		int korean = k.nextInt();
		// �������� - ������ ���� ������
		return (korean >= 0 && korean <= 100) ? korean : getKorean();
	}
	// ���ǹ� : �ۼ��� �ڵ带 ���ǿ� ���� �ڵ��� ���� �帧�� �ٸ��� �����ϵ��� �����ϴ� ����
	// if�� : ���ǽ��� ����� true, false�� ���๮�� ����

//	if (���� A) {
//		���� A�� �������� �� (���϶�) �� �κ��� ����
//	} else if (���� B) { 
//		���� A (X), ���� B (O)�϶� �� �κ��� ����
//	} else if (���� C) {
//		���� A/B (X), ���� C(O)�϶� �� �κ��� ����
//	} else {
//		�´� ������ �ϳ��� ������ �� �κ��� ����
//	}

	// ���� ������...
	// 60�� �̸��̸� '��'
	// 60�� �̻��̸� '��'
	// 70�� �̻��̸� '��'
	// 80�� �̻��̸� '��'
	// 90�� �̻��̸� '��' ���

	public static void print(int korean) {
		if (korean < 60 && korean >= 50) {
			System.out.println("'��'");
		}

		else if (korean >= 90) {
			System.out.println("'��'");
		}

		else if (korean >= 80) {
			System.out.println("'��'");
		}

		else if (korean >= 70) {
			System.out.println("'��'");
		}

		else if (korean >= 60) {
			System.out.println("'��'");
			System.out.println("==============");
		}
		// ���� ������ 50���� �ȵǸ� ��, �ƴϸ� Ī��
		// ������ 50�� �̻�, 60�� �̸��̸� �ƽ��� �Ҹ��� ���ּ���
		// ������ 30�� �̸��̸� ����ó��

		// if���ȿ� if���� �� ����ϴ� ���� ����!
		// if - if���� if - else���� ����
		// if - if : ���� �ٸ� ���ǹ����� �ؼ��� �Ǿ ���� => ȿ���� x
		// if - else : �ϳ��� ������ �����Ǹ� ������ �κ��� �������� ���� => ȿ���� o

		if (korean < 50) {
			System.out.println("��");
		}
		if (korean >= 50) {
			System.out.println("Ī��");
		}

		if (korean < 50) {
			System.out.println("�ѱ��� �³�");
			if (korean < 30) {
				System.out.println("NAGA!!!!!!!!!!");
			}
		} else {
			System.out.println("���߾��");
			if (korean < 60) {
				System.out.println("������մ����� ������ ������ �ƴ����� �׷��� �ؾ���");
			}
		}

	}

	public static void main(String[] args) {
		int korean = getKorean();
//		System.out.printf("���� ����: %d\n", korean);
		print(korean);

	}

}
