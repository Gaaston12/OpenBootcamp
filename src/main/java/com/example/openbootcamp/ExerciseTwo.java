package com.example.openbootcamp;

/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:
    Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
    el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.

    Para el bucle Do While, deberás crear la misma estructura que en el While,
    pero solo se debe ejecutar una vez.

    Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
    la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y
    deberá mostrarse por pantalla.

    Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
    estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
    consola informando de la estación en la que está. También habrá que poner un default para cuando el
    valor de la variable no sea una estación.*/
public class ExerciseTwo {
    public static void main(String[] args) {
        // first part
        System.out.println("-------------------First Part---------------------");
        int numberIf = 0;
        if (numberIf > 0) {
            System.out.println("Number " + numberIf + " is positive.");
        } else if (numberIf < 0) {
            System.out.println("Number " + numberIf + " is negative.");
        } else {
            System.out.println("Number " + numberIf + " is equeals to 0.");
        }

        // second Part
        System.out.println("-------------------Second Part---------------------");
        int numberWhile = 0;
        while (numberWhile < 3) {
            System.out.println("Value of numberWhile id: " + numberWhile);
            numberWhile++;
        }
        int doWhileNumber = 0;
        do {
            System.out.println("Value of doWhileNumber id: " + doWhileNumber);
            doWhileNumber++;
        } while (doWhileNumber < 1);

        int numberFor = 3;
        for (int i = 0; i <= numberFor; i++) {
            System.out.println("Value of numberFor id: " + i);
        }

        // Third Part
        System.out.println("-------------------Third Part---------------------");
        String season = "sumer";

        switch (season){
            case "sumer":
                System.out.println("The Season is SUMER!!!");
                break;
            case "autumn":
                System.out.println("The season is AUTUMN!!!");
                break;
            case "winter":
                System.out.println("The season is WINTER!!!");
                break;
            case "spring":
                System.out.println("The season is SPRING!!!");
                break;
            default:
                System.out.println("This season does not exist");
        }
    }
}
