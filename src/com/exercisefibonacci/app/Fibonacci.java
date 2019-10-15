package com.exercisefibonacci.app;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) 
	
	{
		int cont1=0;
		int cont2=1;
		int fibonacci=1;
		int bount=0;
			
			Scanner imput=new Scanner(System.in);
		do {
			System.out.println(" ¿Cuantos Fibonaccis deseas calcular? ");
			bount= imput.nextInt();
			
			if(bount<=0);
			{
				System.out.println(" debes de introducir un numero arriba de cero ");
			}
		
		
		}while(bount<=0);
		
		for(int i=0; i<bount; i++)
		{
			System.out.println(fibonacci+" ");
			fibonacci= cont1+cont2;
			cont1=cont2;
			cont2=(int) fibonacci;
		}
		
	}

}
