import java.util.Scanner;

public class CMain4 {

	//switch-case (ex : ���� ����)
	
	//Scaneer�� �Է� ���� ��

	//�̺��Է� -> ��ġ, �����, �Ʒ�, ��
	//�Ϻ��Է� -> �����, �Ʒ�, ��
	//���Է� -> �Ʒ�, ��
	//�����Է� -> ��
	
	public static void main(String[] args) {
	Scanner k = new Scanner(System.in);
	System.out.print("��� : ");
	String rank = k.next();
	System.out.println(rank);
	
	switch (rank) {
	case "�̺�": System.out.println("��ġ");
	case "�Ϻ�": System.out.println("�����");
	case "��": System.out.println("�Ʒ�");
	case "����": System.out.println("��");
		break;                   
	default: System.out.println("����� �𸣰ڰ�... �� ���� ����� ���Դϴ�...");
		break;
	
	}
	
	
	}

}
