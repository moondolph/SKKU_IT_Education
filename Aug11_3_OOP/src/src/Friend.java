import java.util.Random;

public class Friend {
	Random brain = new Random();
	
	public int writeFriAns() {
		int think = brain.nextInt(100) + 1;
		// �Ӹ������� ���� �ϳ��� <����>�ؼ�
		// ���̿� �Ἥ �� ����
		System.out.println("ģ���� ���� ���ߴ�!");
		return think;
	}
}
