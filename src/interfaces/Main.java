package interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
           
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Menu de Pagos ===");
        System.out.println("1.Pago con tarjeta");
        System.out.println("2.PAgo con efectivo");
        System.out.println("3.Pago con paypal");
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        switch(opcion){
            case 1->{
                System.out.println("Ingrese monto");
                double monto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese numero de tarjeta");
                String numero = sc.nextLine();
                Pagable p1 =  new Tarjeta(monto, numero);
                p1.pagar();
                
            }
            case 2->{
                System.out.println("Ingrese monto: ");
                double monto = sc.nextDouble();
                Pagable p2 = new Efectivo(monto);
                p2.pagar();
            }
            case 3->{
                System.out.println("Ingrese monto");
                double monto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese email: ");
                String email = sc.nextLine();
                Pagable p3 = new Paypal(monto, email);
                p3.pagar();        
            }
            
        }
    }
    
}
