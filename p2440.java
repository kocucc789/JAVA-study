package ����;

import java.util.Scanner;

public class p2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner star=new Scanner(System.in);
				int n;
				n=star.nextInt();
				
				for(int i=1; i<=n; ++i) {    //������ �þ�� ��
					for(int j=1; j<=n-i+1; ++j) { //������ �þ�� ������
					       System.out.print("*");
				}
				    System.out.println();  //�ٹٲ�
				}
			}
		}
