package co.edu.uptc.logica.modelo;

public class Equipos {
    private int ID;
    private String Marca;
    private String Referencia;
    private double Valor;

    public Equipos(){

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String referencia) {
        Referencia = referencia;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "ID=" + ID +
                ", Marca='" + Marca + '\'' +
                ", Referencia='" + Referencia + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}
