import java.util.Scanner;

//�񸸵� �˻� ���α׷� (�Լ�.ver)

// Ű, �����Դ� �Է¹��� ��
// ǥ��ü�� = (Ű - 100) x 0.9
// �񸸵� = (����ü�� / ǥ��ü��) x 100
// �񸸵��� 120�� ������ '��', �ƴϸ� '�Ⱥ�'

//�Լ� : main �Լ����� java�� �𸣴� ����� ���� �� �Ѱ��� �˾ƺ� �� �ְ� + �����ؾ�

// ����� �� �з��ؼ� �Լ��� ǥ���� �����..!
//	  => ���������� �������ϴ�~

// ���࿡.. ǥ��ü���� ���ϴ� ������ 0.9 => 0.8�� �ٲ����!
// �پ��� ����� �Լ� �ϳ��� �����ϰ�, ��������� �����ϰ� ���� ��...(��������)
// �ѹ��� �� ã�� �� ������...?

// ctrl + shift + /(�����е���) : �Լ� �ݱ�
// ctrl + shift + *(�����е���) : �Լ� ����

// �޸𸮸� �Ƴ� ���ΰ� ?  vs �������� ���� �� ���ΰ�?


public class FMain3 {
	//�񸸵� �˻� ���� ������ ����ϴ� �Լ�
	public static void startBimando() { 
		System.out.println("�񸸵� �˻� ���� !");
	}
	
	//Ű�� �Է¹޴� �Լ�
	public static double getHeight() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Ű(cm)�� �Է��ϼ��� : ");
		double height = keyboard.nextDouble();
		return height;
	}
	//�����Ը� �Է¹޴� �Լ�
	public static double getWeight() {
		System.out.print("������ : ");
		return new Scanner(System.in).nextDouble();
		
	}
	//Ű�� ������ ǥ��ü���� �����ִ� �Լ�
	public static double calcStdWeight(double height) {
		double stdWeight = (height - 100) * 0.9;
		return stdWeight;

	}
	
	//����ü�߰� ǥ��ü���� ������ �񸸵��� ����ؼ� ���� �����ִ� �Լ�
	public static double calcBimando(double weight, double stdWeight) {
		double bimando = (weight / stdWeight) * 100;
		return bimando ;
		
	}
	//������ �Ⱥ����� �������ִ� �Լ�
	public static String judgeBimando(double bimando) {
		String result = (bimando > 120) ? "��" : "�Ⱥ�" ;
		return result;
	}
	
	//����� ������ִ� �Լ�
	public static void printResult(double h, double w, double std, double b, String r) {
		System.out.println("--------------------");
		System.out.printf("Ű : %.1fcm\n", h);
		System.out.printf("������ : %.1fkg\n", w);
		System.out.printf("ǥ��ü�� : %.1fkg\n", std);
		System.out.printf("�񸸵� : %.1f\n", b);
		System.out.printf("����� [%s] �Դϴ�.\n", r);
		System.out.println("--------------------");
	}
	
	public static void main(String[] args) {
		startBimando();
		double height = getHeight();
		double weight = getWeight();
		double stdWeight = calcStdWeight(height);
		double bimando = calcBimando(weight, stdWeight);
		String result = judgeBimando(bimando);
		printResult(height,weight,stdWeight,bimando,result);
		
	}
	
	
	
	
	
	
	
//	public static String checkObesity(double height, double weight) {
//		System.out.println("Ű(cm)�� �Է��ϼ��� : ");
//		Scanner k = new Scanner(System.in);
//		double height = k.nextDouble();
//		
//		double stdweight = (height - 100) * 0.9 ;
//		double obesity = (stdweight / weight) * 100 ;
//		String result = obesity > 120 ? "��" : "����";  
//		System.out.printf("Ű�� %.1fcm, �����Դ� %.1fkg�Դϴ�.\n", height, weight);
//		return result;
//	}
//	public static void main(String[] args) {
//		String result = checkObesity(180, 100);
//		System.out.printf("�񸸵� �˻� ��� : %s\n", result);
//	}
}
