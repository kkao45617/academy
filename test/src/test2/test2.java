package test2;
//객채를 생성하는 과정에 대한 이해부분
public class test2 {
	
		public static void main(String[] args) {
			buyer b = new buyer();
			b.buy(new tv());
			b.buy(new computer());
			b.buy(new tv());
			b.buy(new audio());
			b.buy(new computer());
			b.buy(new computer());
			b.buy(new computer());
			
			b.summary();
	}

}

class buyer{
		int money =1000;
		product[] cart= new product[3];
		int i=0;
		
		void buy(product p) {
			if(money<p.price) {
				System.out.println("거지가 으딜와");
				return;
			}
			money-=p.price;
			add(p);
		}
		void add(product p) {
			 if(i>= cart.length){
				product[] tmp=new product[cart.length*2];
				System.arraycopy(cart, 0, tmp, 0, cart.length);
				/*for(int j=0; j<cart.length; j++) {
					tmp[j]=cart[j];
				}*/
				cart=tmp;
			}
			cart[i]=p;
			i++;
			

		}
		void summary() {
			String list=" ";
			int sum=0;
			for(int i=0;i<cart.length;i++) {
				list += cart[i]+",";
				sum+=cart[i].price;
			}
			System.out.println(list);
			System.out.println(sum);
			System.out.println(money);
	}
}

class product{
		int price;
		product(int price){
			this.price=price;
		}
	}
class tv extends product{
		tv(){super(100);}
		public String toString() {return "tv";}
}
class computer extends product{
		computer(){super(200);}
		
		public String toString() {return "computer";}
}
class audio extends product{
		audio(){super(50);}
		
		public String toString() {return "audio";}
}
