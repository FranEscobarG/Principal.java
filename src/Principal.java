import java.util.Scanner;

public class Principal {
    static Alumno objetoAlumno;
    static Alumno[] arregloA;
    public static void main(String[]args){
        registrarAlumnos();
    }
    public static void registrarAlumnos(){
        int cantidad,mat;
        String nom;
        System.out.println("Numero de Alumnos:");
        Scanner entrada=new Scanner(System.in);
        cantidad=entrada.nextInt();
        arregloA=new Alumno[cantidad];
        for(int i=1;i<=cantidad; i++){
            System.out.println("Nombre:");
            nom=entrada.next();
            //entrada.next(); <--- Limpia la entrara-Para escribir el siguiente dato
            System.out.println("Matricula:");
            mat=entrada.nextInt();
            objetoAlumno=new Alumno(nom, mat); //SE CREA EL OBJETO CON LOS DATOS CAPTURADOS
            arregloA[i-1]=objetoAlumno; //SE GUARDA EL OBJETO EN EL ARREGLO
        }
        for(int i=1;i<=cantidad; i++){
            System.out.println(arregloA[i-1].getNombre()+"_"+arregloA[i-1].getMatricula());
            //El simbolo + es para concatenar la siguiente variable al imprimir (El "_" es como tal texto)
        }
    }
}
