/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJherencia2;

public class Estudiante extends Persona {
    protected String materia;
    protected double [] notas = new double [4];
    protected Profesor profesor;

    public Estudiante(String materia, Profesor profesor, String nombre, String apellido, int telefono, String direccion) {
        super(nombre, apellido, telefono, direccion);
        this.materia = materia;
        this.profesor = profesor;
    }
    
    public double promedio(){
        for (int i = 0; i < 5; i++) {
            double promedio = this.getNotas()[i]
            promedio += promedio;
            }
       return promedio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "materia=" + materia + ", notas=" + notas + ", profesor=" + profesor + '}';
    }
    
    
    
}
