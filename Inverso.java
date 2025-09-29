package org.example;
import java.util.Scanner;
public class Inverso {

    static int invertir(int i, int cociente){
        if(i == 0){
            return cociente;
        }else{
            int residuo = i % 10;
            cociente = cociente * 10 + residuo;
            return invertir(i / 10,cociente);
        }
    }

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);
        int numero = valor.nextInt();
        int resultado = invertir(numero,0);
        System.out.print(String.format("%s → %s",numero,resultado));

    }
}