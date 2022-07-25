package com.example.openbootcamp;

public class Ejer1 {
    public static void main(String[] args) {

        //First Part
        int param1 = 1;
        int param2 = 2;
        int param3 = 3;

        int sumResult = sum(param1, param2, param3);
        System.out.println("Sum result: " + sumResult);

        //Second Part
        Car myCar = new Car();
        //add 1 door
        System.out.println("Initial amount of doors: " + myCar.amountDoors);
        myCar.addDoor();
        System.out.println("Actual amount doors: " + myCar.amountDoors);
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

class Car {
    int amountDoors = 4;

    public void addDoor() {
        this.amountDoors++;
    }
}



