// ???
//		???
// stack
//		������ ���鶧���� �Ʒ��������� �������� ����
//		���α׷��� �����ϸ� �˾Ƽ� �� ����
// Heap
//		��ǻ�Ͱ� �����ϴٰ� �Ǵ��� ��ġ�� �����
// 	    �ڵ����� x (�ڵ��� �޸� �����ϴ� ��������.. �����ؾ�...)
// Garbage Collection : Heap ���� �ڵ����� �ý��� (*** ����)
// 		���� ? - �� ������ �� �̻� ������ ����� �������� �ߵ� ! 
//		



public class OMain5 {
	// ����ũ
	// �̸�
	// ����ó
	// ����
	// ���� ���
	public static void main(String[] args) {
		
		Mask m1 = new Mask();
		m1.name = "�мǸ���ũ";
		m1.shop = "������";
		m1.price = 4800;
		m1.showMaskInfo();
		System.out.println("------------");
		Mask m2 = m1;  // Mask m1�� m2��� ������ �ϳ� �� ����
		m1 = null;
		System.out.println(m1); // �ƹ� ������ �Ȱ���Ŵ ***(null)
		System.out.println(m2); 
		m2 = null;
		////////////////////////// ����ũ�� ������ ������� ����. Garbage Collection�� �ߵ�!
		System.out.println(m2);
		
		m2.printInfo(); // m2�� ������ ����ϴ°� �Ұ���
		// �ߵ��� �ȵǸ� �� �������� ���� 
		
	}
}
// ���α׷��� ����Ǹ� Stack������ ���󰡰�
//		=> Heap ������ ������ ���ϰ� �Ǵ� Garbage Collection �ߵ� !

