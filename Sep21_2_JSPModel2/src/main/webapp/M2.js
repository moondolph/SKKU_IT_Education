// M
// 		front-end 개발자 B (유효성검사 보물도 front-end 개발자 A가 만들었음)
function check() {
	let x = document.f.x;
	let y = document.f.y;
	
	if(isEmpty(x) || isNotNumber(x)
		|| isEmpty(y) || isNotNumber(y)) {
		alert("Ouch!");
		return false;
	}
	return true;
}
//
//
//
//
//
