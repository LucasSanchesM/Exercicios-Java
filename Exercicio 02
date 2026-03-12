//2. Faça um programa que receba a idade de um jogador classificando-o em uma das seguintes categorias: 
//infantil A = 5 - 7 anos 
//infantil B = 8-10 anos 
//juvenil A = 11-13 anos 
//juvenil B = 14-17 anos 
//adulto = maiores de 18 anos 


import java.util.Scanner;
public class Jogador {
    private String nome;
    private int idade;
    private String rank;
    private Scanner s;
    
    public Jogador(){
        //inicialização de variaveis
        nome="";
        idade=0;
        rank="";
        
    }
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("Informe o nome do jogador: ");
        //registro de nome inserido pelo usuario
        nome= s.nextLine();
        System.out.println("Informe a idade: ");
        while(idade<=4){
            //coleta de idade com loop para garantir idade valida
            idade= s.nextInt();
            if(idade<=4){
                System.out.println("Idade invalida..\n");
            }
        }
    }
    public void classificar(){
        //classificação de Jogador com base na idade
        if(idade>=5 && idade<=7){
            rank="InfantilA";
        }
        else if(idade>=8 && idade<=10){
            rank="InfantilB";
        }
        else if(idade>=11 && idade<=13){
            rank="JuvenilA";
        }
        else if(idade>=14 && idade<=17){
            rank="JuvenilB";
        }
        else{
            rank="Adulto";
        }
    }
    
    public void imprimir(){
        //impressao de valores
        System.out.printf("Nome:%s\nIdade:%d\nClassificacao:%s\n", nome, idade, rank);
    }
    
}
