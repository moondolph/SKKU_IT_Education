// function - Ŭ���� �ۿ� ���� �� - X (��ǻ� Java���� function�̶�� �� ����!)
// method (member function(x)) - Class �ӿ� ���� ��(Class�� �������� �Լ���� ǥ��) 
// 							   - ���±��� ��� �� �� method�������� !!!! o0o!!!!!




//Class : ��ü�� ���� Ʋ (ex: �ؾ Ʋ, ����)
public class Bus {
	//�������(Member Variable) - �Ӽ� (=attribute, field, ��������)
	//						  - ��ü�� �����Ͱ� ����Ǵ� ����
	//						  - Class�� ���ԵǴ� ����(Variable)!

//������ȣ
int no;
//������ ����
String brand;
//����ȸ��
String company;
//������ ������
String driver;
//������ ������
String startPoint;
	
public void printInfo() {
	// this : �ڱ� �ڽ��� ���Ѵ�. (this. : ���� ���� o)
	System.out.println(no);
	System.out.println(brand);
	System.out.println(company);
	System.out.println(driver);
	System.out.println(startPoint);
}

 // method(��� �޼ҵ�) - �׼�, ���α׷��� �ʿ��� ���
 // 				 - ��ü�� ���ۿ� �ش��ϴ� ���� ���
  public void go() {
	 System.out.println("�θ��θ� ~");
  }




}
