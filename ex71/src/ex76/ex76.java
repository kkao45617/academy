package ex76;
//p268 참조형 반환타입
class Data{int x;}
public class ex76 {

	public static void main(String[] args) {
		Data d =new Data();
		d.x=10;
		
		Data d2=copy(d);
		System.out.println("d.x="+d.x);
		System.out.println("d.x2="+d2.x);
	}




static Data copy(Data d){
	Data tmp = new Data();
	tmp.x=d.x;
	return tmp;
	}
}