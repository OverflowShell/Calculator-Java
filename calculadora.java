import java.util.Scanner;
import java.io.IOException;

public class calculadora {

  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
   float numero1,numero2,suma,resta,division, multiplicacion;
   int eleccion;
   System.out.print("\033[H\033[2J"); //limpiar linux
  // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //limpiar windows

   System.out.println("[1] Suma");
   System.out.println("[2] Resta");
   System.out.println("[3] Multiplicacion");
   System.out.println("[4] Division");
   System.out.println("[5] Salir");
   System.out.print("Elige la operacion con la que quieres trabajar: ");

   eleccion = teclado.nextInt();

   System.out.print("Digita el primer numero: ");
    numero1 = teclado.nextFloat();
    
    System.out.print("Digite el segundo numero: ");
    numero2 = teclado.nextFloat();

    if (eleccion == 1) {
      suma = numero1 + numero2;
      System.out.println("El resultado de la suma es: " + suma);
      }
    else if (eleccion == 2) {
      resta = numero1 - numero2;
      System.out.println("El resultado de la suma es: " + resta);
      }
    else if (eleccion == 3) {
     multiplicacion = numero1 * numero2;
     System.out.println("El resultado de la suma es: " + multiplicacion);
    }
    else if (eleccion == 4) {
      division = numero1 / numero2;
      System.out.println("El resultado de la suma es: " + division);
      }
    else if (eleccion == 5) {
     System.exit(0);
    }
    else {
      System.out.println("La opcion que has elegido no existe");
    }
  }
}
