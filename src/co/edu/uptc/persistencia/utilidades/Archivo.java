package co.edu.uptc.persistencia.utilidades;

import co.edu.uptc.logica.modelo.Comprador;
import co.edu.uptc.logica.modelo.Equipos;
import co.edu.uptc.logica.modelo.Factura;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo {
    public ArrayList<Equipos> leerCsvEquipos(){
        ArrayList<Equipos>equipos = new ArrayList<>();
        Path filePath = Paths.get("Archivos/datosEquipo.csv");

        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null){

                String arreglo [] = linea.split(",");

                Equipos eq = new Equipos();
                eq.setID(Integer.parseInt(arreglo[0]));
                eq.setMarca(arreglo[1]);
                eq.setReferencia(arreglo[2]);
                eq.setValor(Double.parseDouble(arreglo[3]));

                equipos.add(eq);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Equipos a: equipos){
            System.out.println(a);
        }
        return equipos;
    }

    public ArrayList<Comprador>  leerCsvPersonas(){
        ArrayList<Comprador> comprador = new ArrayList<>();
        Path filePath = Paths.get("Archivos/DatosPersona.csv");

        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null){

                String arreglo [] = linea.split(",");

                Comprador com = new Comprador();
                com.setID(Integer.parseInt(arreglo[0]));
                com.setNombre(arreglo[1]);
                com.setEdad(Integer.parseInt(arreglo[2]));

                comprador.add(com);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Comprador a: comprador){
            System.out.println(a);
        }
    return comprador;
    }

    public ArrayList<Factura> leerCsvFactura(){
        ArrayList<Factura>factura = new ArrayList<>();
        Path filePath = Paths.get("Archivos/DATOS_EQUIPOS.csv");

        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null){

                String arr[] = linea.split(",");

                Factura fac = new Factura();
                fac.setId(Integer.parseInt(arr[0]));
                fac.setDocumento(Integer.parseInt(arr[1]));
                fac.setEdad(Integer.parseInt(arr[2]));
                fac.setIdEquipo(arr[3]);
                fac.setMarca(arr[4]);
                fac.setReferencia(arr[5]);
                fac.setFecha(LocalDate.parse(arr[6]));
                fac.setValor(Double.parseDouble(arr[7]));
                factura.add(fac);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Factura a: factura){
            System.out.println(a);
        }
        return factura;

    }

    public void escribirEquipos(ArrayList<Equipos> equipo){
        File archivo = new File("Archivos/datosEquipo.csv");
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);

            for(Equipos a:equipo){
                String linea = a.getID()+","+a.getMarca()+","+a.getReferencia()+","+a.getValor();
                pw.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fichero != null){
                    fichero.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public void escribirComprador(ArrayList<Comprador> comprador){
        File archivo = new File("Archivos/DatosPersona.csv");
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            for(Comprador a:comprador){
                String linea = a.getID()+","+a.getNombre()+","+a.getEdad();
                pw.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fichero != null){
                    fichero.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

    public void escribirFactura(ArrayList<Factura>facturas){
        File archivo = new File("Archivos/DATOS_EQUIPOS.csv");
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            for(Factura a:facturas){
                String linea = a.getId()+","+a.getDocumento()+","+a.getEdad()+","+a.getIdEquipo()+","+a.getMarca()+","+a.getReferencia()+","+a.getFecha()+","+a.getValor();
                pw.println(linea);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fichero != null){
                    fichero.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
