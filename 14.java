
//14. Faça um programa que solicite ao usuário 5 números e apresente
//como saída: o maior e o menor.


import java.util.Scanner;
public class Numero {
    //definir atributos
    private Scanner s;
    private int[] numeros;
    private int maior;
    private int menor;
    
    public Numero(){
        //inicializacao de array
        numeros= new int[5];
        
        //inicializacao com menor valor possivel para o maior e o inverso para o menor
        maior= Integer.MIN_VALUE;
        menor= Integer.MAX_VALUE;
    }
    
    
    public void entrada(){
        //configuracao do scanner
        s = new Scanner(System.in);
        
        //registro de entrada no array de numeros
        for(int i=0; i<5; i++){
            System.out.println("Informe um numero");
            numeros[i]= s.nextInt();
        }
    }
    
    
    public void calculo(){
        for(int i=0; i<5; i++){
            //verificacao de maior
            if (numeros[i]>maior){
                maior= numeros[i];
            }
        }
        
        for(int i=0; i<5; i++){
            //vericacao de menor
            if (numeros[i]<menor){
                menor= numeros[i];
            }
        }
    }
    
    
    public void imprimir(){
        //exibe o menor e o maior valor
        System.out.printf("\nO menor valor eh: %d", menor); 
        System.out.printf("\nO maior valor eh: %d", maior);
    }
    
    
}


public class Main {
	public static void main(String[] args) {
		Numero novoNumero= new Numero();
        novoNumero.entrada();
        novoNumero.calculo();
        novoNumero.imprimir();
	}
}

