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
	public static void startBMI() {
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("\tBMI �˻縦 ����~~�մϴ� !");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}

	// �̸��� �Է��ϴ� �Լ�
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = k.next();
		return name;
	}

	// Ű�� �Է��ϴ� �Լ�
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("Ű : ");
		double height = k.nextDouble(); // �Է¹��� ���� cm
		return height / 100; // ������ m����. getHeight()�� ���� m
	}

	// �����Ը� �Է��ϴ� �Լ�
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("������ : ");
		double weight = k.nextDouble();
		return weight;
	}

	// BMI�� ������ִ� �Լ�
	public static double calcBMI(double weight, double height) {
		double bmi = weight / (height * height);
		return bmi;
	}

	// ����� �Ǵ����ִ� �Լ�
	// RAM�� �� ������ -> ������ ���̸� �ȴ�!
	// HDD�� �� ������ -> �ڵ带 ���̸� �ȴ�!
	public static String judgeBMI(double bmi) {

		String result = "���ǰ�";
		if (bmi >= 40) {
			result = "����";
		} else if (bmi >= 35) {
			result = "��������";
		} else if (bmi >= 30) {
			result = "�浵��";
		} else if (bmi >= 25) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		} else {
			return "��ü��";
		}
		return result;
	}

	// ����� ������ִ� �Լ�
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.printf("%s���� Ű�� %.1fcm,�����Դ� %.1fkg�̰�..\n", n, h * 100, w);
		System.out.printf("ü��������(BMI) : %.1f�Դϴ�\n", b);

		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println("�� ����� ���ɴϴ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.printf("\t%s���� %s�Դϴ� !\n", n, r);
		switch (r) {
		case "��ü��":
			System.out.println("\t�׸� �� �Ծ��");
			break;
		case "����":
			System.out.println("\t��ô� ��� ��ø� �˴ϴ�.");
			break;
		case "��ü��":
			System.out.println("\t�Դ� ���� �� ���̽ø� �˴ϴ�.");
			break;
		case "�浵��":
			System.out.println("\t�Ϸ翡 2���� �弼��.");
			break;
		case "��������":
			System.out.println("\t�Ϸ翡 1���� �弼��.");
			break;
		case "����":
			System.out.println("\t��ĥ �� �Դ´ٰ� �� �׽��ϴ�.");
			break;

		default:
			break;
		}
	}

	// Y�� �Է����� �� ���α׷��� �������ִ� �Լ� (EX: �����Ͻðڽ��ϱ�(Y/N) ? : )
	public static void exit() {
		Scanner k = new Scanner(System.in);
		System.out.print("�ý����� �����Ͻðڽ��ϱ�(Y/N) ? : ");
		String answer = k.next();
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.println("5������ �ڵ���ü�Ǿ����ϴ�.");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*");
		} else {
			exit();
		}
	}

	public static void main(String[] args) {
		startBMI();
		String name = getName();
//		System.out.println(name);			�� �޾ƿԴ��� Ȯ���Ϸ���
		double height = getHeight(); // ���⼭ height�� m��
//		System.out.println(height);
		double weight = getWeight();
		double bmi = calcBMI(weight, height);
//		System.out.println(bmi);
		String result = judgeBMI(bmi);
		printResult(name, height, weight, bmi, result);
		exit();

	}

	// ���� ���� �ڵ�
//	public static void start() {
//		System.out.println("BMI �˻� ���α׷��� �����մϴ�.\n");
//	}
//
//	public static double input() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("�̸�: ");
//		String name = k.next();
//		System.out.print("Ű(cm): ");
//		double height = k.nextDouble();
//		double heightm = height * 0.01;
//		System.out.print("������(kg): ");
//		double weight = k.nextDouble();
//		System.out.printf("�̸�:%s\n", name);
//		System.out.printf("Ű:%.2fm\n", heightm);
//		System.out.printf("������:%.1fkg\n", weight);
//		double bmi = weight / (heightm * heightm); // Ű : m����
//		return bmi;
//	}
//
//	public static void print(double bmi) {
//		System.out.println("---------�˻���-----------");
//		if (bmi < 18.5) {
//			System.out.println("[��ü��]");
//		} else if (bmi >= 40) {
//			System.out.println("[����]");
//		} else if (bmi >= 35) {
//			System.out.println("[��������]");
//		} else if (bmi >= 30) {
//			System.out.println("[�浵��]");
//		} else if (bmi >= 25) {
//			System.out.println("[��ü��]");
//		} else {
//			System.out.println("[����]");
//		}
//	}
//
//	public static void end() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("���α׷��� �����Ͻðڽ��ϱ�(Y/N)? : ");
//		String finish = k.next();
//		if (finish.equals("Y")) {
//			System.out.println("���α׷��� �����մϴ�");
//			System.exit(0); // <-- ��ɾ �� �̻� ������ ����� �־ �ǰ� ��� �� 
//		} else {
//			System.out.println("\"Y\"�� ������ ���� �ȵ˴ϴ٤���");
//			end();
//		}
//	}
//
//	public static void main(String[] args) {
//		start();
//		double bmi = input();
//		print(bmi);
//		end();
//	}

}