package ejercicios_sesion2;
import java.awt.SystemColor;
import java.util.Scanner;
import java.lang.Math;
public class EJERICIO1 {

    public static void main(String[] args) {
        //declarar las variables
        String alumno1;
        String alumno2;
        double edad1,edad2,S,P,LOG1,LOG2;
        Scanner lectura=new Scanner(System.in);
        
        System.out.print("Nombre de primer alumno : ");
        alumno1=lectura.next();
        System.out.print("Nombre de segundo alumno :");
        alumno2=lectura.next();
        System.out.print("Ingresa la edad de alumno 1: ");
        edad1=lectura.nextDouble();
        System.out.print("ingrese la edad de alumno 2: ");
        edad2=lectura.nextDouble();
        
        S=edad1+edad2;
        P=Math.pow(edad1, edad2);
        LOG1=Math.log(edad1);
        LOG2=Math.log(edad2);
        
        System.out.println("La suma de las edades es : "+S);
        System.out.println("La potencia de la edad1 elevado a la edad2 es : "+P);
        System.out.println("El logaritmo de la edad1 es: "+LOG1);
        System.out.println("El logartitmo de la edad2 es : "+LOG2);
        
        //fin de metodo
        //fin de proyecto
              
        
        
        
    }
    
}
