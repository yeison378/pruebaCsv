package co.edu.uptc.logica.modelo;

import java.time.LocalDate;

public class Factura {
    private int id;
    private int documento;
    private int edad;
    private String idEquipo;
    private String marca;
    private String referencia;
    private LocalDate fecha;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", documento=" + documento +
                ", edad=" + edad +
                ", idEquipo='" + idEquipo + '\'' +
                ", marca='" + marca + '\'' +
                ", referencia='" + referencia + '\'' +
                ", fecha=" + fecha +
                ", valor=" + valor +
                '}';
    }
}
