import java.util.Scanner;

//BMI �˻� ���α׷� (�Լ�. ver)

// �̸�, Ű(cm), ������(kg) �Է�
// BMI(ü��������) : ������ / (Ű * Ű) -> Ű : m����
// 18.5�̸��̸� ��ü��
// 18.5�̻��̸� ����
// 25�̻��̸� ��ü��
// 30�̻��̸� �浵��
// 35�̻��̸� ��������
// 40�̻��̸� ����

public class CMain7 {
	// ���α׷� ������ �˸��� �Լ�
	// �̸��� �Է��ϴ� �Լ�
	// Ű�� �Է��ϴ� �Լ�
	// �����Ը� �Է��ϴ� �Լ�
	// BMI�� ������ִ� �Լ�
	// ����� �Ǵ����ִ� �Լ�
	// ����� ������ִ� �Լ�
	// Y�� �Է����� �� ���α׷��� �������ִ� �Լ� (ex: �����Ͻðڽ��ϱ�(Y/N) ? : )

	// ���� ���� �ڵ�
	public static void start() {
		System.out.println("BMI �˻� ���α׷��� �����մϴ�.\n");
	}

	public static double input() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = k.next();
		System.out.print("Ű(cm): ");
		double height = k.nextDouble();
		double heightm = height * 0.01;
		System.out.print("������(kg): ");
		double weight = k.nextDouble();
		System.out.printf("�̸�:%s\n", name);
		System.out.printf("Ű:%.2fm\n", heightm);
		System.out.printf("������:%.1fkg\n", weight);
		double bmi = weight / (heightm * heightm); // Ű : m����
		return bmi;
	}

	public static void print(double bmi) {
		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi >= 40) {
			System.out.println("����");
		} else if (bmi >= 35) {
			System.out.println("��������");
		} else if (bmi >= 30) {
			System.out.println("�浵��");
		} else if (bmi >= 25) {
			System.out.println("��ü��");
		} else {
			System.out.println("����");
		}
	}

	public static void end() {
		Scanner k = new Scanner(System.in);
		System.out.print("���α׷��� �����Ͻðڽ��ϱ�(Y/N)? : ");
		String finish = k.next();
		if (finish.equals("Y")) {
			System.out.println("���α׷��� �����մϴ�");
			System.exit(0);
		} else {
			end();
		}
	}

	public static void main(String[] args) {
		start();
		double bmi = input();
		print(bmi);
		end();
	}

}