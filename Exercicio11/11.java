import java.util.Scanner;
public class Cprimo {
	
	private int num;
	private Scanner s;
	
	public Cprimo(){
		//inicializar atributo
		num=0;
	}
	
	
	public void entrada(){
		s = new Scanner(System.in);
		while(num<1){
			//coleta de numero limite com um loop para garantir que seja positivo
			System.out.println("\nInforme um numero para limite:");
			num= s.nextInt();
			if(num<1){
				System.out.println("\nNumero invalido! ");
			}
		}
	}
	
	public void exibirprimos(){
		System.out.printf("\nOs numeros primos tendo como limite %d, sao: ", num);
		
		//a variavel divisores ira armazenar a quantidade de divisores de um numero
		int divisores=0;
		for(int i=1; i<=num; i++){
			//a variavel i passara por cada numero ate o informado pelo usuario
			for(int c=1; c<=i; c++){
				//a cada numero i, este loop ira contabilizar quantos divisores este numero possui, para isso tera um contador chamado c
				if(i%c==0){
					//se o numero i dividido pelo contador c tiver resto 0 eh contabilizada +1 divisor
					divisores++;
				}
			}
			
			if(divisores==2){
				//se no fim do segundo loop, a variavel divisores for igual a 2 (numero primo), ira imprimi-lo
				System.out.printf("%d  ", i);
			}
			
	    //a variavel eh reiniciada para contabilizar os divisores do proximo numero i
		divisores=0;
	}
	
	}
}



public class Main {
	public static void main(String[] args) {
		Cprimo novoP= new Cprimo();
		
		novoP.entrada();
		novoP.exibirprimos();
	}
}
