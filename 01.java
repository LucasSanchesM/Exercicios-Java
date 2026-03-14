//1. Faça um programa que receba o salário de um funcionário (número real), calcule e mostre o novo salário, adicionando um aumento de 25%. 

import java.util.Scanner;

public class Salario {
    private double salario; 
    private String funcionario;
    private double nsalario;
    private Scanner s;
    public Salario(){
        //inicializar variaveis
        salario=0;
        nsalario=0;
    }
    
    public void entrada(){
         s = new Scanner(System.in);
         System.out.println("Informe o nome do funcionario");
         //coleta de nome do usuario
         funcionario = s.nextLine();
         System.out.println("\nInfomre o salario: ");
         //coleta de valor do salario
         salario = s.nextDouble();
    }
    public void atualizar(){
        //cadastro de novo salario como nsalario
        nsalario= (salario*0.25)+salario;
    }
    public void imprimir(){
        //impressao de novo salario
        System.out.printf("Funcionario: %s", funcionario);
        System.out.printf("\nO novo salario sera de: %.2f", nsalario);
    }
    
}

public class Exercicio01 {

    public static void main(String[] args) {
        Salario novoSalario= new Salario();
        novoSalario.entrada();
        novoSalario.atualizar();
        novoSalario.imprimir();
    }
   
}
