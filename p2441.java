package ����;

import java.util.Scanner;

public class p2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner star=new Scanner(System.in);
				int n;
				n=star.nextInt();
				
				for(int i=0; i<n; i++) {    //������ �þ�� ��
					for(int j=1; j<=i; j++) { //������ �þ�� ������
					    System.out.print(" ");
				}
				    for(int k=n; k>i; k--) {
					    System.out.print("*");
					}
				System.out.println();  //�ٹٲ�
				}
			}
		}
for(int i=1; i<=n; i++)// �־ȵɱ�

