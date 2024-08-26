package ejercicios_sesion2;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class EJERCICIO2 {
    public static void main(String[]args){
        String alumno;
        double num1,num2,suma,resta,raiz1,raiz2,sumaraiz,seno;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.###");
        System.out.print("Alumno : ");
        alumno=lectura.next();
        System.out.print("Ingrese primer numero: ");
        num1=lectura.nextDouble();
        System.out.print("Ingreso segundo numero: ");
        num2=lectura.nextDouble();
        suma=num1+num2;
        resta=num1-num2;
        raiz1=Math.sqrt(suma);
        raiz2=Math.sqrt(resta);
        sumaraiz=raiz1+raiz2;
        seno=Math.sin(sumaraiz);
        
        System.out.println("L resultado del ejercicio es : "+formato.format(seno));
        //fin de metodo
        //fin de proyecto
        
        
        
        
    }
    
}
