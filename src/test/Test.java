package test;

import java.util.Scanner;


public class Test {

    public static void main(String[] args) {

        boolean print_blank=false;//判断是否继续加空格
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int ratio=sc.nextInt();
            int index=sc.nextInt();
            System.out.print(ratio+","+index);
            if (ratio*index!=0) {//输出导数多项式非零项的系数和指数
                if(print_blank)
                {
                    System.out.print(" ");  
                }else { 
                    print_blank=true;  
                }
                System.out.print(ratio*index+" "+(index-1));
            }
        }
        if (print_blank==false) {//如果到达这里print_blank还是false说明输出部分一次也没有运行，一定是输出0 0
            System.out.println("0 0");
        }
        //输出
        sc.close();
    }

}