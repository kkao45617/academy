package ex05;
//쓰레드를 이용한 문장
public class make {

	public static void main(String[] args) {
		Runnable task =()->{
			int n1 =10;
			int n2 =20;
			String name = Thread.currentThread().getName();
			
			
			System.out.println(name+" :"+(n1+n2));
			for(int i=0; i<500; i++) {
				System.out.println(name+":"+i);
			}
		};
		Thread t = new Thread(task);
		t.start();//쓰레드 생성 및 실행
		
		for(int i=0; i<500; i++) {
			System.out.println("main :"+i);
		}
		
		System.out.println("end :"+Thread.currentThread().getName());
		
	}

}
