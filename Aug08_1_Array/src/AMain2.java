
public class AMain2 {
	
	// ������ ���� cmd ����
	
	// public / static : �� �� ���߿�
	// void : �ڷ����ε�.. ������ �� ����!
	// main : �Լ��� 
	
	// String[] args�� ��ü��...? 
	// �ܺο��� ���� �޾ƿ��� ���ؼ� ����ϴ� �Ķ����
	// args ���ڿ��� �迭�� ����ϰڴ�! 
	// args�� �������̱� ������ �� args�� �ƴϾ ������
	// �Ķ���ʹ� String[] args ��ü�� ������ �ȵ�!!!!!!!!!!!
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		Thread.sleep(10000);	
			
	}
		
}

