import java.util.Scanner;


public class Numeros {
	private int num;
	private Scanner s;
	private int produto;
	
	public Numeros(){
		//inicializar atributo
		num=0;
		
		//o atributo produto eh inicializado com 1 para nao ocorrer multiplicacao por 0
		produto=1;
	}
	
	public void entrada(){
		s = new Scanner(System.in);
		
		//loop para garantia de entrada correta
	   while(num<1 || num>10){
	    //registro de entrada de usuario
	 	  System.out.println("\nInsira o numero");
	 	  num= s.nextInt();
	 	  if(num<1 || num>10){
	 	  	//Exibicao de problema em caso de entrada invalida
	 	  	System.out.println("\nNumero invalido, o intervalo eh entre 1 e 10");
	 	  }
	   }
	}
	
	public void exibirProdutPares(){
		for(int i=1; i<num; i++){
			//loop para coleta de todos os pares do intervalo e multiplicacao dos mesmos
			if(i%2==0){
				produto = produto*i;
			}
		}
		System.out.printf("O produto dos pares eh igual a: %d", produto);
	}
}



public class Main {
	public static void main(String[] args) {
		Numeros novoNumero= new Numeros();
		novoNumero.entrada();
		novoNumero.exibirProdutPares();
	}
}
