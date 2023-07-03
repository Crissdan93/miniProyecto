package MiniProyecto;

import java.util.Scanner;

public class Empleado {
    private String[] nombres;
    private double[] salarios;
    
    public Empleado() {
        nombres = new String[9];
        salarios = new double[9];
    }
    
    public double[] getSalarios() {
        return salarios;
    }

    public void listadeEmpleados() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingresa el nombre del empleado " + (i + 1) + ":");
            nombres[i] = sc.nextLine().trim();
        }
    }

    public String[] getNombres() {
        return nombres;
    }
    
    public void imprimirListaNombres() {
        System.out.println("Lista de nombres de empleados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
    
    public void imprimirListaNombresYSalarios() {
        System.out.println("Lista de nombres y salarios de empleados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - Salario: " + salarios[i]);
        }
    }
}


/* Hola hermano en este archivo generé la clae empleado para ingresar los nombres de los empleados utlizando un arreglo llamado nombres 
y para imprimirlo utilicé un ciclo for para ingresar los numeros.



*/