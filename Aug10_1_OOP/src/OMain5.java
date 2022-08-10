// ???
//		???
// stack
//		변수를 만들때마다 아래에서부터 차곡차곡 쌓임
//		프로그램이 종료하면 알아서 다 정리
// Heap
//		컴퓨터가 적당하다고 판단한 위치에 만든다
// 	    자동정리 x (핸드폰 메모리 정리하는 느낌으로.. 정리해야...)
// Garbage Collection : Heap 영역 자동정리 시스템 (*** 면접)
// 		언제 ? - 그 번지에 더 이상 접근할 방법이 없어지면 발동 ! 
//		



public class OMain5 {
	// 마스크
	// 이름
	// 구매처
	// 가격
	// 정보 출력
	public static void main(String[] args) {
		
		Mask m1 = new Mask();
		m1.name = "패션마스크";
		m1.shop = "편의점";
		m1.price = 4800;
		m1.showMaskInfo();
		System.out.println("------------");
		Mask m2 = m1;  // Mask m1은 m2라는 별명이 하나 더 생김
		m1 = null;
		System.out.println(m1); // 아무 번지도 안가리킴 ***(null)
		System.out.println(m2); 
		m2 = null;
		////////////////////////// 마스크의 정보가 사라지는 시점. Garbage Collection이 발동!
		System.out.println(m2);
		
		m2.printInfo(); // m2의 정보를 출력하는게 불가능
		// 발동이 안되면 다 끝나서야 날라감 
		
	}
}
// 프로그램이 종료되면 Stack영역이 날라가고
//		=> Heap 영역에 접근을 못하게 되니 Garbage Collection 발동 !

