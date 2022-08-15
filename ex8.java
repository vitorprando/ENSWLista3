package com.mycompany.enswlista3;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Os n�meros �mpares entre 1 e 50 s�o");
        for (int n = 1; n <= 50; n++) {
            if ((n % 2) == 1) {
                System.out.println(n);
            }
        }
    }
}