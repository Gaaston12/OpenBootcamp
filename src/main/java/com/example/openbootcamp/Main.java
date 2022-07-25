package com.example.openbootcamp;

/*Primera parte
        Crear una función con tres parámetros que sean números que se suman entre sí.
        Llamar a la función en el main y darle valores.
  Segunda parte:
        Crear una clase coche.
        Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        Una función que incremente el número de puertas que tiene el coche.
        Crear un objeto miCoche en el main y añadirle una puerta.
        Mostrar el número de puertas que tiene el objeto.*/
public class Main {

    public static void main(String[] args) {
        int param1 = 1 ;
        int param2 = 2;
        int param3 = 3;

        int sumResult = sum(param1, param2, param3);
        System.out.println(sumResult);
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
