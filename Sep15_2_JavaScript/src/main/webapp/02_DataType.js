// 2. �ڷ���
//	�� ������ String
//
let name1 = "Beaver";
let name2 = 'Beaver';	
let name3 = `Beaver`;	//~ ǥ���Ҷ� shift �� ���� Ű ``(backtick) 

let message1 = "I'm a boy.";
let message2 = 'I\'m a boy.';	//���� ����ǥ�� ��� �� \(��������)�� ������
								// '�� Ư�����ڷ� �ν���

// ���ڿ� ���ο� ������ ǥ���� �� ����ϸ� ���� backtick !!

// ${������}�� �־ ǥ����
let message3 = `My name is ${name1}`;
document.write(message3 + '<br>');
let message4 = "My name is ${name2}";
document.write(message4 + '<br>'); // ${name1}�� �״�� �����.. ��

//��� (ǥ����)�� ��� ���� O
let message5 = `I am ${100 + 99} years old.`
document.write(message5 + "<br>");
document.write('-----dd--------------<br>');

//�� ������ Number (���� / �Ǽ�)
let age = 100;
let height = 187.3;

// ���ó� ��Ģ������ ���� O
document.write(1 + 2 + "<br>"); // ���ϱ�
document.write(1 - 2 + "<br>"); // ����
document.write(1 * 2 + "<br>"); // ���ϱ�
document.write(1 / 2 + "<br>"); // ������
document.write(1 % 2 + "<br>"); // ������

let a = 1 / 0;
document.write(a + "<br>");	//Infinity(���Ѵ�)

let b = name1 / 2;
document.write(b + "<br>");	//NaN : Not a Number ���ڰ� �ƴϴ� 

//���ڳ��� �̾��ֱ⵵ ���� o
let aa = "����"
let bb = "�Դϴ�"
document.write(aa + name1 + bb +"<br>");
document.write(aa + age +"��" + bb +"<br>");
document.write("--------------------<br>");

// �� ���� Boolean
let c = true; 		// ��
let d = false;		// ����

document.write((name=="Beaver") + "<br>");
document.write((age < 20) + "<br>");
document.write("------------------<br>");

//��null,  undefined
let e;
document.write(e + "<br>");	// undefined : ���� �Ҵ���� ���� ���� 

let f = null;
document.write(f + "<br>"); // null : �������� �ʴ� ��
document.write("-----------------<br>");

// �� typeof ������ : ������ �ڷ����� �˾Ƴ� �� ���
// ���� �ڵ带 ®���� �翬�� �� �����ڴ� ���� X 
// �ٸ� �����ڰ� �ڵ带 ®�� ��, ������ ���� ������Ÿ��(�ڷ���)�� �˾ƾ� �� ��
// or API�� ���ؼ� �޾ƿ� �������� �ڷ����� �˾Ƴ��� �ٸ� ������� ó���ؾ� �� �� ���� ���
document.write(typeof name1 + "<br>");
document.write(typeof age + "<br>");
document.write(typeof c + "<br>");
document.write(typeof e + "<br>");
document.write(typeof f + "<br>");




