import java.util.Scanner;

public class CMain5 {
	// ���� :
	// 		  DBA(���� �����ͺ��̽� ������)
	//			��������
	//			���/����
	//			��ɾ�� CRUD
	//			���� Ȱ��
	//		  DBP(�����ͺ��̽� ���α׷���) -->
	//			��ɾ�� CRUD          
	//			���� Ȱ��
	//		  DBU(�����)
	//			���� Ȱ��
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		String job = k.next(); 
		
		switch (job) {
		case "DBA":
			System.out.println("��������");
			System.out.println("���/����");
		case "DBP":
			System.out.println("��ɾ�� CRUD");
		case "DBU":
			System.out.println("���� Ȱ��");			
			break;
		default :
			System.out.println("DB ~ ���غ���~");
			break;
		}
	}		
	
	
}
