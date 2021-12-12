package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.DaoControl;
import co.edu.uptc.persistencia.utilidades.Archivo;
import com.sun.javafx.runtime.SystemProperties;

import java.util.Scanner;

public class Consola {
    private DaoControl control;
    private Scanner in;
    public Consola(){
        control = new DaoControl();
        in = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        while (opcion !=2){
            System.out.println("*********************************************************");
            System.out.println("*                    VENTA MOBIL                        *");
            System.out.println("*********************************************************");
            System.out.println("1- Comprar");
            System.out.println("2- Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = in.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("*********************************************************");
                    System.out.println("*                       COMPRAR                         *");
                    System.out.println("*********************************************************");
                    int documento = -1;
                    int idEquipo  = -1;
                    int tamaño = control.tamagno();
                    int cont = 0;
                    do{
                        if(cont != 0) System.out.println(" !!!!!!!!! PORFAVOR INGRESE DATOS VALIDOS !!!!!!!!!");
                        System.out.print("Ingrese Documento comprador: ");
                        documento = in.nextInt();
                        System.out.print("Ingrese Id Equipo: ");
                        idEquipo = in.nextInt();
                        System.out.println(control.comprar(documento,idEquipo));
                        cont++;
                    }while(tamaño == control.tamagno());
                    break;
                case 2:
                    System.out.println("EL PROGRAMA A TERMINADO SU EJECUCION");
                    break;
                default:
                    System.out.println(" !!!!!!!!!! NO ES UNA OPCION VALIDA !!!!!!!!!!");
                    break;

            }

        }
    }
}
