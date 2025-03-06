/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
       
        probarRetirar (objetoCuenta, saldoActual, null);
        probarIngresar(objetoCuenta, saldoActual, null);

    
    }

    private static void probarIngresar(CCuenta objetoCuenta, double saldoActual, Object cantidadEsperada) {
        try {
            objetoCuenta.ingresar(saldoActual);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void probarRetirar (CCuenta objetoCuenta, double saldoActual, Object cantidadaEsperada) {
        try {
            objetoCuenta.retirar(saldoActual);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
