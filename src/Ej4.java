import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {
        int[] notas = {6, 7, 8, 4, 6, 7, 2, 5, 9, 10};
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
        System.out.println("La media es " + suma / notas.length);


    }
}
