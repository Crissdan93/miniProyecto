package MiniProyecto;

import java.util.Scanner;

public class SalarioEmpleado {
    private Empleado empleado;
    public static final double SUELDO_BASE = 2500;

    public SalarioEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void aumentarSalario(String nombre, double porcentajeAumento) {
        String[] nombres = empleado.getNombres();
        double[] salarios = empleado.getSalarios();
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null && nombres[i].equals(nombre)) {
                double salarioActual = salarios[i];
                double aumento = salarioActual * porcentajeAumento / 100;
                double nuevoSalario = salarioActual + aumento;
                salarios[i] = nuevoSalario;
                encontrado = true;
                System.out.println("Salario de " + nombre + " aumentado en " + porcentajeAumento + "%");
                System.out.println("Nuevo salario: " + nuevoSalario);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al empleado: " + nombre);
        }
    }
}

// aqui pongo la clase Salario de empleado para aumentar el 15 por ciento 