/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;
/**
 * Clase que crea una cuenta bancaria con las operaciones básicas
 * En ella podemos consultar el saldo, rirar e ingresar
 * @author Maria Pastor Nadal
*/

public class CCuenta {

    /** nombre del titular de la cuenta
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /** nombre del titular de la cuenta
     * @param nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Numero de cuenta bancaria
     * @return numero de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Establece el número de cuenta bancaria
     * @param cuenta numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

     /**
     * Obtiene el saldo disponible en la cuenta.
     * @return Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /** Establece el saldo de la cuenta
     * @param saldo saldo nuevo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

     /**
     * Obtiene el tipo de interés aplicado a la cuenta.
     * @return Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés aplicado a la cuenta.
     * 
     * @param tipoInterés Nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nombre Nombre del titular
     * @param cuenta Número de cuenta
     * @param saldo Saldo inicial
     * @param tipoInteres Tipo de interés
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con los parametros
     * @param nom nombre del titular
     * @param cue numero de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Consulta el estado de la cuenta, devolviendo el saldo actual.
     * @return Saldo disponible en la cuenta
     */
    public double estado(){
        return this.getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

     /**
     * Retira una cantidad de dinero de la cuenta.
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o si el saldo es insuficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception (ERRORCANTIDADNEGATIVA);
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Error para operaciones con cantidades negativas
     */
    private static final String ERRORCANTIDADNEGATIVA = "No se puede retirar una cantidad negativa";
}


    
   