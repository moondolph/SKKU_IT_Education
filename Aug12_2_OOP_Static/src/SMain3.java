// static -> �������ҿ� ����� �� �־��!
//		   -> �̰� �ٷ�°� ��ü�� ��� !
// 


// �ܼ�â�� ��� ��µ��� �����غ���!
class Number {
	static int num = 0;  // static ������� : ��ü���� ����Ӽ�
	int num2 = 0;
}

public class SMain3{
	public static void main(String[] args) {
		
	Number number1 = new Number();
	Number number2 = new Number();
	
	number1. num++;
	number1. num2++; 
	
	System.out.println(number1.num);			//1
	System.out.println(number1.num2);			//1
	System.out.println(number2.num);			//1 ->Static(O)
	System.out.println(number2.num2);			//0 ->Static(X)
	

	
	
	
	}
}







