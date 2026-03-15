//5. Faça um programa que solicite ao usuário a entrada de 10 números 
//inteiros e imprima como resultado a soma de todos os ímpares.

import java.util.Scanner;
public class Numeros {
	private Scanner s;
	private int[] numeros;
	private int soma;
	
	public Numeros(){
			//inicializar atributos
			numeros= new int[10];
			soma= 0;
		}
		
	public void entrada(){
		//coleta dos 10 numeros inseridos pelo usuario utilizando um loop
		s = new Scanner(System.in);
		System.out.println("\nInsira 10 numeros");
		for(int i=0; i<10; i++){
			numeros[i]=s.nextInt();			
		}		
	}
	
	public void calcularImpares(){
		for(int i=0;i<10; i++){	
			//utilização de loop para verificar se cada numero no array eh impar
			if(numeros[i]%2!=0){
				//caso seja impar, sera adicionado em soma
				soma+=numeros[i];										
			}																										
		}			
	}
	
	public void impressao(){
		//impressao do valor em soma
		System.out.printf("\nA soma dos impares eh igual a: %d", soma);						
	}			
}
