/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJherencia;

public class Programador extends Empleado{
 protected int lineas_x_hora;
 protected String lenguaje;

    public Programador(int lineas_x_hora, String lenguaje, String nombre, int edad, String estado_civil, double salario) {
        super(nombre, edad, estado_civil, salario);
        this.lineas_x_hora = lineas_x_hora;
        this.lenguaje = lenguaje;
    }

    public int getLineas_x_hora() {
        return lineas_x_hora;
    }

    public void setLineas_x_hora(int lineas_x_hora) {
        this.lineas_x_hora = lineas_x_hora;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public String toString() {
       //el super.toString esta invocando el string del papa
        return "Programador{" + "lineas_x_hora=" + lineas_x_hora + ", lenguaje=" + lenguaje + '}'+super.toString();
    }
 
                 
}
