public class Alumno {
    String nombre;   // ATRIBUTOS
    int matricula;   // ATRIBUTOS

    public Alumno(String nombreA, int matriculaA){  // CONSTRUCTOR
        this.nombre=nombreA;   // ASIGNACIÓN DE VALORES A LOS ATRIBUTOS DE LA CLASE
        this.matricula=matriculaA;
    }
    public String getNombre(){
        return nombre;
    }
    public int getMatricula(){
        return matricula;
    }
}