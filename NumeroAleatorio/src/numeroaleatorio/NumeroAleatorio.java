package numeroaleatorio;
import java.util.*;

public class NumeroAleatorio {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int numeroAleatorio = (int) ((Math.random() * 100)+1); // Número aleatorio de 1 a 100. a
    int numIntro; // Número introducido por el usuario. b
    int contador; // Contador para bucle for. i

    System.out.println("Adivina el numero del 1 al 100\n solo 5 oportunidades");

    numIntro= sc.nextInt();

    for (contador=0; contador<=4; contador++) { 
        if (numeroAleatorio == numIntro) {  
            System.out.println("Ganaste"); 
        break;
        } 
        else if (contador == 4) { 
            System.out.println("Perdiste, el número era el: " + numeroAleatorio); 
        break;
        } 
        else if (numeroAleatorio > numIntro) 
            System.out.println("El número secreto es MAYOR que " + numIntro);
        else if (numeroAleatorio < numIntro)
            System.out.println("El número secreto es MENOR que " + numIntro);
        if (contador <=1) { 
            System.out.print("siguiente intento: "); 
            numIntro = sc.nextInt(); } 
        else if (contador ==2) { 
            System.out.print("Inténtalo de nuevo: ");
            numIntro = sc.nextInt(); } 
        else if (contador >= 3) {
            System.out.print("ultimo intento: ");
            numIntro = sc.nextInt(); }
        }
    }
}