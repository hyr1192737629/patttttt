package pat_BasicLevel;

import java.util.Scanner;

public class N1010 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String []str=in.nextLine().split(" ");
		String fin ="";
		for(int i=0;i<str.length;i+=2) {
			str [i]=(Integer.parseInt(str[i+1])==0?"0":Integer.parseInt(str[i])*Integer.parseInt(str[i+1])).toString();
			str [i+1]=(Integer.parseInt(str[i+1])==0?"0":Integer.parseInt(str[i+1])-1).toString();
		}
		for(int i=0;i<str.length;i++) {
			fin+=str[i]+" ";
		}
		System.out.print(str.length==0?"0 0":fin.trim());
		in.close();
	}

}
