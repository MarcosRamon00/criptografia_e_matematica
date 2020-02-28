
package mdc_algEuclides;

import java.util.Scanner;
import mdc_algEuclides.Mdc;


public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mdc numMdc = new Mdc();
        System.out.println("| Retorna o MDC de dois numeros interios atraves do algoritmo de euclides:");
        System.out.println("------------------------------------------");
        System.out.print("Primeiro numero: ");
        int x = Integer.parseInt(scan.nextLine());   
        System.out.print("Segundo numero: ");
        int y = Integer.parseInt(scan.nextLine());
        System.out.println("MDC =  " + numMdc.algEuclides(x, y));
    }
    
}
