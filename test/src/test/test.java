package test;
import java.util.*;
public class test {

	public static void main(String[] args) {
        int year=0;
        int month=0;
        int first=0;
        int days=0;
        Scanner sc=new Scanner(System.in);
        
        // year�� month�� ���� �Է¹޴´�
        System.out.println("�⵵�� �Է� �ϼ���");
        year=sc.nextInt();
        System.out.println("���� �Է��ϼ���");
        month=sc.nextInt();
        
        //���� �Է°��� ���� ��´���
        System.out.println(year+" �� "+month+" �� ");
        System.out.println("��"+"\t"+"��"+"\t"+"ȭ"+"\t"+"��"+"\t"+"��"+"\t"+"��"+"\t"+"��"+"\t");

        //���⵵ �ѳ� �� ���ϴ� �˰���
        int day=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
        
        //���޿� ���Ͽ� ����ϴ� ���� (����� ��� ���)
        int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0&&year%100!=0)||(year%400==0)) {
           lastday[1]=29;
        }else {
           lastday[1]=28;
        }
        
        for(int i=0;i<month-1;i++) {
        day+=lastday[i];
        System.out.println(day);
        }
        //1�� �����ϴ� ���� ���ϴ� ����
        day++;
        days=day%7;
        
        //��´ܰ�
        System.out.println();
        //i�� last�迭�� -1��ŭ �����µ�
        for(int i=1;i<=lastday[month-1];i++) {
           //i���� 1�� �ð�� ���� �Ͽ� �� ������ ����� ����
           if(i==1) {
              for(int j=0;j<days;j++) {
                 System.out.print("\t");
              }
           }
           //if ���� ����Ͽ� 1���� ���ڸ� ����ϰ� days�� ���ϰ� �ϸ� ���� days�� 6���� ��µǸ� ���� ������ ���� ����
           System.out.print(i+"\t");
           days++;
           if(days>6) {
              days=0;
              System.out.println();
            
           }
        }
        }
        
        
     

  }