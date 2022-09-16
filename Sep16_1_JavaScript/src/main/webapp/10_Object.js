// 10. 객체 (Object)

// 제가 키우는 강아지는 '마루', 3살 
let dog = {
	name : "마루",
	age : 3
} 

// 객체는 중괄호 안에서 구성되며, key와 value값으로 구성된 property(속성)가 들어감
// 각각 쉼표로 구분하고, 마지막에는 쉼표가 없어도 되지만..!
// 나중에 이것저것 수정할 것을 생각하면 쉼표 적어놓는 것도 괜찮음

//접근 
console.log(dog.name);
console.log(dog['age']);

//추가
dog.gender = "Male";
dog["furColor"] = "White";

//삭제
delete dog.furColor;
/////////////////////////////////////////////////////////////////////////////

//단축 property
let name = "Beaver";
let age = 5;

/*let person = {
	name : name,
	age : age,
	gender : "Male",
}*/ 
// 이렇게 표현할 수 있는데.. 이 상태를 좀 더 줄이면..

let person = {
	name,
	age,
	gender : "Male",
} // 이런 형태로 표현 가능 O (이 때, key와 value에서 받아올 변수의 이름이 같아야)

// 존재하지 않는 속성에 접근하면, 에러가 발생하는게 아닌 undefined 값이 나옴

// 이 때, 'in' 연산자를 사용하면 내가 찾는 속성이 있는지 확인할 수 있음
// in : 어떤 값이 있는지 확인하기 위해서 사용 

console.log('birthday' in person); // false
console.log('age' in person); // true

for (let key in person) {
	console.log(key);	// key값
	console.log(person[key]);	 //value값
}

// 함수로 객체 만들기
function makeObject(name, age) {
	return {
		name,
		age,
		hobby : "Game", 
	}
}

let beaver = makeObject("Beaver", 5);
console.log(beaver);









