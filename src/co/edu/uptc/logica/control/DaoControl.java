package co.edu.uptc.logica.control;

import co.edu.uptc.logica.modelo.Comprador;
import co.edu.uptc.logica.modelo.Equipos;
import co.edu.uptc.logica.modelo.Factura;
import co.edu.uptc.persistencia.utilidades.Archivo;

import java.time.LocalDate;
import java.util.ArrayList;

public class DaoControl {
    private  Archivo archivo;
    public DaoControl(){
        archivo = new Archivo();
    }

    public Comprador buscarComprador(int id){
        ArrayList<Comprador>compradors = archivo.leerCsvPersonas();
//        System.out.println("tamaño: "+compradors.size());
        for(Comprador a: compradors){
            if(a.getID() == id){
                return a;
            }
        }
        return null;
    }

    public Equipos buscarEquipos(int id){
        ArrayList<Equipos >equipos = archivo.leerCsvEquipos();

        for(Equipos  a: equipos ){
            if(id == a.getID()){
                return a;
            }
        }
        return null;
    }

    public String comprar(int idComprador,int idEquipo){

        Comprador comprador = buscarComprador(idComprador);
        Equipos equipos = buscarEquipos(idEquipo);

        if( comprador==null && equipos == null ){
            return "No existe comprador con documento: "+idComprador+"\nNi equipo con id: "+idEquipo;
        }else if( comprador==null ){
            return "        NO existe comprador con documento: "+idComprador;
        }else if( equipos==null ){
            return "        NO esxiste equipo con id: "+idEquipo;
        }else{
            ArrayList<Factura> facturas = archivo.leerCsvFactura();
            Factura f = new Factura();
            f.setId(facturas.size());
            f.setDocumento(comprador.getID());
            f.setEdad(comprador.getEdad());
            f.setIdEquipo(equipos.getID()+"");
            f.setMarca(equipos.getMarca());
            f.setReferencia(equipos.getReferencia());
            f.setFecha(LocalDate.now());
            f.setValor(equipos.getValor());
            facturas.add(f);
            archivo.escribirFactura(facturas);
            String salida =">>>>>>>>>>> COMPRA REALIZADA CON EXITO <<<<<<<<<<<\n";
                   salida+="\n"+facturas.get(facturas.size()-1);
            return salida;
        }

    }

    public int tamagno(){
        return archivo.leerCsvFactura().size();
    }
}
