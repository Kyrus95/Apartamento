package com.ejemplo.Kyosuke;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad maxima de apartamentos: ");
        int NumApartamento = teclado.nextInt();
        System.out.println("Ingrese el valor de alquiler mensual del apartamento: ");
        int ValorAlquiler = teclado.nextInt();
        System.out.println("Ingrese el valor del incremento por cada unidad desocupada: ");
        int Incremento = teclado.nextInt();
        System.out.println("Ingrese el valor del mantenimiento mensual del apartamento: ");
        int CostoMantenimiento = teclado.nextInt();
        int Ganancia = (NumApartamento * ValorAlquiler) - (NumApartamento * CostoMantenimiento);
        int GananciaMaxima = Ganancia + 1;
        while (Ganancia < GananciaMaxima){
            Ganancia = GananciaMaxima;
            ValorAlquiler += Incremento;
            NumApartamento--;
            GananciaMaxima = (NumApartamento * ValorAlquiler) - (NumApartamento * CostoMantenimiento);
        }
        System.out.println("Numero de apartamentos ocupados necesesarios para adquirir maxima ganancia: "+(NumApartamento+1));
        System.out.println("Ganancia Maxima: "+Ganancia);
    }
}
