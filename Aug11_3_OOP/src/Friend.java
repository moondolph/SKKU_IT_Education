import java.util.Random;

public class Friend {

	Random brain = new Random();
	
	public int answer() {
	int think = brain.nextInt(100)+1;
	// �Ӹ������� ���� �ϳ��� <����>�ؼ� 
	// ���̿� �Ἥ �� ����
	
	System.out.println("ģ��: (��...��ζ����ٰ� ������)\"�� �����\"");
	return think;
	}
	
	
}
