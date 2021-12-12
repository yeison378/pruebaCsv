package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.DaoControl;

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
                    System.out.print("Ingrese Documento comprador: ");
                    int documento = in.nextInt();
                    System.out.print("Ingrese Id Equipo: ");
                    int idEquipo = in.nextInt();
                    System.out.println(control.comprar(documento,idEquipo));


            }

        }
    }
}
