package co.edu.uptc.logica.modelo;

public class Comprador {

    private int ID;
    private String Nombre;
    private int Edad;
    public Comprador(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

/*    @Override
    public String toString() {
        return "Comprador{" +
                "ID=" + ID +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                '}';
    }*/
}
