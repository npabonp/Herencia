
package EJherencia2;

/**
 * Hacer una app que tenga tres clases:
 * persona estudiante y profesor, las clases estudiante y profesor
 * deben heredar de la clase persona.
 * 
 * La app debe pedir por pantalla los datos para crear un objeto de la 
 * clase estudiante, incluyendo que profesor tiene asignado.
 * 
 * Se sabe que un estudiante tiene asignado por semestre una materia
 * cuatro notas y un profdesor.
 * Por cada estudiante ingresado se debe mostrar en pantalla el promedio
 * la materia que cursa, el profersor asignado y la direccion y telef
 * tanto del estudiante como del profesor
 */
public class Main {
    public static void main(String[] args) {
    java.util.Scanner teclado = new java.util.Scanner(System.in);
    
    
    System.out.println("Ingrese nombre del estudiante =");
    String nomb1 = teclado.next();
    System.out.println("Ingrese apellido del estudiante");
    String apel1 = teclado.next();
    System.out.println("Ingrese telefono del estudiante");
    int tel1 = teclado.nextInt();    
    System.out.println("Ingrese direccion del estudiante");
    String dir1 = teclado.next();    
    System.out.println("Ingrese la materia que cursa el estudiante");
    String mat1 = teclado.next();
    System.out.println("Ingrese, separadas por enter las notas del estudiante");
    double n1 = teclado.nextDouble();
    double n2 = teclado.nextDouble();
    double n3 = teclado.nextDouble();
    double n4 = teclado.nextDouble();
    System.out.println("Ingrese el nombre del profesor");
    String nomb2 = teclado.next();
    System.out.println("Ingrese apellido del profesor");
    String apel2 = teclado.next();
    System.out.println("Ingrese telefono del profesor");
    int tel2 = teclado.nextInt();    
    System.out.println("Ingrese direccion del profesor");
    String dir2 = teclado.next();
    
    Profesor p1 = new Profesor ("nomb2","apel2",tel2,"dir2");
    Estudiante e1 = new Estudiante ("mat1",p1,"nomb1","apel1",tel1,"dir1");
    
    
    
    
   
    }
}
