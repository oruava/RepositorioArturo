import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        operacionesAritmeticas();
        ecuacionCuadratica();
    }

    public static void operacionesAritmeticas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        float numero1 = sc.nextFloat();
        System.out.println("Ingrese su segundo numero");
        float numero2 = sc.nextFloat();
        System.out.println(sumarNumeros(numero1,numero2));
        System.out.println(restarNumeros(numero1,numero2));
        System.out.println(multiplicarNumeros(numero1,numero2));
        System.out.println(dividirNumeros(numero1,numero2));
        numeroMayor(numero1,numero2);
        numeroMenor(numero1,numero2);
        System.out.println(calcularPotencia(numero1,numero2));
        System.out.println(calcularPorcentaje(numero1,numero2)+"%");
    }
    public static void ecuacionCuadratica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        float a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        float b = sc.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        float c = sc.nextFloat();
        while (a==0){
            System.out.println("El valor de a no puede ser 0, ingreselo nuevamente");
            a = sc.nextFloat();
        }
        System.out.println(ecuacion1(a,b,c));
        System.out.println(ecuacion2(a,b,c));
    }

    public static float sumarNumeros(float num1, float num2) {
        System.out.println("La suma de sus numeros es: ");
        return num1 + num2;
    }

    public static float restarNumeros(float num1, float num2) {
        System.out.println("La resta de sus numeros es: ");
        return num1 - num2;
    }

    public static float multiplicarNumeros(float num1, float num2) {
        System.out.println("La multiplicacion de sus numeros es: ");
        return num1 * num2;
    }

    public static double dividirNumeros(float num1, float num2) {
        Scanner sc = new Scanner(System.in);
        while (num2 == 0) {
            System.out.println("SYNTAX ERROR, ingrese el numero 2 nuevamente: ");
            num2 = sc.nextFloat();
        }
        System.out.println("La division de sus numeros es: ");
        return num1 / num2;
    }

    public static void numeroMayor(float num1, float num2) {
        if (num1 > num2) {
            System.out.println("El numero mayor es " + num1);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es " + num2);
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales, por lo cual ambos son los mayores");
        }

    }
    public static void numeroMenor(float num1, float num2) {
        if (num1 > num2) {
            System.out.println("El numero menor es " + num2);
        } else if (num2 > num1) {
            System.out.println("El numero menor es " + num1);
        } else if (num1 == num2) {
            System.out.println("Los numeros son iguales, por lo cual ambos son los mayores");
        }
    }
    public static float calcularPotencia(float num1, float num2){
        System.out.println("El "+ num1 + " elevado a "+ num2 +" es:");
        return (float) Math.pow(num1,num2);
    }
    public static float calcularPorcentaje(float num1, float num2){
        System.out.println(num1+ " con respecto a "+ num2 + " tiene un porcentaje de: ");
        return num1*100/num2;
    }
    public static double ecuacion1(double a, double b, double c){
        System.out.println("El primer valor de x es: ");
        return (-b+Math.sqrt((b*b)-(4*a*c)))/2*a ;
    }
    public static double ecuacion2(double a, double b, double c){
        System.out.println("El segundo valor de x es: ");
        return (-b-Math.sqrt((b*b)-(4*a*c)))/2*a ;
    }
}