import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la posición a eliminar");
        int numR = sc.nextInt();
        if (numR >numeros.length){
            System.out.println("Vuelve a ingresar el numero");
            numR = sc.nextInt();
        } else {
            for (int i = numR; i < numeros.length - 1; i++) { //Esto quita el numero de la posicion indicada
                numeros[i] = numeros[i + 1]; // El numero de atras se adelanta
            }
            numeros[numeros.length-1] = 0; //El ultimo numero pasa a 0
            System.out.println(Arrays.toString(numeros));
        }
    }
    }

