package entornos.tema3;

import java.util.Scanner;

/**
 * Aplicación que realiza varios cálculos simples, invocando a métodos
 * de la Clase Calculador.
 * 
 * @author acano
 * @version 1.3
 * 
 */
public class Tarea3Main {

      
    /**
     * Utilidad para pedir números enteros, recibiendo el mensaje que se quiera mostrar en cada caso.
     * @param mensaje es el mensaje que se quiera mostrar. Así vale para muchos casos diferentes.
     * @return devuelve el número leído por teclado.
     */
    public static int pedirNumeroEntero(String mensaje){
        Scanner teclado = new Scanner(System.in);
        int dato;
        System.out.println(mensaje);
        dato = teclado.nextInt();
        return dato;
    }
    
    public static void main(String[] args) {

        System.out.println("I N I C I O     D E    E J E C U C I Ó N");
        System.out.println("----------------------------------------");
        System.out.println("--VAMOS A CONTAR CIFRAS--");
        // LLamo al método pedirNumeroEntero, utilidad para este fin.
        int num = pedirNumeroEntero("Introduce el número entero:");
        int numDigitos = Calculador.cuentaCifras(num);
        System.out.printf("Nº dígitos del valor %d es %d %n\n",num, numDigitos);
        System.out.println("Ahora vamos a contar las cifras del \nentero más grande que permite Java.\n");
        //ahora hacemos una prueba con el entero más alto que permite Java.
        num = Integer.MAX_VALUE;
        numDigitos = Calculador.cuentaCifras(num);
        System.out.printf("Nº dígitos del valor %d es %d %n\n",num, numDigitos);

        System.out.println("--VAMOS A CALCULAR POTENCIAS--");
        
        // LLamo al método potencia
        int base,expo;
        base = pedirNumeroEntero("Inroduce el valor de la base:");
        expo = pedirNumeroEntero("Introduce el valor del exponente:");
        int resul = Calculador.potencia(base, expo);
        System.out.printf("El resultado de %d elevado a %d = %d %n\n",base, expo,resul);
        
        System.out.println("F I N      D E      E J E C U C I Ó N");

        System.out.println("-------------------------------------");
    }
    
}
