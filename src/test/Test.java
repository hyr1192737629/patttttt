package test;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        boolean print_blank=false;//�ж��Ƿ�����ӿո�
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int ratio=sc.nextInt();
            int index=sc.nextInt();
            System.out.print(ratio+","+index);
            if (ratio*index!=0) {//�����������ʽ�������ϵ����ָ��
                if(print_blank)
                {
                    System.out.print(" ");  
                }else { 
                    print_blank=true;  
                }
                System.out.print(ratio*index+" "+(index-1));
            }
        }
        if (print_blank==false) {//�����������print_blank����false˵���������һ��Ҳû�����У�һ�������0 0
            System.out.println("0 0");
        }
        //���
        sc.close();
    }

}