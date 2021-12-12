package co.edu.uptc.presentacion;
import co.edu.uptc.logica.control.DaoControl;
import co.edu.uptc.logica.modelo.Comprador;
import co.edu.uptc.logica.modelo.Equipos;
import co.edu.uptc.logica.modelo.Factura;
import co.edu.uptc.persistencia.utilidades.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        System.out.println("FUNCIONAL "+ LocalDate.now());
    Consola consola = new Consola();
    consola.menu();
    /*    DaoControl a = new DaoControl();
        System.out.println(a.buscarComprador(0));
        System.out.println(a.buscarEquipos(6));
        System.out.println(a.comprar(1,1));*/

/*
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
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        ArrayList<Factura> facturas = ar.leerCsvFactura();
        Factura f = new Factura();
        f.setId(1);
        f.setDocumento(10075);
        f.setEdad(22);
        f.setIdEquipo("okj");
        f.setMarca("moto");
        f.setReferencia("ok");
        f.setFecha(LocalDate.now());
        f.setValor(30);
        facturas.add(f);
        ar.escribirFactura(facturas);
*/

    }
}
