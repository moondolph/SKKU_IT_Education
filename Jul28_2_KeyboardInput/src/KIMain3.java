import java.util.Scanner;

public class KIMain3 {
	public static void main(String[] args) {
		//�޴���
		//������, ����, �, Ƣ��, ...
		// ������ �Է� �޾Ƽ�
		// �޴��� ������� ���!
		
		Scanner price = new Scanner(System.in);
		
		System.out.println("������ 1�κ� ���� å��: ");
		int tteok = price.nextInt();
				
		System.out.println("���� 1�κ� ���� å��: ");
		int sun = price.nextInt();
				
		System.out.println("� 1�κ� ���� å��: ");
		int eo = price.nextInt();
				
		System.out.println("Ƣ�� 1�κ� ���� å��: ");
		int tui = price.nextInt();
		
		System.out.println("�ݶ� 1�κ� ���� å��: ");
		int coke = price.nextInt();
		
		
		
		
		
		System.out.println("\t<�޴���>");
		System.out.println("=========================");	
		System.out.printf("|*������:%,d��\t|\n",tteok);
		System.out.printf("|*����:%,d��\t\t|\n",sun);
		System.out.printf("|*�:%,d��\t\t|\n",eo);
		System.out.printf("|*Ƣ��:%,d��\t\t|\n",tui);
		System.out.printf("|*�ݶ�:%,d��\t\t|\n",coke);
		System.out.println("=========================");			
	}

}
