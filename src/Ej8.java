import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 10 numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();
        int [] numeros = {num1, num2, num3, num4, num5, num6, num7, num8, num9, num10};
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos = positivos + numeros[i];
            }else {
                negativos = negativos + numeros[i];
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
