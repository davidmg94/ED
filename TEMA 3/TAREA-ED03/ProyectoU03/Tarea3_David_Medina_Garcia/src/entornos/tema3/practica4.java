package entornos.tema3;

import java.util.Scanner;    

public static double pedirCantidad(String mensaje){
        Scanner teclado = new Scanner(System.in);
        double num;
        System.out.println(mensaje);
        num = teclado.nextDouble();
        return num;
    }
    /**
     * Metodo de las operaciones a realizar en la cuenta
     * @param cuenta1
     * @param cantidad
     */
    private static void operativa_cuenta(cuentas.clientes.Cuenta cuenta1, float cantidad) {
        try {
            System.out.println("Retirada de cuenta");
            double num = pedirCantidad("Introduce cantidad a retirar:");
            cuenta1.retirar(num);
            System.out.println("El saldo actual es: "+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            double num = pedirCantidad("Introduce cantidad a ingresar:");
            cuenta1.ingresar(num);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}

package cuentas.clientes;
/**
 *
 * @author David Medina Garcia
 * @version 2.1.3
 * @since 1.0.0
 */
public class Main {
    /**
     * Metodo para establecer los datos de la cuenta
     * @param args Recibe los datos introducidos en la linea de comando
     */
    public static void main(String[] args) {
        Cuenta cuenta1;
        double saldoActual;

        cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ cuenta1.estado() );

        operativa_cuenta(cuenta1, 0);
    }
    /**
     * Metodo de las operaciones a realizar en la cuenta
     * @param cuenta1
     * @param cantidad
     */
    private static void operativa_cuenta(Cuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
package cuentas.clientes;

/**
 * Clase sirve para almacenar datos de la cuenta bancaria
 * @author David Medina Garcia
 * @version 2.1.3
 * @since 1.0.0
 */
public class Cuenta {
 
    /**
     * Metodo para obtener el nombre de la cuenta
     * @return devuelve el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para establecer el nombre de la cuenta
     * @param nombre nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el numero de la cuenta
     * @return devuelve el numero de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo para establecer el numero de la cuenta
     * @param cuenta numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
 
    /**
     * Metodo para obtener el saldo de la cuenta
     * @return devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo para establecer el saldo de la cuenta
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo para obtener el tipo de interes de la cuenta
     * @return devuelve el tipo de interes de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo para establecer el tipo de interes de la cuenta
     * @param tipoInteres tipo de interes de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
   
    //Propiedades de la clase cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Valores por defecto de las variables
     */
    public Cuenta()
    {
        nombre ="";
        cuenta="";
        saldo=0;
        tipoInteres=0;
    }
 
    /**
     * Metodo para acortar los nombres de las variables
     * @param nom nombre del titular de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public Cuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }

    /**
     * Metodo para saber el saldo de la cuenta
     * @return devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para ingresar una cantidad en la cuenta
     * @param cantidad cantidad introducida a ingresar
     * @throws Exception arroja una excepcion se la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar una cantidad en la cuenta
     * @param cantidad cantidad introducida a ingresar
     * @throws Exception arroja una excepcion se la cantidad a retirar es negativa o cero
     * o si es superior al saldo disponible en la cuenta (estado)a
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}