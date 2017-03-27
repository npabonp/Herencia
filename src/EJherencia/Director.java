/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJherencia;

public class Director extends Empleado {
   protected int anos_xp;

    public Director(int años_xp, String nombre, int edad, String estado_civil, double salario) {
        super(nombre, edad, estado_civil, salario);
        this.anos_xp = años_xp;
    }

    public int getAños_xp() {
        return anos_xp;
    }

    public void setAños_xp(int años_xp) {
        this.anos_xp = años_xp;
    }

    @Override
    public String toString() {
        return "Director{" + "años_xp=" + anos_xp + '}'+super.toString();
    }
   
}
