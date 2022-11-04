package com.company;

public class Bucle {

    public static void main(String[] args) {

        String[] texto = {"Este", "es", "un", "texto", "de", "prueba"};

        String frase = "";
        for (int i = 0; i < texto.length; i++) {
            frase += texto[i] + " ";
        }
        System.out.println(frase);
    }
}
