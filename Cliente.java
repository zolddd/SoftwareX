package SoftwareX;
import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String postres []={"Pay de Manzana", "Cheesecake de Chocolate","Muffin","Roles de canela"};
    private String ingre []={"huevo,leche,manzana,vainilla","mantequilla,huevo,leche,chocolate,azucar","huevo,leche,canela,harina,vainilla"};


    public Cliente(String nombre, int cantidad){
        //constructor
        this.nombre=nombre;
    }

    public void folio(){
        int A []= new int[10];
        for(int i=0; i<9; i++){
            A[i]=(int)(Math.random()*10+0);
            System.out.println("Arreglo"+i+"----->"+A[i]);
        }
    }
    public void setPostres(){
        for(String i=0; i< postres.length; i++){}
    }
    private String getNombre(){
        //el get es para acceder al nombre porque es atributo privado
        return this.nombre;
        //retorna el nombre del objecto
    }
    public void mostrarTicket(){
        //muestra el tickeg
        System.out.println("===============================");
        System.out.println("COMPROBANTE DE "+getNombre());
        System.out.println("===============================");
        for (int i=0; i<postres.length; i++){
            System.out.println(postres[i]);
        }
    }

}
