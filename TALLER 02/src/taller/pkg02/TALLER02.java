/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg02;

/**
 *
 * @author Report
 */

//importamos las clases
import java.util.Random;
import java.util.Scanner;

class Punto{
    private int x;
    private int y;
    public void setX(int x){this.x = x;}
    public void setY(int y){this.y = y;}
    public int getX(){return x ;}
    public int getY(){return y ;}
    public double CalcularDistacia(Punto p){
        int x1 = x;
        int y1 = y;
        int x2 = p.getX();
        int y2 = p.getY();
        double dis = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return dis;
    }
}

public class TALLER02 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        //variables locales
        int CentroCirculoX  = 0;
        int CentroCiruloY = 0 ;
        int Lado = 2;
        double RadioCirculo = 1.0;
        //creamos los contadores
        int acierto =0;
        int total =0;
        //creamos el scanner
        Scanner entrada = new Scanner(System.in);
        //pedimos la cantidad de iteraciones
        System.out.println("Ingrese la cantidad de interaciones\n");
        int iteracion = entrada.nextInt();
        // realizamos un ciclo para ver las distancias
        
        for(int i = 0 ; i <iteracion ; i++ ){
            //llamamos a la clase punto para el inicio del circulo
            Punto p = new Punto();
            // colocamos los puntos iniciales
            p.setX(CentroCirculoX);
            p.setY(CentroCiruloY);
            //llamamos a la clase punto para el punto aleatorio
            Punto p2 = new Punto();
            p2.setX((int) (Math.random() * 2)-1);
            p2.setY((int) (Math.random() * 2)-1);
            double Resultado = p.CalcularDistacia(p2);
            //ahora comparamos los valores con el radio
            if(Resultado< RadioCirculo){
                acierto++;
            }
              total++;
        }  // fin del for
        //mandamos los contadores por pantalla
         System.out.println("Numero de aciertos\n"+ acierto);
         System.out.println("Numero total\n"+ total);
         // ahora calulcar el pi
         double superior = acierto*Math.pow(Lado, 2);
         double inferior = total*Math.pow(RadioCirculo, 2);
         double pi= superior/inferior;
         System.out.println("El valor de pi es \n"+ pi);
    }  
}
