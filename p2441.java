package 백준;

import java.util.Scanner;

public class p2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner star=new Scanner(System.in);
				int n;
				n=star.nextInt();
				
				for(int i=0; i<n; i++) {    //밑으로 늘어나는 별
					for(int j=1; j<=i; j++) { //옆으로 늘어나는 별개수
					    System.out.print(" ");
				}
				    for(int k=n; k>i; k--) {
					    System.out.print("*");
					}
				System.out.println();  //줄바꿈
				}
			}
		}
for(int i=1; i<=n; i++)// 왜안될까

