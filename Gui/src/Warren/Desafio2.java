package Warren;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio2 {
	
	
	public static void main(String[] args) {
		int i=1,aula=0,aulan=0;
		System.out.println("Quantos alunos são necessários?");
		Scanner sc = new Scanner(System.in);
		int cs =sc.nextInt();
		if(cs>0)
		{
		int[] meuArray;
        meuArray = new int[cs];
        System.out.println("Quantos alunos vieram?");
        Scanner alunos = new Scanner(System.in);
        int al=alunos.nextInt();
        if(al>0)
        {
        System.out.println("Tempo de chegada?");
        while(i<=al)
        {
       
        Scanner tempo = new Scanner(System.in);
        int temp=tempo.nextInt();
        if(temp<=0)
        {
        	aula++;
        	i++;
        }
        else
        {
        i++;
        }
        }
        if(aula>=cs)
        {
        	System.out.println("Aula normal");
        }
        else
        {
        	System.out.println("Aula cancelada");
        }
        }
		else
		{
			System.out.println("Aula cancelada");
		}
		}
		else
		{
			System.out.println("Aula cancelada");
		}
    }
	}

	
