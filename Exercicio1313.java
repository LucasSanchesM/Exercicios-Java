//13. Faça um programa que solicite ao usuário um número e apresente 
//como resultado a média de todos os números pares e ímpares.



import java.util.Scanner;


public class Numeros {
        private int numero;
        private Scanner s;

        public Numeros (){
                //inicializacao de atributo
                numero=0;        
        }

        public void entrada(){
                s= new Scanner(System.in);

                //Coleta de  numero 
                System.out.println("\nInforme o numero: ");
                numero= s.nextInt();
        }

        public void exibirpares(){
                //exibicao de pares ate o numero informado pelo usuario
                System.out.println("\nOs numeros pares sao:\n");
                for(int i=1; i<=numero; i++){
                        if(i%2==0){
                                System.out.printf("%d  ", i);
                        }                
                }
        }


        public void exibirimpares(){
                //exibucao de impares ate o numero informado pelo usuario
                System.out.println("\nOs numeros impares sao:\n");
                for(int i=1; i<=numero; i++){
                        if(i%2!=0){
                                System.out.printf("%d  ", i);
                        }
                }
        }        

}



public class Main {
        public static void main(String[] args) {
                Numeros novoNumero= new Numeros();
                novoNumero.entrada();
                novoNumero.exibirpares();
                novoNumero.exibirimpares();


        }


}
