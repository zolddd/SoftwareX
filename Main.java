package SoftwareX;
import java.util.Scanner;
public class Main {
    public static void main(String args[]){

        System.out.println("=================================");
        int opcion;
        Scanner scan= new Scanner(System.in);
        Cliente [] vectorCliente; //declarando el vector
        System.out.println("1.-Registrar Cliente ");
        System.out.println("2.-Nombres de postres participantes ");
        System.out.println("3.-Ingredientes de los postres ");
        System.out.println("4.-Buscar algun participante por folio u nombre");
        System.out.println("=================================");
        System.out.println("Eliga una opcion ");
        Scanner entrada= new Scanner(System.in);
        opcion= entrada.nextInt();
        switch (opcion){
            case 1:
                vectorCliente= new Cliente[4];
                System.out.println("Usted eligio la opcion 1");
                Cliente aux;
                Scanner va = new Scanner(System.in);


                for (int i = 0; i < vectorCliente.length; i++) {

                    System.out.print("Ingresa nombre:");
                    aux = va.next();
                    vectorCliente[i] = null;

                }

                for (int i = 0; i < vectorCliente.length; i++) {

                    System.out.println("Posicion del arreglo " + i + ": " + vectorCliente[i]);

                }

                /*vectorCliente= new Cliente[4];
                for(int i=0; i<vectorCliente.length; i++){
                    System.out.println("Ingrese Nombre: ");

                    vectorCliente[i] = entrada.next().toString();

                    a.folio();
                    //el puntito es para acceder a los metodos
                    vectorCliente[i]=a; //se guarda el alumno en el vector o arreglo
                }
                //mostrar
                for(int i=0; i<vectorCliente.length; i++){
                    vectorCliente[i].mostrarTicket();
                }*/
                break;

            case 2:
                 for (String i=0; i<postres.length; i++){

                 }
                break;
            case 3:
                break;
        }

    }
}
