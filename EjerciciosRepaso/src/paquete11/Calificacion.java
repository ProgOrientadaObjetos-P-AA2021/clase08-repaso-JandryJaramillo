package paquete11;

public class Calificacion {

    private double nota;
    private String nombreMateria;
    private Profesor profesor;

    public Calificacion(double n, String nombre) {
        //nota = 0; la nota debe ser = n, si no al final las notas son todas 0
        nota = n;
        nombreMateria = nombre;
        
    }

    public void establecerNota(double n) {
        nota = n;
    }

    public void establecerNombreMateria(String n) {
        nombreMateria = n;
    }
    
    public void establecerProfesor(Profesor n) {//Aqui se debe poner que el tipo
        //de dato sea de tipo Profesor y no String
        profesor = n;
    }

    public double obtenerNota() {
        return nota;
    }

    public String obtenerNombreMateria() {
        return nombreMateria;
    }
    
    public Profesor obtenerProfesor() {
        return profesor;
    }

}
