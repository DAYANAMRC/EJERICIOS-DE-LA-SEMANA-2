package ejercicios_sesion2;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class EJERICIO3 {
    public static void main(String[]args){
        double r,h,Acilindro,Vcilindro;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat Formato=new DecimalFormat("##.##");
        System.out.print("Ingrese el radio: ");
        r=lectura.nextDouble();
        System.out.print("ingrese la altura : ");
        h=lectura.nextDouble();
        
        Acilindro=2*Math.PI*r*(r+h);
        Vcilindro=Math.PI*Math.pow(r, 2)*h;
      
        System.out.println("el area del cilindro es : "+Formato.format(Acilindro));
        System.out.println("el volumne del cilindro es : "+Formato.format(Vcilindro));
        //fin de metodo
        //fin de proyecto       
    }   
}
