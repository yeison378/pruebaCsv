package co.edu.uptc.presentacion;
import co.edu.uptc.logica.modelo.Comprador;
import co.edu.uptc.logica.modelo.Equipos;
import co.edu.uptc.persistencia.utilidades.*;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        System.out.println("FUNCIONAL");
        Archivo ar = new Archivo();

        ArrayList<Equipos> equi = ar.leerCsvEquipos();
        Equipos equipo = new Equipos();
        equipo.setID(1);
        equipo.setReferencia("a");
        equipo.setMarca("b");
        equipo.setValor((double) 9);
        equi.add(equipo);
        ar.escribirEquipos(equi);
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        ArrayList<Comprador> comp = ar.leerCsvPersonas();
        Comprador comprador = new Comprador();
        comprador.setID(1);
        comprador.setNombre("juan");
        comprador.setEdad(27);
        comp.add(comprador);
        ar.escribirComprador(comp);
    }
}
