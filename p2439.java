package ¹éÁØ;

import java.util.Scanner;

public class p2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner star=new Scanner(System.in);
				int n;
				n=star.nextInt();
				
				for(int i=1; i<=n; i++) {    //¹ØÀ¸·Î ´Ã¾î³ª´Â ÁÙ°³¼ö
					for(int j=n-1; j>=i; j--) { //¿·À¸·Î ´Ã¾î³ª´Â ¶ç¾î¾²±â
					     System.out.print(" ");
				}
				    for(int k=1; k<=i; k++) {
					     System.out.print("*");
				}
				    System.out.println();
				}
			}
		}