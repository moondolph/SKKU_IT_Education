// 4. ��(��) ��ȯ

// String() 		-> ���������� ��ȯ
// Number()		-> ���������� ��ȯ
// Boolean()		-> �������� ��ȯ

// �� ��ȯ�� �� �ʿ��ұ�� ~ ?
//  �ڷ����� �ٸ� �� ������ ������� ��, ���ϴ� ����� ������ ���� ���� ���� 


// ����, ���������� �Է� �޾Ƽ� ��� ������ ������ִ� ���α׷�
// ��� (document.write)

/*let math = prompt("��������?");
let english = prompt("��������?");
let avg = (math + english) / 2 ;
document.write("��� ���� : " + avg + "<br>");


let math2 =80;
let eng2 = 90;
let avg2 = (math2 + eng2) /2 ;
document.write("��� ���� : " + avg2 + "<br>"); */

// prompt�� ���� ���� ������ ������(String)
// "80" + "90" = 170(x) / "8090" (o)
// "8090" / 2 = 4045   ...?
// "8090"�� �и� ���ڿ��ε�.. ����� �Ǿ���
//		�������� �ƴϴ��� ǥ����(+ - * /)�� Ȱ������ �� ���������� ��ȯ�� �� �ִٸ� 
//		�ڵ����� �� ��ȯ�� �Ǿ ����� ��
// 		'�ڵ� �� ��ȯ'�̶�� ��

// �ڵ� ����ȯ�� ���ƺ�������
// ������ ã�� ���� ������ �߻���ų ������ ����� ����...
//		=> �׻� �ǵ��� ������ ���ϴ� Ÿ��(�ڷ���)���� ��ȯ�ؼ� ����ϴ� ���� Ҭ!
//			'����� �� ��ȯ'

// String() : S�� �빮�� ! / ��ȣ���� ���� ���������� �ٲ���
document.write("String() <br>");
document.write(
	String(3) + "<br>",
	String(true) + "<br>",
	String(false) + "<br>",
	String(null) + "<br>",
	String(undefined) + "<br>"
);
 document.write("-------------------<br>");

// Number() : N�� �빮��! / ��ȣ���� ���� ���������� �ٲ���
document.write("Number() <br>");
document.write(
	Number("1234") + "<br>", // 1234
	Number("asdf") + "<br>", // NaN (Not a Number)
	Number(true) + "<br>",	 // 1
	Number(false) + "<br>"	 // 0
);
document.write("---------------------<br>");

// Boolean() : B�� �빮�� / ��ȣ���� ���� �������� �ٲ���

// false�� �˾Ƶθ�...
//  - ���� 0
//  - �� ���ڿ�("") ���� x
//  - null
//  - undefined
//  - NaN
//  �̿ܿ��� ��� true�� �� !

// ���ǻ��� -> ���� ������ ���... �����صνô°� ���ھ��...
Number(null);		//0
Number(undefined);  // NaN

let a = Number(prompt("asdf")); // prompt�� ���� ���� �ʾҴٸ�?
document.write(a + "<br>");		// => ���� ���� �ʾƼ� null
								// => Number(null); =>0�� ����
								 

