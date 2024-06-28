package entornos.tema3;
        
/**
 * Clase que proporciona métodos genéricos (static)
 * para realizar diversas operaciones matemáticas.
 * 
 * @author acano
 * @version 1.3
 */

public class Calculador {

    /**
     * Devuelve el nº de cifras de un número entero.
     * 
     * @param num número positivo o negativo; también puede ser 0.
     * @return número de cifras que tiene el número pasado
     */
    public static int cuentaCifras(int num){
            int cifras=0;
            int aux;

            if (num==0){
                return 1;
            }

            if (num<0){
                // Si es negativo, obtengo el valor absoluto.
                aux = Math.abs(num);
            }
            else {
                aux = num;
            }

            // Hago divisones sucesivas entre 10
            while (aux>0) {
                aux = aux/10;
                cifras++;                
            }

            return cifras;

    } // Fin método
    
    /**
     * Calcula la <strong>potencia</strong> de un numero 
     * base elevado a un exponente.
     * 
     * @param base la base
     * @param expo el exponente
     * @return El resultado de base elevado a exponente. 
     * <p>
     * NOTA:
     * <ul>
     *   <li>Cualquier número diferente de cero elevado a cero es igual a uno.
     *   </li>
     *   <li>Cero elevado a cualquier exponente positivo es igual a cero
     *   </li>
     *   <li>Cero elevado a cero será 1 (aunque podría ser indeterminado, 
     *   ya que no hay consenso matemático).
     *   </li>
     * </ul>
     * 
     */
    public static int potencia(int base, int expo){
            int resul = 1;
            int cont = 0;

            while (cont<expo){
                resul = resul * base;
                cont++;
            }
            return resul;

    } // Fin método
}