import java.util.Scanner;

public class Numero {
	private int num;
	private Scanner s;
	
	public Numero(){
		//inicializar atributo
		num=0;
	}
	
	
	public void entrada(){
		s = new Scanner(System.in);
		System.out.println("\nInforme um numero: ");
		while(num<1){
			//coleta de numero com loop para garantir valor valido
			num=s.nextInt();
			if(num<1){
				System.out.println("O algarismo precisa ser maior que 1 para ser primo");
			}
		}
	}
	
	public void VerificarP(){
		//variavel divisores contabiliza quantos divisores o numero tem
		int divisores=0;
		for(int cont=1; cont<=num; cont++){
			//sera verificado se todos os numeros, a partir do 1, ate o numero informado pelo usuario sao divisiveis pelo numero informado pelo usuario
			if(num%cont==0){
				//se o numero informado pelo usuario dividido pelo numero do contador tiver resto zero, sera contabilizado +1 divisor
				divisores++;
			}
		}//fim do loop
		
		//se a quantidade de divisores for exatamente 2, o numero sera informado como primo
		if(divisores==2){
			System.out.printf("Sim, o numero %d, eh um numero primo", num);
		}
		//caso contrario, sera informado como nao primo
		else{
			System.out.printf("Nao, o numero %d, nao eh um numero primo", num);
		}
	}
	
}

//sugestao de melhoria
//1-Nao ha nenhum numero (fora o proprio numero), que tenha mais da
//metade do valor do algarismo e seja divisivel sem resto, logo no loop 
//eh possivel dividir o trabalho pela metade durante a verificacao de 
//divisores

public class Main {
	public static void main(String[] args) {
		Numero num = new Numero();
		num.entrada();
		num.VerificarP();
	}
}
