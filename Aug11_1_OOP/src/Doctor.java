//��������(Local Variable)
//	�޼ҵ� �ӿ��� ���� ����
// 	�� �ൿ�� �ϴ� ���ȸ� �ʿ��� �ӽú�����..
//�޼ҵ� �Ķ����(Parameter)
//	�� �ൿ�� �ϴµ� �ʿ��� ���
//���ϵǴ� ��
//	�� �ൿ�� �� ���� �����
//�������(Member Variable)
//	�� ��ü�� �Ӽ�

import java.util.Scanner;

public class Doctor {

	String name;
	int age;

	public void printDoctor() {
		System.out.println(" <�ǻ�> ");
		System.out.println(this.name);
		System.out.println(this.age);
	}

	// �մ� �θ���
	// ��� : �ҷ��� ���
	public void callGuest(Guest g) {
		System.out.printf("�ǻ� : %s�� �Ϸ� �ͺ���~ \n", g.name);
	}// Ű ����(cm) 
		// ��� : ��� ���
		// ��� : �մ��� Ű

	public double askHeight(Guest g) {
		System.out.print("Ű(cm)?: ");
		double h = g.answerHeight();
		if (h >= 1 && h <= 300) {
			System.out.println("========");
			System.out.println("������ �� �۳� ��");
			System.out.println("========");
		} else if (h < 1 || h > 300) {
			System.out.println("=========");
			System.out.println("�ٽ� �Է��ϼ���.");
			System.out.println("=========");

		}
		return (h >= 1 && h <= 300) ? h / 100 : askHeight(g);
	}

	// ������ ����(kg)
	public double askWeight(Guest g) {
		System.out.print("������(kg) : ");
		double w = g.answerWeight();
		if (w >=1) {
			System.out.println("=========");
			System.out.println("...��");
			System.out.println("=========");
		} else if(w < 1) {
			System.out.println("=========");
			System.out.println("�ٽ� �����ּ���.");
			System.out.println("=========");
		}
		return (w >= 1) ? w : askWeight(g);
	
	}

	// BMI ���
	// ��� : �մ�����(Ű, ������)
	// ��� : BMI ��
	public double calcBMI(Guest g) {
		return g.weight / (g.height * g.height);
	}

	//
	// BMI �˻� ���α׷� (�Լ�. ver)
	// �̸�, Ű(cm), ������(kg) �Է�
	// BMI(ü��������) : ������ / (Ű * Ű) -> Ű : m����
	// 18.5�̸��̸� ��ü��
	// 18.5�̻��̸� ����
	// 25�̻��̸� ��ü��
	// 30�̻��̸� �浵��
	// 35�̻��̸� ��������
	// 40�̻��̸� ����

	// �����ؼ� �������
	public String judgeBMI(Guest g) {
		if (g.bmi >= 40) {
			return "����";
		} else if (g.bmi >= 35) {
			return "��������";
		} else if (g.bmi >= 30) {
			return "�浵��";
		} else if (g.bmi >= 25) {
			return "��ü��";
		} else if (g.bmi >= 18.5) {
			return "����";
		} else {
			return "��ü��";
		}
	}

	// ��� �˷��ֱ�(���)
	public void tellResult(Guest g) {
		System.out.printf("Ű�� %.1fcm�̰�, �����Դ� %.1fkg...\n",g.height * 100, g.weight);
		System.out.printf("ü��������(BMI) : %.1f\n", g.bmi);
		System.out.printf("����� ... %s�̴ϱ�...  NAGA!!!!!!!!!\n", g.bmiResult);
	}
	
	
	
	
	// ���� �������� ������ �κ�
	public void start(Guest g) {
		callGuest(g);
		g.height = askHeight(g);
		g.weight = askWeight(g);
		g.bmi = calcBMI(g);
		g.bmiResult = judgeBMI(g);
		tellResult(g);

	}

}
