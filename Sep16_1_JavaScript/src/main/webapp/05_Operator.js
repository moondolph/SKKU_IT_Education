document.write("�� ���ɴϴ�" + '<br>');
document.write("----<br>----");
// 5.������
//	  ��� ������ : + - * / %
 
// �ŵ�����

let num0 = 2**3;
document.write(num0 + "<br>");

//�켱����
//  (*, /) > (+, -)
 
//�����ڸ� �ٿ��� ���� �͵� ���� O
 let num1 = 10;
 num1 = num1 + 5;
 document.write(num1 +"<br>");		//15
 num1 += 5;
 document.write(num1 + '<br>');		//20
 
 //����������
 let num2 = 20;
 num2++;
 document.write(num2); // 21  
 document.write("<br>");
 
 let result = num2++;
 document.write(result); // 21
 document.write("<br>");
 document.write("-----------")
 document.write("<br>");
	 
	 result = ++num2;
 document.write(result); // 23

// -> ++�� �ڿ� ������ ������Ű�� ���� ���� result�� ���, 
// 		    �տ� ������ ������Ų ���� result�� ����

//�񱳿�����(Java���� ����!)
// < > <= >= == != 
document.write("---------------<br>");
document.write((10 > 5) + "<br>");
document.write((10 == 5) + "<br>");
document.write((10 < 5) + "<br>");
document.write("---------------<br>");

//"10"�� 10�� ������ Ȯ�����ּ���!

document.write((10 == "10") + "<br>"); //true 
	// => �ڵ� ����ȯ ������ true
document.write((10 === "10") + "<br>"); //false !!! 
 	// => ===, !== : ��ġ������ / �ڷ��������� �񱳸� ���� / �ϳ� �����ؿ�~ 
 
// ��������
// || (OR)
// ������ �� �ϳ��� true�� true�� ��ȯ
// 	  -> ��� ���� false�϶��� false�� ��ȯ
// => ù��° true���� �߰��ϴ� ��� ���� 

// && (AND)
// ��� ���� true���� true�� ��ȯ 
//	   -> �ϳ��� false�� ������ false�� ��ȯ
// => ù��°�� false���� �߰��ϴ� ��� ����	

// ! (NOT)
// �ݴ��� ������ ��ȯ 
// true -> false / false -> ture 
// 
//
//