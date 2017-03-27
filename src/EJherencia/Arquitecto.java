/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJherencia;

public class Arquitecto extends Empleado {
   protected int cant_proyectos;

    public Arquitecto(int cant_proyectos, String nombre, int edad, String estado_civil, double salario) {
        super(nombre, edad, estado_civil, salario);
        this.cant_proyectos = cant_proyectos;
    }

    public int getCant_proyectos() {
        return cant_proyectos;
    }

    public void setCant_proyectos(int cant_proyectos) {
        this.cant_proyectos = cant_proyectos;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "cant_proyectos=" + cant_proyectos + '}'+super.toString();
    }
     
}
