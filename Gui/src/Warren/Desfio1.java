package Warren;

import java.util.Scanner;

public class Desfio1 {
			public static void main(String[] args) {
				int j=0;
				int result=0;
				while(j<1000000) {
				Integer a = new Integer(j);
				String b = a.toString();
				String c = "";
				for (int i=b.length(); i > 0; i--) {
					c += b.substring(i - 1, i);
				}
				 int da= Integer.parseInt(c);
				 if(j%10!=0)
				 {
				 if(j>10 && da>10)
				 {
				 result=j+da;
				 if(result%2!=0){
				System.out.println("A soma de " + j + " + " + da + " é "+ result);
			j++;
				 }
				 else
				 {
					 j++;
				 }
					 }
					 else
					 {
						 j++;
					 }
				 
				 }
				 else
				 {
					 j++;
				 }
				
				 }
				 
			}
}


			
		