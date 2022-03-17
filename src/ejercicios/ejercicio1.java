package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

public static  void main(String[]args){
Scanner leer = new Scanner(System.in);

System.out.println("digite el precio de la computadora");
double precio= leer.nextDouble();

double valor_iva = iva_compra(precio);
double valor_rebaja = rebaja_compra(precio);

double total_compra = precio_compra(precio, valor_iva, valor_rebaja);

System.out.println("La rebaja del 15% es dos: " + valor_rebaja);
System.out.println("El iva de la compra es: " + valor_iva);
System.out.println("Elñ total de la compra es: " + total_compra);
    
}
    private static double precio_compra(double precio, double iva, double rebaja){
        double total = 0.0;
        total = (precio - rebaja) + iva;
        return total;
        
    }
    private static double iva_compra(double precio){
      double iva = 0.0;
      iva = (precio * 0.13);
      return iva;
    }

    private static double rebaja_compra(double precio){
        double rebaja = 0.0 ;
        rebaja = precio * 0.15;
        return rebaja;
        
    }
    }
