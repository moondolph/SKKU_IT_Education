
public class PMain3 {
	public static void main(String[] args) {
		// print
		// System.out.print("1asdf");
		// System.out.print("2asdf");
		
		// printf
		// System.out.printf("%?", ��); �� ����
		
		// ����(decimal)
		// %d : ���������Ͱ� ���� �ڸ�(decimal, 10����) -> ��� ��� ����!
		// %xd : ���ڸ��� ����� ä������ ���
		// %0xd : ���ڸ��� 0���� ä���� x�ڸ��� ���ڷ� ����� ��
		System.out.printf("%d\n",1);
		System.out.printf("%3d\n",1);
		System.out.printf("%010d\n",1);
		
		
		
				
		System.out.printf("������ %d�� �Դϴ�\n",27);
		System.out.printf("������ %5d�� �Դϴ�\n",27);
		System.out.printf("������ %05d�� �Դϴ�\n",27);
		System.out.printf("---------------\n",27);
		System.out.println("---------------");
		
		// �Ǽ� (float)
		// %f : �Ǽ������Ͱ� ���� �ڸ� 
		// %.xf : �Ҽ��� ������ �ڸ��� (�߸��� �κ��� �ݿø�ó��)
		//		���ڸ��� 0���� ä����
		
		System.out.printf("%f\n", 123.123123);
		System.out.printf("%.3f\n", 123.456789);
		System.out.printf("%.10f\n", 123.456789);
		System.out.println("------------");
		
		
		System.out.printf("���� �µ��� %f�� �Դϴ�\n",31.12345648);
		System.out.printf("�������� %.4f �Դϴ�\n",3.641592);	//�߸��� �κ� �ݿø�ó��
		System.out.printf("1/3�� �Ҽ��� %.10f �Դϴ�\n",0.333333);   //���ڸ��� 0���� ä��
		
		//���ڿ�(String)
		// %s : ���ڵ����Ͱ� ���� �ڸ� 
		// ���� : �׳� �Է��ϸ� ��
		// ���� : �׳� �Է��ϰ� �Ǹ� Java�� �������� �ؼ��ϱ� ������ -> ����
		//		=> "����" (ū ����ǥ�ȿ� ���� �ֱ�!)
		System.out.printf("%s\n", "���� �Ϸ絵 �̷��� ���� ���׿�?!"); 
		System.out.println("--------");
		
		//���� ��¥ �������� ���� -> xxxx��
		//��					  -> xx��
		//��					  -> xx��
		System.out.printf("��¥ : %d��\n",2022);
		System.out.printf("��¥ : %4d��\n",2022);
		System.out.printf("��¥ : %d��\n",7);
		System.out.printf("��¥ : %02d��\n",7);
		System.out.printf("��¥ : %d��\n",27);
		System.out.printf("��¥ : %02d��\n",27);
		System.out.println("--------");
		//��-��-���� ���·� �ٿ���
		//ex) ��¥ : xxxx-xx-xx
		System.out.printf("��¥ : %4d-%02d-%02d\n", 2022, 7, 27);
		//���� : ����
		System.out.printf("���� : %s\n","����");		
		//��� : 32��
		System.out.printf("��� : %02d��\n", 32);
		// ���� : 30.71%
		// %% : %�� ���ڷ� ǥ���ϰ� ���� �� (��, printf������!)
		System.out.printf("���� : %.2f%%\n",30.71);
	}
}
