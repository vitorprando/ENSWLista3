package com.mycompany.enswlista3;

public class Ex04 {
    public static void main(String[] args) {
        int anos = 0;
        float n1 = 80000 , n2 = 200000;
        while  (n1 <= n2){
            n1 = (float) (n1 * 0.03);
            n2 = (float) (n2 * 0.015);
            anos = (int) (anos + 1);
        }
        System.out.println("O pa�s A iguala ou ultrapassa o B em " + anos + " anos!");
    }
}