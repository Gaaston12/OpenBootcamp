package com.example.openbootcamp;

/*
Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
 */

public class ExerciseThree {

    public static void main(String[] args) {

        //first part
        Person man = new Person();
        man.setAge(23);
        man.setName("Gaston");
        man.setPhone(2336493968L);

        System.out.println("This is " + man.getName());
        System.out.println("And he is " + man.getAge() + " yeas old");
        System.out.println("His phone number is " + man.getPhone());

    }
}

class Person{
    private int age;
    private String name;
    private long phone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
