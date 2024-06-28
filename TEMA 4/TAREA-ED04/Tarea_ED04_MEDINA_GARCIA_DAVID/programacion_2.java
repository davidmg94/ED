package prog02_ejerc1;
/**
*
* @author Sandra
*/
public class PROG02_Ejerc1 {
public static void main(String[] args) {
/* En primer lugar, declaramos e inicializamos las variables.
Como el ejercicio
pide decimales las vamos a declarar como float.
*/
float C1=29;
float C2=19;
//El resultado de la ecuación será:
float x=-C2/C1;
//Imprimimos el resultado en pantalla:
System.out.printf("RESULTADO DE LA ECUACIÓN x = -C2/C1");
System.out.printf("\nx=-%.2f/%.2f=%.4f\n",C2,C1,x);
}
}