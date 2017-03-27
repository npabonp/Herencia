/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJherencia;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado ("Jenny",17,"Casada",3000);
        Programador p1 = new Programador (5,"Java","Juan",19,"Soltero",340000);
        Director d1 = new Director (10,"Natalia",17,"Soltera",3600000);
        Empresa empresa = new Empresa();
        empresa.adicionarEmpleado(e1);
        empresa.adicionarEmpleado(p1);
        empresa.adicionarEmpleado(d1);
        empresa.imprimirEmpleados();
        
    }
}
