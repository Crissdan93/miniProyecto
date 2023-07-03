package MiniProyecto;

import java.util.Scanner;

public class Empresa {
    private Empleado empleado;

    public Empresa(Empleado empleado) {
        this.empleado = empleado;
    }

    public void despedirEmpleado(String nombre) {
    	String[] nombres = empleado.getNombres();
        
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombre)) {
                nombres[i] = null; 
                encontrado = true;
                System.out.println("Empleado despedido: " + nombre);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró al empleado: " + nombre);
        }
    }
}



// genero la clase empresa en donde se despiden a los empleados el nombre tiene que introducirse en la clase MiniProyecto