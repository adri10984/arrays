import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        int [] numeros = {10, 34, 86, 8 , 19, 22};
        Scanner sc = new Scanner(System.in);
        int busqueda;
        boolean encontrado = false;
        int posicion = -1;
        System.out.println("Introduce el numero: ");
        busqueda = sc.nextInt();
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] == busqueda) {
                encontrado = true;
                posicion = i;
            }
        }
        if  (encontrado == true){
            System.out.println("El numero está en la posción: " + posicion);
        } else {
            System.out.println("El numero no está: " + posicion);
        }
    }
}
