/*
7. Construa um programa que exiba a tabuada de 1 até N, onde N é o número informado pelo usuário. 
*/
import java.util.Scanner;

public class Tabuada {
	private Scanner s;
	private int n;
	
	public Tabuada(){
    //inicializar variavel
		n=0;		
	}
	
	public void entrada(){
		s = new Scanner(System.in);
		System.out.printf("\nInsira o numero para tabuada:");
		while(n<1){
      //coleta do valor de n com loop while para garantir que seja n > 0
			n= s.nextInt();
			if(n<1){
				System.out.printf("\nNumero invalido, somente numeros acima de 0");
			}
		}
	}
	public void exibirTabuada(){
		for(int i=1; i<=n;  i++){
			System.out.printf("\n**Tabuda do %d**\n", i);
            //exibicao de tabuada, o loop maior servira como multiplicando, 
            //ele atualizara ate o valor de n
			for(int e=1;e<=10; e++){			
                //o loop menor é o multiplicador, ele que de fato fara o processo 
                //(levando em conta o valor do loop maior), indo no máximo até 10
				System.out.printf("\n%dx%d=%d", i, e, e*i);
			}
           //pular linha para organização entre valores de i
			System.out.printf("\n");
		}
	}

}
