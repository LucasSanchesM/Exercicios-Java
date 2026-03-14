/*
8. Faça um programa que receba como entrada um valor inteiro e apresente como resultado o seu fatorial.
*/

import java.util.Scanner;
public class Fatorial {
		private int num;
		private Scanner s;
		private int fatorial;
		
		public Fatorial(){
			//inicializando atributos, num eh incializado com -1 para garantir funcionamento correto do metodo entrada
			num=-1;
			fatorial=1;			
		}
		public void entrada(){
				System.out.println("\nInforme o numero: ");
				s = new Scanner(System.in);
				while(num<0){
					//coleta de numero com while para garantia de numeri valido
					num = s.nextInt();
					if(num<0){
						System.out.println("\nNumero invalido, precisa ser um valor positivo. Informe outro: ");
					}
				}			
		}
				
		public void calcular(){
				//loop com contador i para multiplicacao no atributo fatorial, 
				//o loop ira encerrar-se assim que atingir o numero informado pelo usuario
				for(int i=1; i<=num; i++){
					fatorial*=i;
				}			
		}
				
				
		public void imprimir(){
			//impressao de resultado armazenado no atributo fatorial
			System.out.printf("\nO fatorial de %d eh igual a: %d", num, fatorial);
		}
}
