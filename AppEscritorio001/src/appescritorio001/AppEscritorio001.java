/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appescritorio001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Eric
 */
public class AppEscritorio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int Opccion;
        double numero1;
        double numero2;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Operación a realizar");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        Opccion = Integer.parseInt(teclado.readLine());
        System.out.println("Leer Primer Numero");
        numero1 = Double.parseDouble(teclado.readLine());
        System.out.println("Leer Segundo Numero");
        numero2 = Double.parseDouble(teclado.readLine());
        switch (Opccion) {
            case 1:
                  System.out.println("RESULTADO: "+opSumar(numero1,numero2));
                break;
            case 2:
                  System.out.println("RESULTADO: "+opRestar(numero1,numero2));
                break;
            case 3:
                  System.out.println("RESULTADO: "+opMultiplicar(numero1,numero2));
                break;
            case 4:
                  System.out.println("RESULTADO: "+opDividir(numero1,numero2));
                break;
        }

        // TODO code application logic here
    }

    private static double opDividir(double numero1, double numero2) {
        appescritorio001.CalculadoraWS_Service service = new appescritorio001.CalculadoraWS_Service();
        appescritorio001.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opDividir(numero1, numero2);
    }

    private static double opMultiplicar(double numero1, double numero2) {
        appescritorio001.CalculadoraWS_Service service = new appescritorio001.CalculadoraWS_Service();
        appescritorio001.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opMultiplicar(numero1, numero2);
    }

    private static double opRestar(double numero1, double numero2) {
        appescritorio001.CalculadoraWS_Service service = new appescritorio001.CalculadoraWS_Service();
        appescritorio001.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opRestar(numero1, numero2);
    }

    private static double opSumar(double numero1, double numero2) {
        appescritorio001.CalculadoraWS_Service service = new appescritorio001.CalculadoraWS_Service();
        appescritorio001.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.opSumar(numero1, numero2);
    }

}
