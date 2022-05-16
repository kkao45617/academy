package es05;
// 쓰레드를 이용한 주소와 어펜드를 통한 추가 및 구현 과정
//
public class es05 {

	public static void main(String[] args) {
		Thread ct= Thread.currentThread();
		
		String name= ct.getName();
		System.out.println(name);
		
		Runnable task=()->{
			int n1=10;
			int n2=20;
			String name1=Thread.currentThread().getName();
			System.out.println(name+","+n1+n2);
		};
		Thread t = new Thread(task);
		t.start();
		System.out.println("end"+Thread.currentThread());
		
		System.out.println("-----------------");
		
		Runnable task2=()->{
			for(int i=0; i<20; i++) {
				if(i%2==0)
					System.out.print(i+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Runnable task3=()->{
			for(int i=0; i<20; i++) {
				if(i%2==1)
					System.out.print(i+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread r1 = new Thread(task2);
		Thread r2 = new Thread(task3);
		r1.start();
		r2.start();
	}

}
