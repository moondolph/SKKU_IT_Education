//Ŭ���̾�Ʈ�� ĳ���� ���� ����� �����޶�� �䱸 -> ����µ� ����!
// 		�ǳ��ִ� ��� ?
//	��� : .java���� ���� .jar���Ϸ� �ǳ���� !
//		.java : �ҽ����� ����! 
//		.jar : �ҽ��� �������� �ʰ� + �� ��ɸ��� ����
//	JAR(Java Archive, �ڹ� ��ī�̺�) ����
//		: ���� ���·� �ٲ㼭 ������ �س��� ����
//
// �ѱ��� - ����(����) -> .java�� ����
// (������ ��) .java���� - ����(Compile) -> .class����(����/����Ʈ�ڵ�)�� �ڵ����� ����.
// .class���� -����->

//	�츮�� ���� �ڵ�� .java���Ϸ� ����ǰ�,
// �� �� compile�̶�� �۾��� ���� .class����, �� ����� ��ȯ�Ǿ� �ڵ����� ����
// ����ɶ��� .class�� ���·� JVM���� �����Ǵ� ����

// .java���� : ����� ������ ���� ��
// .class���� : ������ �ڹٿ��� �����ϴ� ��

// �� ����? ���� /  ����Ʈ�ڵ�� ��ȯ�ؼ� �����°ɱ�...?
//		- ����Ʈ �ڵ带 ����ϸ� ������ ������!
//		- �ҽ��� �����ϰ� �Ǹ� �̰� ���� ���α׷����� �� �� �ֱ� ������ '����'���� ������!
//-> �ٸ� ������� ����� �Ѱ��� �� �ҽ��� �˷����� ����, �� ��ɸ��� ����ϰ� ����!
//-> .java���� ���� jar���Ϸ�!!

// JavaDoc
// JavaDoc�� ���� : ��ǰ ������!
// �츮�� ���� ���α׷��� ���� ��~~~~~��  HTML����, �츮�� �˰��ִ� WEB��������
// ���� ���� ��~~~~�ϰ� ����ȭ ��Ų �� !

// JavaDoc�� Ư¡
// - �ּ��� /** (����) */
// - �ּ� ������ ũ�� 2������ ����
//		������
//		  �ּ��� ���ۿ��� ù��° �±� ���Ǳ����� �κ�
//		  �������� HTML�� �����Ǳ� ������ �ܼ��� �ּ� �ۼ���ÿ� 
// 		  ���͸� �ļ� ���� �ٲ� �Է��ߴ� �ϴ���! 
//		  �״�� �̾����� ��µ�
//		  �ٹٲ� ó���� �ϰ� �ʹٸ� <p>�� �ۼ��ϸ� ��~
//		�±� ���� 
//		  ù��° ���ڰ� '@'�� �����Ѵ�.
//			 - @author : �� ���α׷��� �ۼ���, �⺻������ Windows ���� ID
//			 - @version : �� �״�� �� ���α׷��� ����
//			 - @param : �Ķ���Ϳ� ���� ������ �� �� ���
//			 - @throws : ����ó���� ���� ����
//			 - @return : �޼ҵ尡 void�� �ƴ� ��ȯ ���� ���� �� �װͿ� ���� ���� 
//			 - 
//





/**
 * @author beaver
 * @version 1.1.14
 * <p>
 * ���� ĳ������ ������ ������ �ִ� Ŭ����
 */





public class GameCharacter {

	String nickname;
	int level;
	String job;
	String weapon;
	
	/**
	 * ���� ĳ���͸� �����մϴ�.
	 * <p> �⺻ ����� ���, �⺻ ������ �ʺ����Դϴ�.
	 * @param nickname ĳ������ �̸�; ���̴� 3�� �̻� 10�� �����̾�� �մϴ�.
	 * @throws IllegalArgumentException ĳ������ nickname ���̰� ������ ������ �����, 
	 * �� ({@code} nickname < 3 || nickname > 10})�̸� �߻��մϴ�. 
	 */
	
	
	public GameCharacter(String nickname) {
		this.level = 1;
		this.job = "�ʺ���";
		this.weapon = "���";
		if (nickname.length() < 3 || nickname.length() > 10) {
			throw new IllegalArgumentException("ĳ������ �̸��� 3�� �̻� 10�� �����Դϴ�.");
		}
		this.nickname = nickname;
	}
	
	/**
	 * ĳ������ ������ �÷��ִ� �޼ҵ��Դϴ�.
	 */
	public void levelup() {
		this.level++;
	}
	
	/**
	 * ĳ������ ������ �����մϴ�.
	 * @param job ĳ������ ������ ����
	 * @throws IllegalArgumentException ĳ������ ������ 10�� ���� �ʾҴٸ� �߻��մϴ�.
	 */
	public void setJob(String job) {
		if (this.level < 10) {
			throw new IllegalArgumentException("ĳ������ ������ 10�� ���� �ʽ��ϴ�.");
		}
		this.job = job;
	}
	
	
	/**
	 * ������ ĳ������ status���� �����ִ� �޼ҵ��Դϴ�.
	 */
	public void printInfo() {
		System.out.printf("�г��� : %s\n", this.nickname);
		System.out.printf("���� : %d\n", level);
		System.out.printf("���� : %s\n", job);
		System.out.printf("���� : %s\n", weapon);
	}


}