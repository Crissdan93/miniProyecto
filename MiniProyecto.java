package MiniProyecto;

import java.util.Scanner;

public class MiniProyecto {
    public static void main(String[] args) {
       
        Empleado empleado = new Empleado();
        
        
        empleado.listadeEmpleados();
        
      
        empleado.imprimirListaNombres();
        
        
        Empresa empresa = new Empresa(empleado);
        
       
        empresa.despedirEmpleado("Cristian Mendoza");
        
       
        SalarioEmpleado salarioEmpleado = new SalarioEmpleado(empleado);
     

        
        empleado.imprimirListaNombresYSalarios();
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado a buscar:");
        String nombreEmpleado = sc.nextLine().trim();
        salarioEmpleado.aumentarSalario(nombreEmpleado, 15);

        
        empleado.imprimirListaNombresYSalarios();
    }
}

// Aqui llamo a todas las clases y metodos pero genero una instamcia de a clase Scanner para solicitar el nombre del empleado al que quiero que se le de un aumento