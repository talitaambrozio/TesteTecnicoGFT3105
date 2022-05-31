package Desafio02;
/*
Tipos de Triângulos
Determine se um triângulo é equilátero, isósceles ou escaleno.
Um triângulo equilátero tem os três lados com o mesmo comprimento.
Um triângulo isósceles tem pelo menos dois lados com o mesmo comprimento.
Um triângulo escaleno tem todos os lados de comprimentos diferentes.
Considere também que só irá existir um triângulo se, e somente se, os seus lados
obedeceram à seguinte regra: um de seus lados deve ser maior que o valor absoluto (módulo)
da diferença dos outros dois lados e menor que a soma dos outros dois lados.
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer l1,l2,l3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o comprimento do 1º lado:");
        l1 = entrada.nextInt();
        System.out.println("Informe o comprimento do 2º lado:");
        l2 = entrada.nextInt();
        System.out.println("Informe o comprimento do 3º lado:");
        l3 = entrada.nextInt();

        if(l3<(l1+l2) || l2<(l1+l3) ||  l1<(l2+l3) ){
            if(l1 == l2 && l1 == l3){
                System.out.println("Triângulo equilátero.");
            } else if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l1 && l2 !=l3) || (l2 == l3 && l2 != l1) || (l3 == l1 && l3 != l2) || (l3 == l2 && l3 != l1)) {
                System.out.println("Triângulo isósceles.");
            }else if(l1 != l2 && l1 != l3){
                System.out.println("Triângulo escaleno.");
            }

        }else{
            System.out.println("Não é triângulo.");
        }




    }
}
