package com.example.openbootcamp;

/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad,
el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona? (creo que quisieron poner cliente),
y con una variable salario que solo tenga la clase Trabajador.
 */
public class ExerciseFour {
    public static void main(String[] args) {
        //first part
        System.out.println("-----------------First Part----------------");
        Client client = new Client();

        client.setAge(23);
        client.setName("Client name");
        client.setPhone(2336493968L);
        client.setCredit(2000);

        System.out.println("The name of this client is " + client.getName());
        System.out.println("And he is " + client.getAge() + " yeas old");
        System.out.println("His phone number is " + client.getPhone());
        System.out.println("This client has: " + client.getCredit() + " credit");

        //Second part
        System.out.println("-----------------Second Part----------------");
        Employee employee = new Employee();

        employee.setAge(23);
        employee.setName("employee name");
        employee.setPhone(2336493968L);
        employee.setCredit(2000);
        employee.setSalary(4000);

        System.out.println("The name of this client is " + employee.getName());
        System.out.println("And he is " + employee.getAge() + " yeas old");
        System.out.println("His phone number is " + employee.getPhone());
        System.out.println("As client has: " + employee.getCredit() + " credit");
        System.out.println("The salary of this employee is " + employee.getSalary());


    }
}

// Extend from Person class from previous Execercise (3)
class Client extends Person {
    int credit;

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

class Employee extends Client {
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}