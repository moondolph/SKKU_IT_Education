import java.util.Scanner;

//Part1 : �������� ���α׷���(�ڵ带 ������� �� �Ἥ ����� �� ����) - �̰�������...
//Part2 : ��ü���� ���α׷��� - ����������.. 
//Part3 : ��Ÿ ���... �ܺ� ���̺귯��

//���ǹ� 
//�ݺ���
//�迭
//-------------------------------------> �����ø��ǾƵ� ���� 
//���� �ִ� part2 ����....

public class RMain7 {

	// ���� :
	// �Ŵ���
	// �ý��۰���
	// �л�����
	// �������� ����
	// ����
	// �л�����
	// �������� ����
	// �л�
	// �������� ����
	// �� �ݺ��ϴٰ� "��"�̶�� �Է��ϸ� ���α׷� ����!
	public static void main(String[] args) {
	
//		Scanner k = new Scanner(System.in);
//		String role = null;
//		a : while(true) {    //�ݺ����� �̸� ���̱� -> �ݺ��� �տ� '�̸� :'
//			System.out.print("���� : ");
//			role = k.next();
//			switch (role) {
//			case "�Ŵ���":
//				System.out.println("�ý��۰���");
//			case "����":
//				System.out.println("�л� ����");
//			case "�л�":
//				System.out.println("�������� ����");
//				break;
//			case "��":
////				break; // ������ ������ (switch)�� ����
//				break a; // break �ڿ� �ݺ����� �̸��� ���̸� �ݺ����� ����!
//			
//			
//			}
//		}
		
		
		
		
//		Scanner k = new Scanner(System.in);
//		System.out.print("���� : ?");
//		String a = k.next();
//		
//		while(!a.equals("��")) { 
//			if(a.equals("�Ŵ���")) {
//				System.out.println("�ý��۰���");
//				System.out.println("�л�����");
//				System.out.println("�������� ����");
//			}
//			else if(a.equals("����")) {
//				System.out.println("�л�����");
//				System.out.println("�������þ���");
//			}
//			else if(a.equals("�л�")){
//				System.out.println("�������þ���");
//			}
//			System.out.print("�ٽ� �Է��ϼ���: ");
//			a = k.next();
//		}
		
		//�����غ��ô� !!
		bb : for (int i = 0; i<3; i++) {
			aa : for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 3; j2++) {
					System.out.printf("%d %d %d\n", i, j, j2);
					if (i == 1) {
						System.out.println("�ߴ� !");

						break; 			// ? 2 2 2
//						break aa;		// ? 2 0 0
//						break bb;		// ? 1 0 0
					}
				}
			}
		}
		
		
		
	}
}
