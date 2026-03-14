
//3. Faça um programa que receba a altura e o sexo de uma pessoa (M - masculino e F feminino) e calcule seu peso ideal, utilizando as seguintes fórmulas: 
//homens: (72.7*h)-58 
//mulheres: (62.1*h)-44.7 

package exercicio03;
    import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int sexo;
    private double altura;
    private double peso;
    private Scanner s;
    
    public Pessoa(){
        //inicializar variaveis
        nome="";
        sexo=0;
        peso= 0;
        altura=0;
    }
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("\nInforme o nome da pessoa: ");
        //coleta de nome
        nome= s.nextLine();
        while(sexo<1 || sexo >2){
            System.out.println("\nInforme o sexo\n1-Homem\n2-Mulher");
            sexo = s.nextInt();
            //coleta de sexo com while para garantir uma opção valida
            if (sexo>2 || sexo <1){
                System.out.println("\nOpção invalida!");
            }
        }
        //coleta de altura em metros
        System.out.println("\nDigite o a sua altura em metros: ");
        altura= s.nextDouble();
    }
    
    public void calculoPeso(){
        if(sexo==1){
            //calculo de peso para homens
            peso= (72.7*altura)-58; 
            }
        else if(sexo==2){
            //calculo de peso para mulheres
            peso= (62.1*altura)-44.7;    
            
        }      
    }
    
    public void impressao(){
        if(sexo==1){
            //impressao para homens
            System.out.printf("\nNome: %s\nSexo: Homem\nAltura: %.2fm\nPeso Ideal: %.2f\n", nome, altura, peso);
        }
        else if(sexo==2){
            //impressao para mulheres
            System.out.printf("\nNome: %s\nSexo: Mulher\nAltura: %.2fm\nPeso Ideal: %.2f\n", nome, altura, peso);

        }
   }
}


public class Exercicio03 {

    public static void main(String[] args) {
        Pessoa novaPessoa= new Pessoa();
        
        novaPessoa.entrada();
        novaPessoa.calculoPeso();
        novaPessoa.impressao();
    }
    
}
