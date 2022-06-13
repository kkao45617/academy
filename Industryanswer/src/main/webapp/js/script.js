function check(){
	if(document.frm.custno.value==""){
		document.frm.custno.focust();
		return false;
	}
	
	return true;
}