function logincheck(){
	if(document.frm.userid.value.length==0){
		alert("아이디를 입력해주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value==""){
	alert("암호는 반드시입력해라");
	frm.pwd.focus();
	return false;
	}
	return true;
}
function idcheck(){
	if(document.frm.userid.value==""){
		alert("아이디를 입력해주세요");
		document.frm.userid.foucs();
		return;
	}
	var url= "idcheck.do?userid="+document.frm.userid.value;
	window.open(url,"_blank_1","toolbar=no,menubar=no,scrollbars=yes,resizeable=no,width=450,height=200");
	
}

function idok(userid){
	opener.frm.userid.value = document.frm.userid.value;
	opener.frm.reid.value=document.frm.userid.value;
	self.close();
}

function joincheck(){
	if(document.frm.name.value.length==0){
		alert("이름을 써주세요");
		frm.name.focus();
		return false;
	}
	
	if(document.frm.userid.value.length==0){
		alert("아이디를 써주세요");
		frm.userid.focus();
		return false;
	}
	if(document.frm.userid.value.length<4){
		alert("아이디는 4글자 이상이어야합니다");
		frm.userid.focus();
		return false;
	}
	if(document.frm.pwd.value==""){
		alert("암호는 반드시 입력해야합니다.");
		frm.pwd.focus();
		return false;	
	}
	if(document.frm.pwd.value!=document.frm.pwd_check.value){
		alert("암호가 일치하지 않습니다");
		frm.pwd.focus();
		return false;
	}
	if(document.frm.reid.value.length==0){
		alert("중복 체크를 하지 않았습니다");
		frm.userid.focus();
		return false;
	}
	return true;
}