import java.util.Scanner;

public class SumaIgual {
    public static void main(String[] args) {
        int [] numeros = {2, 3, 4, 5, 6, 7, 8, 10, 20};
        int suma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero: ");
        suma = sc.nextInt();
        for (int i=0; i<numeros.length; i++){
            for (int j=i+1; j<numeros.length; j++){
                if (suma==numeros[i]+numeros[j]){
                    System.out.println("El valor del numero es: " + numeros[i] + " + " +numeros[j] + " = " + suma);
                }
            }
        }
    }
}
