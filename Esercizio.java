package main;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
public class main {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		Random random=new Random();
		int n;
		int x;
		int i=0;
		int n1,n2;
		n1=0;
		n2=0;
		System.out.println("inserisci i numeri da genrare");
		n=in.nextInt();
		int []  D =new int [n];
		int [] P= new int [n];
		while(i<n) {
			x=random.nextInt(n*10)+1;
			if(x%2==0) {
				P[n2]=x;
				++n2;
				
			}else {
				D[n1]=x;
				++n1;
			}
		}

	}

}