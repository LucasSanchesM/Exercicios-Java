/*
4. Faça um programa que calcule e mostre a área de um triângulo. Area = (base * altura) / 2. 
*/

import java.util.Scanner;

public class Triangulo {
    private double area;
    private double altura;
    private double base;
    private Scanner s;
    
   public Triangulo(){
       //inicializar atributos
       altura=0;
       base=0;
   }
    
    public void entrada(){
        s = new Scanner(System.in);
        System.out.println("\nInforme a altura do triangulo");
        //coleta de altura e base para o calculo
        altura = s.nextDouble();
        System.out.println("\nInforme o valor da base do triangulo");
        base = s.nextDouble();
    }
    
    public void calcularT(){
        //calculo de area do triangulo tendo como parametros base e altura
        area= base*altura / 2;
    }
    
    public void imprimir(){
        //impressao da area
        System.out.println("\nA area deste triangulo eh igual a: " + area);
    
    
    }
}
