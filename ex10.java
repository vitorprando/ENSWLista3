package com.mycompany.enswlista3;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1, n2, soma;
        System.out.print("Digite dois numeros inteiros: ");
        n1 = (int) sc.nextInt();
        n2 = (int) sc.nextInt();
        int menorNumero = 0;
        if (n1 < n2)
            menorNumero = n1;
        else
            menorNumero = n2;
        int diferenca = Math.abs(n1 - n2);
        for (int i = 1; i < diferenca; i++)
            System.out.print(menorNumero + i + " ");
        soma = (int) (menorNumero + diferenca);
        System.out.println(soma + "");
    }
}