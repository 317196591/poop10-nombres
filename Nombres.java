/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombres;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Nombres {
    /** Método principal, marca error de arreglo fuera de rango */
    public static void main(String[] args) {
        String mensajes[];
        mensajes = new String[3];
        Scanner entrada = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("Ingresa el mensaje "+i);
            mensajes[i] = entrada.nextLine();
        }
        try{
            for(int j=0; j<4; j++){
                System.out.println(mensajes[j]);
            }
        }catch(ArrayIndexOutOfBoundsException aib){
            System.out.println("Error: Arreglo fuera del rango");
        }
    }
    
}
