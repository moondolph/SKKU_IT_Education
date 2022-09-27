// 10. ��ü (Object)

// ���� Ű��� �������� '����', 3�� 
let dog = {
	name : "����",
	age : 3
} 

// ��ü�� �߰�ȣ �ȿ��� �����Ǹ�, key�� value������ ������ property(�Ӽ�)�� ��
// ���� ��ǥ�� �����ϰ�, ���������� ��ǥ�� ��� ������..!
// ���߿� �̰����� ������ ���� �����ϸ� ��ǥ ������� �͵� ������

//���� 
console.log(dog.name);
console.log(dog['age']);

//�߰�
dog.gender = "Male";
dog["furColor"] = "White";

//����
delete dog.furColor;
/////////////////////////////////////////////////////////////////////////////

//���� property
let name = "Beaver";
let age = 5;

/*let person = {
	name : name,
	age : age,
	gender : "Male",
}*/ 
// �̷��� ǥ���� �� �ִµ�.. �� ���¸� �� �� ���̸�..

let person = {
	name,
	age,
	gender : "Male",
} // �̷� ���·� ǥ�� ���� O (�� ��, key�� value���� �޾ƿ� ������ �̸��� ���ƾ�)

// �������� �ʴ� �Ӽ��� �����ϸ�, ������ �߻��ϴ°� �ƴ� undefined ���� ����

// �� ��, 'in' �����ڸ� ����ϸ� ���� ã�� �Ӽ��� �ִ��� Ȯ���� �� ����
// in : � ���� �ִ��� Ȯ���ϱ� ���ؼ� ��� 

console.log('birthday' in person); // false
console.log('age' in person); // true

for (let key in person) {
	console.log(key);	// key��
	console.log(person[key]);	 //value��
}

// �Լ��� ��ü �����
function makeObject(name, age) {
	return {
		name,
		age,
		hobby : "Game", 
	}
}

let beaver = makeObject("Beaver", 5);
console.log(beaver);









