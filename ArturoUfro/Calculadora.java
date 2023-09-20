import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        operacionesAritmeticas();


    }

    public static void operacionesAritmeticas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        float numero1 = sc.nextFloat();
        System.out.println("Ingrese su segundo numero");
        float numero2 = sc.nextFloat();
        menuOperacionesAritmeticas(numero1,numero2);
    }
    public static void menuOperacionesAritmeticas(float numero1, float numero2){
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean condicion = true;

        while(condicion) {
            System.out.println("Menú:");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.println("5. Mostrar el numero mayor");
            System.out.println("6. Mostrar el numero menor");
            System.out.println("7. Calcular el primer numero elevado al segundo");
            System.out.println("8. Calcular el porcentaje del primer numero respecto al segundo");
            System.out.println("9. Retroceder");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if(opcion==1){
                System.out.println(sumarNumeros(numero1,numero2));
            }
            else if(opcion==2){
                System.out.println(restarNumeros(numero1,numero2));
            }
            else if(opcion==3){
                System.out.println(multiplicarNumeros(numero1,numero2));
            }
            else if(opcion==4){
                System.out.println(dividirNumeros(numero1,numero2));
            }
            else if(opcion==5){
                numeroMayor(numero1,numero2);
            }
            else if(opcion==6){
                numeroMenor(numero1,numero2);
            }
            else if(opcion==7){
                System.out.println(calcularPotencia(numero1,numero2));
            }
            else if(opcion==8){
                System.out.println(calcularPorcentaje(numero1,numero2)+"%");
            }
            else if(opcion==9){
                break;
            }
            else{
                System.out.println("Opcion no valida");
            }
        }
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
    public static void sistemaEcuaciones(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los valores para resolver el sistema de ecuaciones de 2 variables con forma: ");
        System.out.println("ax + by = c");
        System.out.println("dx + ey = f");
        System.out.println("Ingrese el valor de a: ");
        double a = sc.nextFloat();
        System.out.println("Ingrese el valor de b: ");
        double b = sc.nextFloat();
        System.out.println("Ingrese el valor de c: ");
        double c = sc.nextFloat();
        System.out.println("Ingrese el valor de d: ");
        double d = sc.nextFloat();
        System.out.println("Ingrese el valor de e: ");
        double e = sc.nextFloat();
        System.out.println("Ingrese el valor de f: ");
        double f = sc.nextFloat();
        while (a==0){
            System.out.println("El valor de a no puede ser 0, ingreselo nuevamente");
            a = sc.nextFloat();
        }
        while (b==0) {
            System.out.println("El valor de b no puede ser 0, ingreselo nuevamente");
            b = sc.nextFloat();
        }
        while (d==0) {
            System.out.println("El valor de d no puede ser 0, ingreselo nuevamente");
            d = sc.nextFloat();
        }
        while (e==0){
            System.out.println("El valor de e no puede ser 0, ingreselo nuevamente");
            e = sc.nextFloat();
        }
        System.out.println("El valor del determinante es: ");
        System.out.println(determinante(a,b,c,d,e,f));
        resultadoSistemaEcuaciones(a,b,c,d,e,f,determinante(a,b,c,d,e,f));
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
        System.out.println("Tiene un porcentaje de: ");
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
    public static double determinante(double a, double b, double c, double d, double e, double f){
        return a*e - b*d;
    }
    public static double valorX(double a, double b, double c, double d, double e, double f, double determinante){
        return (c*e - b*f)/determinante;
    }
    public static double valorY(double a, double b, double c, double d, double e, double f, double determinante) {
        return (a * f - c * d) / determinante;
    }
    public static void resultadoSistemaEcuaciones(double a,double b, double c, double d, double e, double f, double determinante){
        if (determinante==0){
            System.out.println("El sistema tiene infinitas soluciones");
        }
        else if (determinante<0){
            System.out.println("El sistema no tiene solucion en los reales");
        }
        else if (determinante>0){
            System.out.println("El valor de x es de: ");
            System.out.println(valorX(a,b,c,d,e,f,determinante(a,b,c,d,e,f)));
            System.out.println("El valor de y es de: ");
            System.out.println(valorY(a,b,c,d,e,f,determinante(a,b,c,d,e,f)));
        }

    }
}